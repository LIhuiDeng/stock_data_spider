import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.alibaba.fastjson.JSON;

import work.smqq.stock.stock_data_spider.model.StockHistory;

public class GetHistoryData {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://quotes.money.163.com/service/chddata.html?code=0601857&start=20071105&end=20200717&fields=TCLOSE;HIGH;LOW;TOPEN;LCLOSE;CHG;PCHG;TURNOVER;VOTURNOVER;VATURNOVER;TCAP;MCAP");
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
					System.out.println(JSON.toJSONString(line));
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
