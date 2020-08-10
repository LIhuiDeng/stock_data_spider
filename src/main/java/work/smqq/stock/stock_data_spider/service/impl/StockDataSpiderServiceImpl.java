package work.smqq.stock.stock_data_spider.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.StringUtils;

import work.smqq.stock.stock_data_spider.common.model.StockPageInfo;
import work.smqq.stock.stock_data_spider.dao.CollectedStockMapper;
import work.smqq.stock.stock_data_spider.dao.StockBusinessMapper;
import work.smqq.stock.stock_data_spider.dao.StockFinanceReportMapper;
import work.smqq.stock.stock_data_spider.dao.StockHistoryMapper;
import work.smqq.stock.stock_data_spider.dao.StockMapper;
import work.smqq.stock.stock_data_spider.external_interface_proxy.handlers.EastMoneyApi;
import work.smqq.stock.stock_data_spider.external_interface_proxy.handlers.WangyiApi;
import work.smqq.stock.stock_data_spider.model.CollectedStock;
import work.smqq.stock.stock_data_spider.model.CollectedStockExample;
import work.smqq.stock.stock_data_spider.model.Stock;
import work.smqq.stock.stock_data_spider.model.StockExample;
import work.smqq.stock.stock_data_spider.model.StockFilter;
import work.smqq.stock.stock_data_spider.model.StockFinanceReport;
import work.smqq.stock.stock_data_spider.model.StockFinanceReportExample;
import work.smqq.stock.stock_data_spider.model.StockHistory;
import work.smqq.stock.stock_data_spider.model.StockHistoryExample;
import work.smqq.stock.stock_data_spider.model.StockHistoryExample.Criteria;
import work.smqq.stock.stock_data_spider.model.StockVo;
import work.smqq.stock.stock_data_spider.service.StockDataSpiderService;
import work.smqq.stock.stock_data_spider.util.Underline2Camel;
@Service
public class StockDataSpiderServiceImpl implements StockDataSpiderService {
	Logger log = LoggerFactory.getLogger(StockDataSpiderServiceImpl.class);
	@Resource(name = "eastMoneyApi")
	private EastMoneyApi eastMoneyApi;
	@Resource(name= "wangyiApi")
	private WangyiApi wangyiApi;
	private String[] boardCodeArray = new String[] { "sh_a_board", "sz_a_board", "gem_board", "kcb_board" };
	private String[] boardNameArray = new String[] { "上证A", "深证A", "创业板", "科创板" };
	private String[] boardUrlCodeArray = new String[] { "m:1+t:2", "m:0+t:6,m:0+t:13", "m:0+t:80",
			"m:1+t:23" };
	@Resource
	private StockHistoryMapper stockHistoryMapper;
	@Autowired
	private StockMapper stockMapper;
	private boolean syncingStockData = false;
	private boolean syncingStockFinance = false;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private StockBusinessMapper stockBusinessMapper;
	@Autowired
	private StockFinanceReportMapper stockFinanceReportMapper;
	@Autowired
	private CollectedStockMapper collectedStockMapper;
	@Override
	public void syncStockData() {
		if(syncingStockData) {
			log.info("数据已经在同步中，不能重复执行同步任务");
			return;
		}
		syncingStockData = true;
		int pageSize = 100;
		String sql = "select max(trade_date) from tb_stock_history";
		List<String> resultList = this.jdbcTemplate.query(sql, new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString(1);
			}
		});
		
		for (int j = 0; j < boardUrlCodeArray.length; j++) {
			StockPageInfo pageInfo = eastMoneyApi.getStockPageInfo(1, 5, boardUrlCodeArray[j]);
			List<StockHistory> stockList = pageInfo.getStockList();
			int sameYesterdayPriceStockInfoNum = 0;
			int samePriceNowStockInfoNum = 0;
			for (StockHistory stock : stockList) {
				StockHistoryExample example = new StockHistoryExample();
				Criteria criteria = example.createCriteria();
				if(resultList.size() > 0) {
					criteria.andTradeDateEqualTo(resultList.get(0));
				} 
				criteria.andStockCodeEqualTo(stock.getStockCode());
				criteria.andPriceFinishYesterdayEqualTo(stock.getPriceFinishYesterday());
				List<StockHistory> tmpStockList = stockHistoryMapper.selectByExample(example);
				sameYesterdayPriceStockInfoNum += tmpStockList.size();
				criteria.andPriceNowEqualTo(stock.getPriceNow());
				tmpStockList = stockHistoryMapper.selectByExample(example);
				samePriceNowStockInfoNum += tmpStockList.size();

			}
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String nowDate = df.format(new Date());
			if (sameYesterdayPriceStockInfoNum == 5 && samePriceNowStockInfoNum == 5) {
				log.info("{}:收盘价和开盘价一致，不进行数据更新",boardNameArray[j]);
			} else {
				log.info("同步{}的数据",boardNameArray[j]);
				int total = pageInfo.getTotal();
				int pageTotal = (int) Math.ceil((double) total / pageSize);
				for (int i = 0; i < pageTotal; i++) {
					pageInfo = eastMoneyApi.getStockPageInfo(i + 1, pageSize, boardUrlCodeArray[j]);
					stockList = pageInfo.getStockList();
					if (stockList == null) {
						continue;
					}
					log.info("获取到{}条数据，开始更新数据！", stockList.size());
					for (StockHistory stockHistory : stockList) {
						stockHistory.setBoardCode(boardCodeArray[j]);
						stockHistory.setBoardName(boardNameArray[j]);
						Stock stock = new Stock();
						BeanUtils.copyProperties(stockHistory, stock);
						Stock stockSelect = stockMapper.selectByPrimaryKey(stock.getStockCode());
						if(stockSelect != null) {
							stockMapper.updateByPrimaryKeySelective(stock);
						} else {
							stockMapper.insertSelective(stock);
						}
						if (sameYesterdayPriceStockInfoNum == 5 && samePriceNowStockInfoNum < 5) {
							StockHistoryExample example = new StockHistoryExample();
							Criteria criteria = example.createCriteria();
							criteria.andStockCodeEqualTo(stockHistory.getStockCode());
							criteria.andTradeDateEqualTo(nowDate);
							stockHistory.setTradeDate(nowDate);
							stockHistoryMapper.updateByExampleSelective(stockHistory, example);
							log.debug("更新股票信息:{}", JSON.toJSONString(stockHistory));
						} else if (sameYesterdayPriceStockInfoNum < 5) {
							stockHistory.setTradeDate(nowDate);
							try {
								stockHistoryMapper.insertSelective(stockHistory);
							} catch(Exception e) {
								log.error(e.getMessage());
							}
							log.debug("插入股票信息:{}", JSON.toJSONString(stockHistory));
						}
					}
					
				}
			} 
		}
		syncingStockData = false;;
	}
	public void syncStockHistory() {
		StockExample example = new StockExample();
		List<Stock> stockList = stockMapper.selectByExample(example);
		for(Stock stock:stockList) {
			String stockCode = stock.getStockCode();
			if("sz_a_board".equals(stock.getBoardCode())) {
				stockCode = "1" + stockCode;
			} else {
				stockCode = "0" + stockCode;
			} 
			List<StockHistory> stockHistoryList = this.wangyiApi.getStockHistory("2007-01-01", "2020-07-18", stockCode);
			if(stockHistoryList.size() == 0) {
				log.info("{}的数据为0条,请检查",stockCode);
			}
			for(StockHistory stockHistory:stockHistoryList) {
				try {
					stockHistoryMapper.insert(stockHistory);
				} catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	@Override
	public void syncStockFinanceReport() {
		if(this.syncingStockFinance) {
			log.info("数据已经在同步中，不能重复执行同步任务");
			return;
		}
		this.syncingStockFinance = true;
		StockExample example = new StockExample();
		List<Stock> stockList = stockMapper.selectByExample(example);
		for(Stock stock:stockList) {
			log.info("同步{}的财务数据", stock.getStockCode());
			List<StockFinanceReport> reports = eastMoneyApi.getDupontAnalysis(stock.getStockCode(), stock.getBoardCode());
			if(reports.size() > 0) {
				StockFinanceReport recentReport = reports.get(0);
				Stock updateStock = new Stock();
				updateStock.setRoa(recentReport.getRoa());
				updateStock.setRoe(recentReport.getRoe());
				updateStock.setStockCode(stock.getStockCode());
				updateStock.setAssetLiabilityRatio(recentReport.getAssetLiabilityRatio());
				updateStock.setFinanceReportDate(recentReport.getReportDate());
				stockMapper.updateByPrimaryKeySelective(updateStock);
				for(StockFinanceReport report:reports) {
					StockFinanceReportExample reportExample = new StockFinanceReportExample();
					reportExample.createCriteria().andReportDateEqualTo(report.getReportDate()).andStockCodeEqualTo(stock.getStockCode());
					List<StockFinanceReport> tmpReportList = stockFinanceReportMapper.selectByExample(reportExample);
					if(tmpReportList.size() == 0) {
						stockFinanceReportMapper.insert(report);
					} else {
						stockFinanceReportMapper.updateByExample(report, reportExample);
					}
				}
			}
			log.info("{}的财务数据同步成功，共计{}条", stock.getStockCode(), reports.size());
		}
		this.syncingStockFinance = false;
	}
	@Override
	public PageInfo<StockVo> getPagedStockList(StockFilter stockFilter) {
		PageHelper.startPage(stockFilter.getPageNum(), stockFilter.getPageSize());
		stockFilter.setSortProp(Underline2Camel.camel2Underline(stockFilter.getSortProp()).toLowerCase());
		stockFilter.setSortOrder("descending".equals(stockFilter.getSortOrder())?"desc":"asc");
		stockFilter.getNumberWordFilterList().forEach((e) -> {
			e.setWord(Underline2Camel.camel2Underline(e.getWord()));
		});
		Page<Stock> page = (Page<Stock>) stockBusinessMapper.getStockList(stockFilter);
		
		List<StockVo> stockList = page.getResult().parallelStream().map( e -> {
			CollectedStockExample example = new CollectedStockExample();
			example.createCriteria().andStockCodeEqualTo(e.getStockCode());
			List<CollectedStock> collectedStockList = collectedStockMapper.selectByExample(example);
			StockVo stockVo = new StockVo();
			BeanUtils.copyProperties(e, stockVo);
			if(collectedStockList.size() > 0) {
				stockVo.setCollected(true);
				stockVo.setRemark(collectedStockList.get(0).getRemark());
			} else {
				stockVo.setCollected(false);
			}
			return stockVo;
		}).collect(Collectors.toList());
		PageInfo<StockVo> pageInfo = new PageInfo(page);
		pageInfo.setList(stockList);
		return pageInfo;
	}
	public List<StockHistory> getStockHistory(String startDate, String endDate, String stockCode) {
		StockHistoryExample example = new StockHistoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andTradeDateBetween(startDate, endDate);
		criteria.andStockCodeEqualTo(stockCode);
		List<StockHistory> stockHistoryList = stockHistoryMapper.selectByExample(example);
		return stockHistoryList;
	}
	@Override
	public List<StockFinanceReport> getFinanceReportList(String stockCode) {
		StockFinanceReportExample example = new StockFinanceReportExample();
		example.createCriteria().andStockCodeEqualTo(stockCode);
		List<StockFinanceReport> stockFinanceReportList = stockFinanceReportMapper.selectByExample(example);
		return stockFinanceReportList;
	}
	@Override
	public void collectStock(String stockCode, String remark) {
		CollectedStockExample example = new CollectedStockExample();
		example.createCriteria().andStockCodeEqualTo(stockCode);
		List<CollectedStock> collectedStockList = collectedStockMapper.selectByExample(example);
		CollectedStock record = new CollectedStock();
		record.setCollectTime(new Date());
		record.setStockCode(stockCode);
		record.setRemark(remark);
		if(collectedStockList.size() == 0) {
			collectedStockMapper.insert(record );
		} else {
			collectedStockMapper.updateByExample(record, example);
		}
	}
	@Override
	public void uncollectStock(String stockCode) {
		CollectedStockExample example = new CollectedStockExample();
		example.createCriteria().andStockCodeEqualTo(stockCode);
		collectedStockMapper.deleteByExample(example);
	}
	@Override
	public void analysis() {
		StockExample example = new StockExample();
		List<Stock> stockList = stockMapper.selectByExample(example);
		for(Stock stock:stockList) {
			if(stock.getRoa() != null && stock.getPe() != null && stock.getPb() != null && stock.getAssetLiabilityRatio() != null) {
				Stock updateRecord = new Stock();
				updateRecord.setStockCode(stock.getStockCode());
				if(stock.getRoa() < 0) {
					updateRecord.setFinanceScore(0f);
				} else {
					float score = 100 * 100 * stock.getRoa()/(stock.getPb() * stock.getPe() * stock.getAssetLiabilityRatio());
					updateRecord.setFinanceScore(score);
				}
				stockMapper.updateByPrimaryKeySelective(updateRecord);
			}
			
		}
		
	}
}
