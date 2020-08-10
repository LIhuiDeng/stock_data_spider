package work.smqq.stock.stock_data_spider.external_interface_proxy.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import work.smqq.stock.stock_data_spider.common.model.StockPageInfo;
import work.smqq.stock.stock_data_spider.model.StockHistory;
@Component("wangyiApi")
public class WangyiApi {
	private final Logger log = LoggerFactory.getLogger(WangyiApi.class);
	
	public List<StockHistory> getStockHistory(String fromDate, String toDate, String stockCode) {
		List<StockHistory> stockHistoryList = new LinkedList<>();
		try {
			log.info("开始请求{}的历史数据",stockCode);
			URL url = new URL("http://quotes.money.163.com/service/chddata.html?code=" + stockCode + "&start=" + fromDate.replace("-", "")
			+ "&end=" + toDate.replace("-", "") + "&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP");
			URLConnection connection = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"gbk"));
			String line = "";
			boolean firstLine = true;
			while( (line = reader.readLine()) != null) {
				if(firstLine) {
					firstLine = false;
				} else {
					String[] elements = line.split(",");
					StockHistory stockHistory = new StockHistory();
					stockHistory.setTradeDate(elements[0]);
					stockHistory.setStockCode(elements[1].replace("'", ""));
					stockHistory.setStockName(elements[2]);
					stockHistory.setPriceNow(Float.parseFloat(elements[3]));
					stockHistory.setPriceMaxToday(Float.parseFloat(elements[4]));
					stockHistory.setPriceMinToday(Float.parseFloat(elements[5]));
					stockHistory.setPriceStartToday(Float.parseFloat(elements[6]));
					stockHistory.setPriceFinishYesterday(Float.parseFloat(elements[7]));
					if(!"None".equals(elements[8])) {
						stockHistory.setChangeAmount(Float.parseFloat(elements[8]));
					}
					if(!"None".equals(elements[9])) {
						stockHistory.setChangePercent(Float.parseFloat(elements[9]));
					}
					stockHistory.setTurnOver(Float.parseFloat(elements[10]));
					stockHistory.setVolume(Long.parseLong(elements[11]));
					stockHistory.setTurnVolume(Double.parseDouble(elements[12]));
					stockHistory.setMarketValue(Double.parseDouble(elements[13]));
					stockHistory.setCirculationMarketValue(Double.parseDouble(elements[14]));
					stockHistoryList.add(stockHistory);
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		log.info("{}总共有{}条数据", stockCode, stockHistoryList.size());
		return stockHistoryList;
	}

}
