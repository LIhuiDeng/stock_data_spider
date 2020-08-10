package work.smqq.stock.stock_data_spider.service;

import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import work.smqq.stock.stock_data_spider.model.Stock;
import work.smqq.stock.stock_data_spider.model.StockFilter;
import work.smqq.stock.stock_data_spider.model.StockFinanceReport;
import work.smqq.stock.stock_data_spider.model.StockHistory;
import work.smqq.stock.stock_data_spider.model.StockVo;

public interface StockDataSpiderService {
	void syncStockData();

	void syncStockHistory();
	
	PageInfo<StockVo> getPagedStockList(StockFilter stockFilter);
	
	List<StockHistory> getStockHistory(String startDate, String endDate, String stockCode);

	void syncStockFinanceReport();

	List<StockFinanceReport> getFinanceReportList(String stockCode);

	void collectStock(String stockCode, String remark);

	void uncollectStock(String stockCode);

	void analysis();
	
}
