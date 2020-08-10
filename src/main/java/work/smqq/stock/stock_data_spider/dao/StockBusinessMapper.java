package work.smqq.stock.stock_data_spider.dao;

import java.util.List;
import java.util.Map;

import work.smqq.stock.stock_data_spider.model.Stock;
import work.smqq.stock.stock_data_spider.model.StockFilter;

public interface StockBusinessMapper {
	List<Stock> getStockList(StockFilter stockFilter);
}
