package work.smqq.stock.stock_data_spider.controller;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import work.smqq.stock.stock_data_spider.common.model.StockPageInfo;
import work.smqq.stock.stock_data_spider.model.NumberWordFilter;
import work.smqq.stock.stock_data_spider.model.ResponseResult;
import work.smqq.stock.stock_data_spider.model.Stock;
import work.smqq.stock.stock_data_spider.model.StockFilter;
import work.smqq.stock.stock_data_spider.model.StockFinanceReport;
import work.smqq.stock.stock_data_spider.model.StockHistory;
import work.smqq.stock.stock_data_spider.model.StockVo;
import work.smqq.stock.stock_data_spider.service.StockDataSpiderService;

import java.util.List;

import javax.annotation.Resource;

@RestController
@RequestMapping(value="stockDataSpiderController")
@Api("股票信息爬取接口")
public class StockDataSpiderController {
    @Autowired
	private StockDataSpiderService stockDataSpiderService;
    @RequestMapping(value="startSyncDataTask", method= { RequestMethod.GET})
    public ResponseResult<String> startSyncDataTask() {
    	ResponseResult<String> responseResult = new ResponseResult<>();
    	responseResult.setMessage("任务启动成功");
    	responseResult.setSuccess(true);
    	new Thread(new Runnable() {
			@Override
			public void run() {
				stockDataSpiderService.syncStockData();
			}
    	}).start();;
    	return responseResult;
    }
    @RequestMapping(value="startSyncStockHistoryDataTask", method= { RequestMethod.GET})
    public ResponseResult<String> startSyncStockHistoryDataTask() {
    	ResponseResult<String> responseResult = new ResponseResult<>();
    	responseResult.setMessage("任务启动成功");
    	responseResult.setSuccess(true);
    	new Thread(new Runnable() {
			@Override
			public void run() {
				stockDataSpiderService.syncStockHistory();
			}
    	}).start();;
    	return responseResult;
    }
    @RequestMapping(value="startSyncStockFinanceReportTask", method= { RequestMethod.GET})
    public ResponseResult<String> syncStockFinanceReport() {
    	ResponseResult<String> responseResult = new ResponseResult<>();
    	responseResult.setMessage("任务启动成功");
    	responseResult.setSuccess(true);
    	new Thread(new Runnable() {
			@Override
			public void run() {
				stockDataSpiderService.syncStockFinanceReport();
			}
    	}).start();;
    	return responseResult;
    }
    @RequestMapping(value="getPagedStockList", method= { RequestMethod.GET, RequestMethod.POST})
    public ResponseResult<PageInfo<StockVo>> getPagedStockList(@RequestBody StockFilter stockFilter) {
    	PageInfo<StockVo> pageInfo = stockDataSpiderService.getPagedStockList(stockFilter);
    	ResponseResult<PageInfo<StockVo>> responseResult = new ResponseResult<>();
    	responseResult.setSuccess(true);
    	responseResult.setData(pageInfo);
    	return responseResult;
    }
    @RequestMapping(value="getStockHistory", method= { RequestMethod.GET, RequestMethod.POST})
    public ResponseResult<List<StockHistory>> getStockHistory(String startDate, String endDate, String stockCode) {
    	ResponseResult<List<StockHistory>> result = new ResponseResult<>();
    	result.setSuccess(true);
    	result.setData(stockDataSpiderService.getStockHistory(startDate, endDate, stockCode));
    	return result;
    }
    @RequestMapping(value="getStockFinanceReportList", method = {RequestMethod.GET})
    public ResponseResult<List<StockFinanceReport>> getFinanceReportList(String stockCode) {
    	ResponseResult<List<StockFinanceReport>> responseResult = new ResponseResult<>();
    	responseResult.setSuccess(true);
    	responseResult.setData(stockDataSpiderService.getFinanceReportList(stockCode));
    	return responseResult;
    }
    @RequestMapping(value="collectStock", method = {RequestMethod.GET})
    public ResponseResult collectStock(String stockCode, String remark) {
    	ResponseResult responseResult = new ResponseResult<>();
    	responseResult.setSuccess(true);
    	stockDataSpiderService.collectStock(stockCode, remark);
    	return responseResult;
    }
    @RequestMapping(value="uncollectStock", method = {RequestMethod.GET})
    public ResponseResult uncollectStock(String stockCode) {
    	ResponseResult responseResult = new ResponseResult<>();
    	responseResult.setSuccess(true);
    	stockDataSpiderService.uncollectStock(stockCode);
    	return responseResult;
    }
    @RequestMapping(value="analysis", method = {RequestMethod.GET})
    public ResponseResult analysis() {
    	ResponseResult responseResult = new ResponseResult<>();
    	responseResult.setSuccess(true);
    	stockDataSpiderService.analysis();
    	return responseResult;
    }
    
}
