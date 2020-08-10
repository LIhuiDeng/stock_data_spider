package work.smqq.stock.stock_data_spider.model;

import java.util.ArrayList;
import java.util.List;

public class StockFinanceReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockFinanceReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(String value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(String value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(String value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(String value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(String value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(String value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLike(String value) {
            addCriterion("report_date like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotLike(String value) {
            addCriterion("report_date not like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<String> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<String> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(String value1, String value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(String value1, String value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andRoeIsNull() {
            addCriterion("roe is null");
            return (Criteria) this;
        }

        public Criteria andRoeIsNotNull() {
            addCriterion("roe is not null");
            return (Criteria) this;
        }

        public Criteria andRoeEqualTo(Float value) {
            addCriterion("roe =", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeNotEqualTo(Float value) {
            addCriterion("roe <>", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeGreaterThan(Float value) {
            addCriterion("roe >", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeGreaterThanOrEqualTo(Float value) {
            addCriterion("roe >=", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeLessThan(Float value) {
            addCriterion("roe <", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeLessThanOrEqualTo(Float value) {
            addCriterion("roe <=", value, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeIn(List<Float> values) {
            addCriterion("roe in", values, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeNotIn(List<Float> values) {
            addCriterion("roe not in", values, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeBetween(Float value1, Float value2) {
            addCriterion("roe between", value1, value2, "roe");
            return (Criteria) this;
        }

        public Criteria andRoeNotBetween(Float value1, Float value2) {
            addCriterion("roe not between", value1, value2, "roe");
            return (Criteria) this;
        }

        public Criteria andRoaIsNull() {
            addCriterion("roa is null");
            return (Criteria) this;
        }

        public Criteria andRoaIsNotNull() {
            addCriterion("roa is not null");
            return (Criteria) this;
        }

        public Criteria andRoaEqualTo(Float value) {
            addCriterion("roa =", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaNotEqualTo(Float value) {
            addCriterion("roa <>", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaGreaterThan(Float value) {
            addCriterion("roa >", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaGreaterThanOrEqualTo(Float value) {
            addCriterion("roa >=", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaLessThan(Float value) {
            addCriterion("roa <", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaLessThanOrEqualTo(Float value) {
            addCriterion("roa <=", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaIn(List<Float> values) {
            addCriterion("roa in", values, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaNotIn(List<Float> values) {
            addCriterion("roa not in", values, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaBetween(Float value1, Float value2) {
            addCriterion("roa between", value1, value2, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaNotBetween(Float value1, Float value2) {
            addCriterion("roa not between", value1, value2, "roa");
            return (Criteria) this;
        }

        public Criteria andEmIsNull() {
            addCriterion("em is null");
            return (Criteria) this;
        }

        public Criteria andEmIsNotNull() {
            addCriterion("em is not null");
            return (Criteria) this;
        }

        public Criteria andEmEqualTo(Float value) {
            addCriterion("em =", value, "em");
            return (Criteria) this;
        }

        public Criteria andEmNotEqualTo(Float value) {
            addCriterion("em <>", value, "em");
            return (Criteria) this;
        }

        public Criteria andEmGreaterThan(Float value) {
            addCriterion("em >", value, "em");
            return (Criteria) this;
        }

        public Criteria andEmGreaterThanOrEqualTo(Float value) {
            addCriterion("em >=", value, "em");
            return (Criteria) this;
        }

        public Criteria andEmLessThan(Float value) {
            addCriterion("em <", value, "em");
            return (Criteria) this;
        }

        public Criteria andEmLessThanOrEqualTo(Float value) {
            addCriterion("em <=", value, "em");
            return (Criteria) this;
        }

        public Criteria andEmIn(List<Float> values) {
            addCriterion("em in", values, "em");
            return (Criteria) this;
        }

        public Criteria andEmNotIn(List<Float> values) {
            addCriterion("em not in", values, "em");
            return (Criteria) this;
        }

        public Criteria andEmBetween(Float value1, Float value2) {
            addCriterion("em between", value1, value2, "em");
            return (Criteria) this;
        }

        public Criteria andEmNotBetween(Float value1, Float value2) {
            addCriterion("em not between", value1, value2, "em");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateIsNull() {
            addCriterion("belonged_parent_company_rate is null");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateIsNotNull() {
            addCriterion("belonged_parent_company_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateEqualTo(Float value) {
            addCriterion("belonged_parent_company_rate =", value, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateNotEqualTo(Float value) {
            addCriterion("belonged_parent_company_rate <>", value, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateGreaterThan(Float value) {
            addCriterion("belonged_parent_company_rate >", value, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateGreaterThanOrEqualTo(Float value) {
            addCriterion("belonged_parent_company_rate >=", value, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateLessThan(Float value) {
            addCriterion("belonged_parent_company_rate <", value, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateLessThanOrEqualTo(Float value) {
            addCriterion("belonged_parent_company_rate <=", value, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateIn(List<Float> values) {
            addCriterion("belonged_parent_company_rate in", values, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateNotIn(List<Float> values) {
            addCriterion("belonged_parent_company_rate not in", values, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateBetween(Float value1, Float value2) {
            addCriterion("belonged_parent_company_rate between", value1, value2, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andBelongedParentCompanyRateNotBetween(Float value1, Float value2) {
            addCriterion("belonged_parent_company_rate not between", value1, value2, "belongedParentCompanyRate");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginIsNull() {
            addCriterion("operating_profit_margin is null");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginIsNotNull() {
            addCriterion("operating_profit_margin is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginEqualTo(Float value) {
            addCriterion("operating_profit_margin =", value, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginNotEqualTo(Float value) {
            addCriterion("operating_profit_margin <>", value, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginGreaterThan(Float value) {
            addCriterion("operating_profit_margin >", value, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginGreaterThanOrEqualTo(Float value) {
            addCriterion("operating_profit_margin >=", value, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginLessThan(Float value) {
            addCriterion("operating_profit_margin <", value, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginLessThanOrEqualTo(Float value) {
            addCriterion("operating_profit_margin <=", value, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginIn(List<Float> values) {
            addCriterion("operating_profit_margin in", values, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginNotIn(List<Float> values) {
            addCriterion("operating_profit_margin not in", values, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginBetween(Float value1, Float value2) {
            addCriterion("operating_profit_margin between", value1, value2, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andOperatingProfitMarginNotBetween(Float value1, Float value2) {
            addCriterion("operating_profit_margin not between", value1, value2, "operatingProfitMargin");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverIsNull() {
            addCriterion("total_assets_turnover is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverIsNotNull() {
            addCriterion("total_assets_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverEqualTo(Float value) {
            addCriterion("total_assets_turnover =", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverNotEqualTo(Float value) {
            addCriterion("total_assets_turnover <>", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverGreaterThan(Float value) {
            addCriterion("total_assets_turnover >", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverGreaterThanOrEqualTo(Float value) {
            addCriterion("total_assets_turnover >=", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverLessThan(Float value) {
            addCriterion("total_assets_turnover <", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverLessThanOrEqualTo(Float value) {
            addCriterion("total_assets_turnover <=", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverIn(List<Float> values) {
            addCriterion("total_assets_turnover in", values, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverNotIn(List<Float> values) {
            addCriterion("total_assets_turnover not in", values, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverBetween(Float value1, Float value2) {
            addCriterion("total_assets_turnover between", value1, value2, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverNotBetween(Float value1, Float value2) {
            addCriterion("total_assets_turnover not between", value1, value2, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioIsNull() {
            addCriterion("asset_liability_ratio is null");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioIsNotNull() {
            addCriterion("asset_liability_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioEqualTo(Float value) {
            addCriterion("asset_liability_ratio =", value, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioNotEqualTo(Float value) {
            addCriterion("asset_liability_ratio <>", value, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioGreaterThan(Float value) {
            addCriterion("asset_liability_ratio >", value, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioGreaterThanOrEqualTo(Float value) {
            addCriterion("asset_liability_ratio >=", value, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioLessThan(Float value) {
            addCriterion("asset_liability_ratio <", value, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioLessThanOrEqualTo(Float value) {
            addCriterion("asset_liability_ratio <=", value, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioIn(List<Float> values) {
            addCriterion("asset_liability_ratio in", values, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioNotIn(List<Float> values) {
            addCriterion("asset_liability_ratio not in", values, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioBetween(Float value1, Float value2) {
            addCriterion("asset_liability_ratio between", value1, value2, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andAssetLiabilityRatioNotBetween(Float value1, Float value2) {
            addCriterion("asset_liability_ratio not between", value1, value2, "assetLiabilityRatio");
            return (Criteria) this;
        }

        public Criteria andNetProfitIsNull() {
            addCriterion("net_profit is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitIsNotNull() {
            addCriterion("net_profit is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitEqualTo(Double value) {
            addCriterion("net_profit =", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotEqualTo(Double value) {
            addCriterion("net_profit <>", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitGreaterThan(Double value) {
            addCriterion("net_profit >", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("net_profit >=", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitLessThan(Double value) {
            addCriterion("net_profit <", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitLessThanOrEqualTo(Double value) {
            addCriterion("net_profit <=", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitIn(List<Double> values) {
            addCriterion("net_profit in", values, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotIn(List<Double> values) {
            addCriterion("net_profit not in", values, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitBetween(Double value1, Double value2) {
            addCriterion("net_profit between", value1, value2, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotBetween(Double value1, Double value2) {
            addCriterion("net_profit not between", value1, value2, "netProfit");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueIsNull() {
            addCriterion("total_operating_revenue is null");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueIsNotNull() {
            addCriterion("total_operating_revenue is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueEqualTo(Double value) {
            addCriterion("total_operating_revenue =", value, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueNotEqualTo(Double value) {
            addCriterion("total_operating_revenue <>", value, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueGreaterThan(Double value) {
            addCriterion("total_operating_revenue >", value, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueGreaterThanOrEqualTo(Double value) {
            addCriterion("total_operating_revenue >=", value, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueLessThan(Double value) {
            addCriterion("total_operating_revenue <", value, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueLessThanOrEqualTo(Double value) {
            addCriterion("total_operating_revenue <=", value, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueIn(List<Double> values) {
            addCriterion("total_operating_revenue in", values, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueNotIn(List<Double> values) {
            addCriterion("total_operating_revenue not in", values, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueBetween(Double value1, Double value2) {
            addCriterion("total_operating_revenue between", value1, value2, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalOperatingRevenueNotBetween(Double value1, Double value2) {
            addCriterion("total_operating_revenue not between", value1, value2, "totalOperatingRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueIsNull() {
            addCriterion("total_revenue is null");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueIsNotNull() {
            addCriterion("total_revenue is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueEqualTo(Double value) {
            addCriterion("total_revenue =", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueNotEqualTo(Double value) {
            addCriterion("total_revenue <>", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueGreaterThan(Double value) {
            addCriterion("total_revenue >", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueGreaterThanOrEqualTo(Double value) {
            addCriterion("total_revenue >=", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueLessThan(Double value) {
            addCriterion("total_revenue <", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueLessThanOrEqualTo(Double value) {
            addCriterion("total_revenue <=", value, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueIn(List<Double> values) {
            addCriterion("total_revenue in", values, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueNotIn(List<Double> values) {
            addCriterion("total_revenue not in", values, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueBetween(Double value1, Double value2) {
            addCriterion("total_revenue between", value1, value2, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalRevenueNotBetween(Double value1, Double value2) {
            addCriterion("total_revenue not between", value1, value2, "totalRevenue");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Double value) {
            addCriterion("total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Double value) {
            addCriterion("total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Double value) {
            addCriterion("total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Double value) {
            addCriterion("total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Double value) {
            addCriterion("total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Double value) {
            addCriterion("total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Double> values) {
            addCriterion("total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Double> values) {
            addCriterion("total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Double value1, Double value2) {
            addCriterion("total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Double value1, Double value2) {
            addCriterion("total_cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNull() {
            addCriterion("total_assets is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNotNull() {
            addCriterion("total_assets is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsEqualTo(Double value) {
            addCriterion("total_assets =", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotEqualTo(Double value) {
            addCriterion("total_assets <>", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThan(Double value) {
            addCriterion("total_assets >", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThanOrEqualTo(Double value) {
            addCriterion("total_assets >=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThan(Double value) {
            addCriterion("total_assets <", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThanOrEqualTo(Double value) {
            addCriterion("total_assets <=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIn(List<Double> values) {
            addCriterion("total_assets in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotIn(List<Double> values) {
            addCriterion("total_assets not in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsBetween(Double value1, Double value2) {
            addCriterion("total_assets between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotBetween(Double value1, Double value2) {
            addCriterion("total_assets not between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesIsNull() {
            addCriterion("total_liabilities is null");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesIsNotNull() {
            addCriterion("total_liabilities is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesEqualTo(Double value) {
            addCriterion("total_liabilities =", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesNotEqualTo(Double value) {
            addCriterion("total_liabilities <>", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesGreaterThan(Double value) {
            addCriterion("total_liabilities >", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesGreaterThanOrEqualTo(Double value) {
            addCriterion("total_liabilities >=", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesLessThan(Double value) {
            addCriterion("total_liabilities <", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesLessThanOrEqualTo(Double value) {
            addCriterion("total_liabilities <=", value, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesIn(List<Double> values) {
            addCriterion("total_liabilities in", values, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesNotIn(List<Double> values) {
            addCriterion("total_liabilities not in", values, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesBetween(Double value1, Double value2) {
            addCriterion("total_liabilities between", value1, value2, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesNotBetween(Double value1, Double value2) {
            addCriterion("total_liabilities not between", value1, value2, "totalLiabilities");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsIsNull() {
            addCriterion("total_current_assets is null");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsIsNotNull() {
            addCriterion("total_current_assets is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsEqualTo(Double value) {
            addCriterion("total_current_assets =", value, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsNotEqualTo(Double value) {
            addCriterion("total_current_assets <>", value, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsGreaterThan(Double value) {
            addCriterion("total_current_assets >", value, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsGreaterThanOrEqualTo(Double value) {
            addCriterion("total_current_assets >=", value, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsLessThan(Double value) {
            addCriterion("total_current_assets <", value, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsLessThanOrEqualTo(Double value) {
            addCriterion("total_current_assets <=", value, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsIn(List<Double> values) {
            addCriterion("total_current_assets in", values, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsNotIn(List<Double> values) {
            addCriterion("total_current_assets not in", values, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsBetween(Double value1, Double value2) {
            addCriterion("total_current_assets between", value1, value2, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalCurrentAssetsNotBetween(Double value1, Double value2) {
            addCriterion("total_current_assets not between", value1, value2, "totalCurrentAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsIsNull() {
            addCriterion("total_fixed_assets is null");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsIsNotNull() {
            addCriterion("total_fixed_assets is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsEqualTo(Double value) {
            addCriterion("total_fixed_assets =", value, "totalFixedAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsNotEqualTo(Double value) {
            addCriterion("total_fixed_assets <>", value, "totalFixedAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsGreaterThan(Double value) {
            addCriterion("total_fixed_assets >", value, "totalFixedAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsGreaterThanOrEqualTo(Double value) {
            addCriterion("total_fixed_assets >=", value, "totalFixedAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsLessThan(Double value) {
            addCriterion("total_fixed_assets <", value, "totalFixedAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsLessThanOrEqualTo(Double value) {
            addCriterion("total_fixed_assets <=", value, "totalFixedAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsIn(List<Double> values) {
            addCriterion("total_fixed_assets in", values, "totalFixedAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsNotIn(List<Double> values) {
            addCriterion("total_fixed_assets not in", values, "totalFixedAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsBetween(Double value1, Double value2) {
            addCriterion("total_fixed_assets between", value1, value2, "totalFixedAssets");
            return (Criteria) this;
        }

        public Criteria andTotalFixedAssetsNotBetween(Double value1, Double value2) {
            addCriterion("total_fixed_assets not between", value1, value2, "totalFixedAssets");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}