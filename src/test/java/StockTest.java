import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import work.smqq.stock.stock_data_spider.service.StockDataSpiderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockTest {
	@Autowired 
	private StockDataSpiderService stockDataSpiderService;
	@Test
	public void test() {
		stockDataSpiderService.analysis();
	}
}
