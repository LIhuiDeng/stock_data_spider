package work.smqq.stock.stock_data_spider.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import work.smqq.stock.stock_data_spider.model.CollectedStock;
import work.smqq.stock.stock_data_spider.model.CollectedStockExample;

public interface CollectedStockMapper {
    long countByExample(CollectedStockExample example);

    int deleteByExample(CollectedStockExample example);

    int insert(CollectedStock record);

    int insertSelective(CollectedStock record);

    List<CollectedStock> selectByExample(CollectedStockExample example);

    int updateByExampleSelective(@Param("record") CollectedStock record, @Param("example") CollectedStockExample example);

    int updateByExample(@Param("record") CollectedStock record, @Param("example") CollectedStockExample example);
}