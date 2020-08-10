package work.smqq.stock.stock_data_spider.common.model;

import java.util.List;
import work.smqq.stock.stock_data_spider.model.StockHistory;
public class StockPageInfo {
    private int total;
    private List<StockHistory> stockList;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<StockHistory> getStockList() {
        return stockList;
    }

    public void setStockList(List<StockHistory> stockList) {
        this.stockList = stockList;
    }
}
