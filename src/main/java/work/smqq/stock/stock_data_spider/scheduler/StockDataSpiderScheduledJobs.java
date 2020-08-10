package work.smqq.stock.stock_data_spider.scheduler;

import com.alibaba.fastjson.JSON;

import work.smqq.stock.stock_data_spider.service.StockDataSpiderService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Configuration // 1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling // 2.开启定时任务
public class StockDataSpiderScheduledJobs {
	private Logger log = LoggerFactory.getLogger(StockDataSpiderScheduledJobs.class);
	@Autowired
	private StockDataSpiderService stockDataSpiderService;
	@Scheduled(cron = "0 30 15 * * ?")
	void scheduledSyncStockData() {
		long startTime = System.currentTimeMillis();
		log.info("开始同步股票信息");
		stockDataSpiderService.syncStockData();
		long endTime = System.currentTimeMillis();
		log.info("股票信息同步结束，耗时：{}ms",endTime -startTime);
	}
}
