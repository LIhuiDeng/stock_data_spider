package work.smqq.stock.stock_data_spider.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import work.smqq.stock.stock_data_spider.model.StockHistory;
import work.smqq.stock.stock_data_spider.model.StockHistoryExample;

public interface StockHistoryMapper {
    long countByExample(StockHistoryExample example);

    int deleteByExample(StockHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockHistory record);

    int insertSelective(StockHistory record);

    List<StockHistory> selectByExample(StockHistoryExample example);

    StockHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockHistory record, @Param("example") StockHistoryExample example);

    int updateByExample(@Param("record") StockHistory record, @Param("example") StockHistoryExample example);

    int updateByPrimaryKeySelective(StockHistory record);

    int updateByPrimaryKey(StockHistory record);
}