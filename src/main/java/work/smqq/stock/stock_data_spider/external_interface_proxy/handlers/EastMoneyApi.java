package work.smqq.stock.stock_data_spider.external_interface_proxy.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import org.springframework.stereotype.Component;
import work.smqq.stock.stock_data_spider.util.HttpUtil;
import work.smqq.stock.stock_data_spider.common.model.StockPageInfo;
import work.smqq.stock.stock_data_spider.model.StockFinanceReport;
import work.smqq.stock.stock_data_spider.model.StockHistory;
@Component("eastMoneyApi")
public class EastMoneyApi {

	public StockHistory getStockInfoOneDay(String code, String date) {
		return null;
	}
	public StockPageInfo getStockPageInfo(int pageNo, int pageSize, String boardUrlCode) {
		String urlString = "http://31.push2.eastmoney.com/api/qt/clist/get?pn="+pageNo+"&pz=" + pageSize +"&po=1&np=1&ut=bd1d9ddb04089700cf9c27f6f7426281&fltt=2&invt=2&fid=f3&fs=" + boardUrlCode + "&fields=f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f12,f13,f14,f15,f16,f17,f18,f20,f21,f23,f24,f25,f22,f11,f62,f128,f136,f115,f152&_=1585061033010";
		StockPageInfo stockPageInfo = new StockPageInfo();
		String retJsonString = HttpUtil.request(urlString);
		Map<String, Object> retMap = (Map<String, Object>) JSON.parse(retJsonString);
		Map<String, Object> dataMap = (Map<String, Object>) retMap.get("data");
		if(dataMap == null) {
			return null;
		}
		int total = (Integer)dataMap.get("total");
		List<Map<String, Object>> dataList = (List)dataMap.get("diff");
		List<StockHistory> stockList = new LinkedList<StockHistory>();
		for(Map<String, Object> data:dataList) {
			StockHistory stock = new StockHistory();
			String stockName = (String)data.get("f14");
			stock.setStockName(stockName);
			String stockCode = (String) data.get("f12");
			stock.setStockCode(stockCode);
			if(data.get("f2") instanceof BigDecimal) {
				float priceNow = ((BigDecimal)data.get("f2")).floatValue();
				stock.setPriceNow(priceNow);
			}
			if(data.get("f18") instanceof BigDecimal) {
				float priceFinishYesterday = ((BigDecimal) data.get("f18")).floatValue();
				stock.setPriceFinishYesterday(priceFinishYesterday);
			}
			if(data.get("f15") instanceof BigDecimal) {
				float priceMaxToday = ((BigDecimal)data.get("f15")).floatValue();
				stock.setPriceMaxToday(priceMaxToday);
			}
			if(data.get("f16") instanceof BigDecimal) {
				float priceMinToday = ((BigDecimal)data.get("f16")).floatValue();
				stock.setPriceMinToday(priceMinToday);
			}
			if(data.get("f17") instanceof BigDecimal) {
				float priceStartToday = ((BigDecimal) data.get("f17")).floatValue();
				stock.setPriceStartToday(priceStartToday);
			}
			if(data.get("f9") instanceof BigDecimal) {
				float pe = ((BigDecimal) data.get("f9")).floatValue();
				stock.setPe(pe);
			}
			if(data.get("f23") instanceof BigDecimal) {
				float pb = ((BigDecimal) data.get("f23")).floatValue();
				stock.setPb(pb);
			}
			if(data.get("f5") instanceof Integer) {
				long volume =(Integer) data.get("f5");
				stock.setVolume(volume);
			}
			if(data.get("f6") instanceof BigDecimal) {
				double turnVolume = ((BigDecimal) data.get("f6")).doubleValue();
				stock.setTurnVolume(turnVolume);
			}
			if(data.get("f3") instanceof BigDecimal) {
				float changePercent =((BigDecimal)  data.get("f3")).floatValue();
				stock.setChangePercent(changePercent);
			}
			if(data.get("f4") instanceof BigDecimal) {
				float changeAmount =((BigDecimal)  data.get("f4")).floatValue();
				stock.setChangeAmount(changeAmount);
			}
			if(data.get("f7") instanceof BigDecimal) {
				float amplitude =((BigDecimal)  data.get("f7")).floatValue();
				stock.setAmplitude(amplitude);
			}
			if(data.get("f8") instanceof BigDecimal) {
				float turnOver =((BigDecimal)  data.get("f8")).floatValue();
				stock.setTurnOver(turnOver);
			}
			if(data.get("f10") instanceof BigDecimal) {
				float qrr =((BigDecimal)  data.get("f10")).floatValue();
				stock.setQrr(qrr);
			}
			stockList.add(stock);
		}
		stockPageInfo.setStockList(stockList);
		stockPageInfo.setTotal(total);
		return stockPageInfo;
	}
	public String getStockHistory(int dayNum,String stockCode) {
		String url ="http://40.push2his.eastmoney.com/api/qt/stock/kline/get?secid=1." + stockCode + "&ut=fa5fd1943c7b386f172d6893dbfba10b&fields1=f1,f2,f3,f4,f5&fields2=f51,f52,f53,f54,f55,f56,f57,f58&klt=101&fqt=0&beg=0&end=20500101&smplmt=" + dayNum + "&lmt=1000000&_=1590909346843";
		String resultString = HttpUtil.request(url);
		Map<String, Object> retMap = JSON.parseObject(resultString);
		Map<String, Object> dataMap = (Map<String, Object>)retMap.get("data");
		List<String> dateInfo = (List<String>)dataMap.get("klines");
		String[] splits = dateInfo.get(0).split(",");
		return splits[0];
	}
	public static List<StockFinanceReport> getDupontAnalysis(String stockCode,String boardCode) {
		List<StockFinanceReport> reportList = new LinkedList<>();
		try {
			String combinationCode = "";
			if("sh_a_board".equals(boardCode) || "kcb_board".equals(boardCode)) {
				combinationCode += "SH";
			} else if("sz_a_board".equals(boardCode) || "gem_board".equals(boardCode)) {
				combinationCode += "SZ";
			}
			combinationCode += stockCode;
			URL url = new URL("http://f10.eastmoney.com/NewFinanceAnalysis/DubangAnalysisAjax?code=" + combinationCode);
			URLConnection connection = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
			String line = reader.readLine();
			Map<String, Object> result = (Map<String, Object>) JSON.parse(line);
			List<Map<String, String>> elements = (List<Map<String, String>>) result.get("bgq");
			if(elements != null) {
				for(Map<String, String> element:elements) {
					StockFinanceReport report = new StockFinanceReport();
					report.setReportDate(element.get("date"));
					report.setStockCode(stockCode);
					report.setRoe(percentageToFloat(element.get("jzcsyl")));
					report.setRoa(percentageToFloat(element.get("zzcjll")));
					report.setBelongedParentCompanyRate(percentageToFloat(element.get("gsmgsgddjlr")));
					if(!"--".equals(element.get("qycs"))) {
						report.setEm(Float.parseFloat(element.get("qycs")));
					}
					report.setOperatingProfitMargin(percentageToFloat(element.get("yyjlrl")));
					if(!"--".equals(element.get("zzczzl"))) {
						report.setTotalAssetsTurnover(Float.parseFloat(element.get("zzczzl").replace("次", "")));
					}
					report.setAssetLiabilityRatio(percentageToFloat(element.get("zcfzl")));
					report.setNetProfit(convertAmount(element.get("jlr")));
					report.setTotalOperatingRevenue(convertAmount(element.get("yysr")));
					report.setTotalAssets(convertAmount(element.get("zcze")));
					report.setTotalLiabilities(convertAmount(element.get("fzze")));
					report.setTotalRevenue(convertAmount(element.get("srze")));
					report.setTotalCost(convertAmount(element.get("cbze")));
					report.setTotalCurrentAssets(convertAmount(element.get("ldzc")));
					report.setTotalFixedAssets(convertAmount(element.get("fldzc")));
					reportList.add(report);
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return reportList;	
	}
	private static Float percentageToFloat(String percentageStr) {
		if(percentageStr.contains("%")) {
			return Float.parseFloat(percentageStr.replace("%", "").replace(",", ""));
		} else {
			return null;
		}
	}
	private static Double convertAmount(String amount) {
		if(amount.contains("万亿")) {
			return Double.parseDouble(amount.replace("万亿", "").replace(",", "")) * 10000 * 100000000;
		} else if(amount.contains("万")) {
			return Double.parseDouble(amount.replace("万", "").replace(",", "")) * 10000;
		} else if(amount.contains("亿")){
			return Double.parseDouble(amount.replace("亿", "").replace(",", ""))*100000000;
		} else {
			return null;
		}
	}
}
