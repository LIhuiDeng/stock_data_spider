package work.smqq.stock.stock_data_spider.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import work.smqq.stock.stock_data_spider.model.Stock;
import work.smqq.stock.stock_data_spider.model.StockExample;

public interface StockMapper {
    long countByExample(StockExample example);

    int deleteByExample(StockExample example);

    int deleteByPrimaryKey(String stockCode);

    int insert(Stock record);

    int insertSelective(Stock record);

    List<Stock> selectByExample(StockExample example);

    Stock selectByPrimaryKey(String stockCode);

    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}