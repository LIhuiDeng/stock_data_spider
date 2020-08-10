package work.smqq.stock.stock_data_spider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("work.smqq.stock.stock_data_spider.dao")
public class StockDataSpiderApp {
	public static void main(String[] args) {
		SpringApplication.run(StockDataSpiderApp.class, args);
	}
}
