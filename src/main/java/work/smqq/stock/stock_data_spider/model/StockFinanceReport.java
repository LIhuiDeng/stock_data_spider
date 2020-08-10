package work.smqq.stock.stock_data_spider.model;

public class StockFinanceReport {
    private String stockCode;

    private String reportDate;

    private Float roe;

    private Float roa;

    private Float em;

    private Float belongedParentCompanyRate;

    private Float operatingProfitMargin;

    private Float totalAssetsTurnover;

    private Float assetLiabilityRatio;

    private Double netProfit;

    private Double totalOperatingRevenue;

    private Double totalRevenue;

    private Double totalCost;

    private Double totalAssets;

    private Double totalLiabilities;

    private Double totalCurrentAssets;

    private Double totalFixedAssets;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public Float getRoe() {
        return roe;
    }

    public void setRoe(Float roe) {
        this.roe = roe;
    }

    public Float getRoa() {
        return roa;
    }

    public void setRoa(Float roa) {
        this.roa = roa;
    }

    public Float getEm() {
        return em;
    }

    public void setEm(Float em) {
        this.em = em;
    }

    public Float getBelongedParentCompanyRate() {
        return belongedParentCompanyRate;
    }

    public void setBelongedParentCompanyRate(Float belongedParentCompanyRate) {
        this.belongedParentCompanyRate = belongedParentCompanyRate;
    }

    public Float getOperatingProfitMargin() {
        return operatingProfitMargin;
    }

    public void setOperatingProfitMargin(Float operatingProfitMargin) {
        this.operatingProfitMargin = operatingProfitMargin;
    }

    public Float getTotalAssetsTurnover() {
        return totalAssetsTurnover;
    }

    public void setTotalAssetsTurnover(Float totalAssetsTurnover) {
        this.totalAssetsTurnover = totalAssetsTurnover;
    }

    public Float getAssetLiabilityRatio() {
        return assetLiabilityRatio;
    }

    public void setAssetLiabilityRatio(Float assetLiabilityRatio) {
        this.assetLiabilityRatio = assetLiabilityRatio;
    }

    public Double getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(Double netProfit) {
        this.netProfit = netProfit;
    }

    public Double getTotalOperatingRevenue() {
        return totalOperatingRevenue;
    }

    public void setTotalOperatingRevenue(Double totalOperatingRevenue) {
        this.totalOperatingRevenue = totalOperatingRevenue;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(Double totalAssets) {
        this.totalAssets = totalAssets;
    }

    public Double getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(Double totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public Double getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    public void setTotalCurrentAssets(Double totalCurrentAssets) {
        this.totalCurrentAssets = totalCurrentAssets;
    }

    public Double getTotalFixedAssets() {
        return totalFixedAssets;
    }

    public void setTotalFixedAssets(Double totalFixedAssets) {
        this.totalFixedAssets = totalFixedAssets;
    }
}