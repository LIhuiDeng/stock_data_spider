package work.smqq.stock.stock_data_spider.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import work.smqq.stock.stock_data_spider.model.StockFinanceReport;
import work.smqq.stock.stock_data_spider.model.StockFinanceReportExample;

public interface StockFinanceReportMapper {
    long countByExample(StockFinanceReportExample example);

    int deleteByExample(StockFinanceReportExample example);

    int insert(StockFinanceReport record);

    int insertSelective(StockFinanceReport record);

    List<StockFinanceReport> selectByExample(StockFinanceReportExample example);

    int updateByExampleSelective(@Param("record") StockFinanceReport record, @Param("example") StockFinanceReportExample example);

    int updateByExample(@Param("record") StockFinanceReport record, @Param("example") StockFinanceReportExample example);
}