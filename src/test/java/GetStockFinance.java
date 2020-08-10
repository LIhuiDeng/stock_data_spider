import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import work.smqq.stock.stock_data_spider.model.StockFinanceReport;

public class GetStockFinance {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://f10.eastmoney.com/NewFinanceAnalysis/DubangAnalysisAjax?code=SH688579");
			URLConnection connection = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
			String line = reader.readLine();
			Map<String, Object> result = (Map<String, Object>) JSON.parse(line);
			List<Map<String, String>> elements = (List<Map<String, String>>) result.get("bgq");
			for(Map<String, String> element:elements) {
				StockFinanceReport report = new StockFinanceReport();
				report.setReportDate(element.get("date"));
				report.setRoe(percentageToFloat(element.get("jzcsyl")));
				report.setRoa(percentageToFloat(element.get("zzcjll")));
				report.setBelongedParentCompanyRate(percentageToFloat(element.get("gsmgsgddjlr")));
				report.setEm(Float.parseFloat(element.get("qycs")));
				report.setOperatingProfitMargin(percentageToFloat(element.get("yyjlrl")));
				report.setTotalAssetsTurnover(Float.parseFloat(element.get("zzczzl").replace("次", "")));
				report.setAssetLiabilityRatio(percentageToFloat(element.get("zcfzl")));
				report.setNetProfit(convertAmount(element.get("jlr")));
				report.setTotalOperatingRevenue(convertAmount(element.get("yysr")));
				report.setTotalAssets(convertAmount(element.get("zcze")));
				report.setTotalLiabilities(convertAmount(element.get("fzze")));
				report.setTotalRevenue(convertAmount(element.get("srze")));
				report.setTotalCost(convertAmount(element.get("cbze")));
				report.setTotalCurrentAssets(convertAmount(element.get("ldzc")));
				report.setTotalFixedAssets(convertAmount(element.get("fldzc")));
				System.out.println(JSON.toJSONString(report));
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	private static Float percentageToFloat(String percentageStr) {
		if(percentageStr.contains("%")) {
			return Float.parseFloat(percentageStr.replace("%", ""));
		} else {
			return null;
		}
	}
	private static Double convertAmount(String amount) {
		if(amount.contains("万")) {
			return Double.parseDouble(amount.replace("万", "")) * 10000;
		} else if(amount.contains("亿")){
			return Double.parseDouble(amount.replace("亿", ""))*100000000;
		} else {
			return null;
		}
	}
}
