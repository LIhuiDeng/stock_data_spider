package work.smqq.stock.stock_data_spider.model;

import java.util.ArrayList;
import java.util.List;

public class StockHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockHistoryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
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

        public Criteria andPriceNowIsNull() {
            addCriterion("price_now is null");
            return (Criteria) this;
        }

        public Criteria andPriceNowIsNotNull() {
            addCriterion("price_now is not null");
            return (Criteria) this;
        }

        public Criteria andPriceNowEqualTo(Float value) {
            addCriterion("price_now =", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowNotEqualTo(Float value) {
            addCriterion("price_now <>", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowGreaterThan(Float value) {
            addCriterion("price_now >", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowGreaterThanOrEqualTo(Float value) {
            addCriterion("price_now >=", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowLessThan(Float value) {
            addCriterion("price_now <", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowLessThanOrEqualTo(Float value) {
            addCriterion("price_now <=", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowIn(List<Float> values) {
            addCriterion("price_now in", values, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowNotIn(List<Float> values) {
            addCriterion("price_now not in", values, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowBetween(Float value1, Float value2) {
            addCriterion("price_now between", value1, value2, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowNotBetween(Float value1, Float value2) {
            addCriterion("price_now not between", value1, value2, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayIsNull() {
            addCriterion("price_finish_yesterday is null");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayIsNotNull() {
            addCriterion("price_finish_yesterday is not null");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayEqualTo(Float value) {
            addCriterion("price_finish_yesterday =", value, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayNotEqualTo(Float value) {
            addCriterion("price_finish_yesterday <>", value, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayGreaterThan(Float value) {
            addCriterion("price_finish_yesterday >", value, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayGreaterThanOrEqualTo(Float value) {
            addCriterion("price_finish_yesterday >=", value, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayLessThan(Float value) {
            addCriterion("price_finish_yesterday <", value, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayLessThanOrEqualTo(Float value) {
            addCriterion("price_finish_yesterday <=", value, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayIn(List<Float> values) {
            addCriterion("price_finish_yesterday in", values, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayNotIn(List<Float> values) {
            addCriterion("price_finish_yesterday not in", values, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayBetween(Float value1, Float value2) {
            addCriterion("price_finish_yesterday between", value1, value2, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceFinishYesterdayNotBetween(Float value1, Float value2) {
            addCriterion("price_finish_yesterday not between", value1, value2, "priceFinishYesterday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayIsNull() {
            addCriterion("price_max_today is null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayIsNotNull() {
            addCriterion("price_max_today is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayEqualTo(Float value) {
            addCriterion("price_max_today =", value, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayNotEqualTo(Float value) {
            addCriterion("price_max_today <>", value, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayGreaterThan(Float value) {
            addCriterion("price_max_today >", value, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayGreaterThanOrEqualTo(Float value) {
            addCriterion("price_max_today >=", value, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayLessThan(Float value) {
            addCriterion("price_max_today <", value, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayLessThanOrEqualTo(Float value) {
            addCriterion("price_max_today <=", value, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayIn(List<Float> values) {
            addCriterion("price_max_today in", values, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayNotIn(List<Float> values) {
            addCriterion("price_max_today not in", values, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayBetween(Float value1, Float value2) {
            addCriterion("price_max_today between", value1, value2, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMaxTodayNotBetween(Float value1, Float value2) {
            addCriterion("price_max_today not between", value1, value2, "priceMaxToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayIsNull() {
            addCriterion("price_min_today is null");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayIsNotNull() {
            addCriterion("price_min_today is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayEqualTo(Float value) {
            addCriterion("price_min_today =", value, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayNotEqualTo(Float value) {
            addCriterion("price_min_today <>", value, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayGreaterThan(Float value) {
            addCriterion("price_min_today >", value, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayGreaterThanOrEqualTo(Float value) {
            addCriterion("price_min_today >=", value, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayLessThan(Float value) {
            addCriterion("price_min_today <", value, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayLessThanOrEqualTo(Float value) {
            addCriterion("price_min_today <=", value, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayIn(List<Float> values) {
            addCriterion("price_min_today in", values, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayNotIn(List<Float> values) {
            addCriterion("price_min_today not in", values, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayBetween(Float value1, Float value2) {
            addCriterion("price_min_today between", value1, value2, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceMinTodayNotBetween(Float value1, Float value2) {
            addCriterion("price_min_today not between", value1, value2, "priceMinToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayIsNull() {
            addCriterion("price_start_today is null");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayIsNotNull() {
            addCriterion("price_start_today is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayEqualTo(Float value) {
            addCriterion("price_start_today =", value, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayNotEqualTo(Float value) {
            addCriterion("price_start_today <>", value, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayGreaterThan(Float value) {
            addCriterion("price_start_today >", value, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayGreaterThanOrEqualTo(Float value) {
            addCriterion("price_start_today >=", value, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayLessThan(Float value) {
            addCriterion("price_start_today <", value, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayLessThanOrEqualTo(Float value) {
            addCriterion("price_start_today <=", value, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayIn(List<Float> values) {
            addCriterion("price_start_today in", values, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayNotIn(List<Float> values) {
            addCriterion("price_start_today not in", values, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayBetween(Float value1, Float value2) {
            addCriterion("price_start_today between", value1, value2, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPriceStartTodayNotBetween(Float value1, Float value2) {
            addCriterion("price_start_today not between", value1, value2, "priceStartToday");
            return (Criteria) this;
        }

        public Criteria andPeIsNull() {
            addCriterion("pe is null");
            return (Criteria) this;
        }

        public Criteria andPeIsNotNull() {
            addCriterion("pe is not null");
            return (Criteria) this;
        }

        public Criteria andPeEqualTo(Float value) {
            addCriterion("pe =", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotEqualTo(Float value) {
            addCriterion("pe <>", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThan(Float value) {
            addCriterion("pe >", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThanOrEqualTo(Float value) {
            addCriterion("pe >=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThan(Float value) {
            addCriterion("pe <", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThanOrEqualTo(Float value) {
            addCriterion("pe <=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeIn(List<Float> values) {
            addCriterion("pe in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotIn(List<Float> values) {
            addCriterion("pe not in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeBetween(Float value1, Float value2) {
            addCriterion("pe between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotBetween(Float value1, Float value2) {
            addCriterion("pe not between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andPbIsNull() {
            addCriterion("pb is null");
            return (Criteria) this;
        }

        public Criteria andPbIsNotNull() {
            addCriterion("pb is not null");
            return (Criteria) this;
        }

        public Criteria andPbEqualTo(Float value) {
            addCriterion("pb =", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotEqualTo(Float value) {
            addCriterion("pb <>", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThan(Float value) {
            addCriterion("pb >", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThanOrEqualTo(Float value) {
            addCriterion("pb >=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThan(Float value) {
            addCriterion("pb <", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThanOrEqualTo(Float value) {
            addCriterion("pb <=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbIn(List<Float> values) {
            addCriterion("pb in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotIn(List<Float> values) {
            addCriterion("pb not in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbBetween(Float value1, Float value2) {
            addCriterion("pb between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotBetween(Float value1, Float value2) {
            addCriterion("pb not between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Long value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Long value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Long value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Long value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Long value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Long> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Long> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Long value1, Long value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Long value1, Long value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeIsNull() {
            addCriterion("turn_volume is null");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeIsNotNull() {
            addCriterion("turn_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeEqualTo(Double value) {
            addCriterion("turn_volume =", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeNotEqualTo(Double value) {
            addCriterion("turn_volume <>", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeGreaterThan(Double value) {
            addCriterion("turn_volume >", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("turn_volume >=", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeLessThan(Double value) {
            addCriterion("turn_volume <", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeLessThanOrEqualTo(Double value) {
            addCriterion("turn_volume <=", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeIn(List<Double> values) {
            addCriterion("turn_volume in", values, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeNotIn(List<Double> values) {
            addCriterion("turn_volume not in", values, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeBetween(Double value1, Double value2) {
            addCriterion("turn_volume between", value1, value2, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeNotBetween(Double value1, Double value2) {
            addCriterion("turn_volume not between", value1, value2, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andChangePercentIsNull() {
            addCriterion("change_percent is null");
            return (Criteria) this;
        }

        public Criteria andChangePercentIsNotNull() {
            addCriterion("change_percent is not null");
            return (Criteria) this;
        }

        public Criteria andChangePercentEqualTo(Float value) {
            addCriterion("change_percent =", value, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangePercentNotEqualTo(Float value) {
            addCriterion("change_percent <>", value, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangePercentGreaterThan(Float value) {
            addCriterion("change_percent >", value, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangePercentGreaterThanOrEqualTo(Float value) {
            addCriterion("change_percent >=", value, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangePercentLessThan(Float value) {
            addCriterion("change_percent <", value, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangePercentLessThanOrEqualTo(Float value) {
            addCriterion("change_percent <=", value, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangePercentIn(List<Float> values) {
            addCriterion("change_percent in", values, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangePercentNotIn(List<Float> values) {
            addCriterion("change_percent not in", values, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangePercentBetween(Float value1, Float value2) {
            addCriterion("change_percent between", value1, value2, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangePercentNotBetween(Float value1, Float value2) {
            addCriterion("change_percent not between", value1, value2, "changePercent");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIsNull() {
            addCriterion("change_amount is null");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIsNotNull() {
            addCriterion("change_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChangeAmountEqualTo(Float value) {
            addCriterion("change_amount =", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotEqualTo(Float value) {
            addCriterion("change_amount <>", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountGreaterThan(Float value) {
            addCriterion("change_amount >", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("change_amount >=", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountLessThan(Float value) {
            addCriterion("change_amount <", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountLessThanOrEqualTo(Float value) {
            addCriterion("change_amount <=", value, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountIn(List<Float> values) {
            addCriterion("change_amount in", values, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotIn(List<Float> values) {
            addCriterion("change_amount not in", values, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountBetween(Float value1, Float value2) {
            addCriterion("change_amount between", value1, value2, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andChangeAmountNotBetween(Float value1, Float value2) {
            addCriterion("change_amount not between", value1, value2, "changeAmount");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIsNull() {
            addCriterion("amplitude is null");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIsNotNull() {
            addCriterion("amplitude is not null");
            return (Criteria) this;
        }

        public Criteria andAmplitudeEqualTo(Float value) {
            addCriterion("amplitude =", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotEqualTo(Float value) {
            addCriterion("amplitude <>", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeGreaterThan(Float value) {
            addCriterion("amplitude >", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("amplitude >=", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLessThan(Float value) {
            addCriterion("amplitude <", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLessThanOrEqualTo(Float value) {
            addCriterion("amplitude <=", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIn(List<Float> values) {
            addCriterion("amplitude in", values, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotIn(List<Float> values) {
            addCriterion("amplitude not in", values, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeBetween(Float value1, Float value2) {
            addCriterion("amplitude between", value1, value2, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotBetween(Float value1, Float value2) {
            addCriterion("amplitude not between", value1, value2, "amplitude");
            return (Criteria) this;
        }

        public Criteria andTurnOverIsNull() {
            addCriterion("turn_over is null");
            return (Criteria) this;
        }

        public Criteria andTurnOverIsNotNull() {
            addCriterion("turn_over is not null");
            return (Criteria) this;
        }

        public Criteria andTurnOverEqualTo(Float value) {
            addCriterion("turn_over =", value, "turnOver");
            return (Criteria) this;
        }

        public Criteria andTurnOverNotEqualTo(Float value) {
            addCriterion("turn_over <>", value, "turnOver");
            return (Criteria) this;
        }

        public Criteria andTurnOverGreaterThan(Float value) {
            addCriterion("turn_over >", value, "turnOver");
            return (Criteria) this;
        }

        public Criteria andTurnOverGreaterThanOrEqualTo(Float value) {
            addCriterion("turn_over >=", value, "turnOver");
            return (Criteria) this;
        }

        public Criteria andTurnOverLessThan(Float value) {
            addCriterion("turn_over <", value, "turnOver");
            return (Criteria) this;
        }

        public Criteria andTurnOverLessThanOrEqualTo(Float value) {
            addCriterion("turn_over <=", value, "turnOver");
            return (Criteria) this;
        }

        public Criteria andTurnOverIn(List<Float> values) {
            addCriterion("turn_over in", values, "turnOver");
            return (Criteria) this;
        }

        public Criteria andTurnOverNotIn(List<Float> values) {
            addCriterion("turn_over not in", values, "turnOver");
            return (Criteria) this;
        }

        public Criteria andTurnOverBetween(Float value1, Float value2) {
            addCriterion("turn_over between", value1, value2, "turnOver");
            return (Criteria) this;
        }

        public Criteria andTurnOverNotBetween(Float value1, Float value2) {
            addCriterion("turn_over not between", value1, value2, "turnOver");
            return (Criteria) this;
        }

        public Criteria andQrrIsNull() {
            addCriterion("qrr is null");
            return (Criteria) this;
        }

        public Criteria andQrrIsNotNull() {
            addCriterion("qrr is not null");
            return (Criteria) this;
        }

        public Criteria andQrrEqualTo(Float value) {
            addCriterion("qrr =", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrNotEqualTo(Float value) {
            addCriterion("qrr <>", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrGreaterThan(Float value) {
            addCriterion("qrr >", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrGreaterThanOrEqualTo(Float value) {
            addCriterion("qrr >=", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrLessThan(Float value) {
            addCriterion("qrr <", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrLessThanOrEqualTo(Float value) {
            addCriterion("qrr <=", value, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrIn(List<Float> values) {
            addCriterion("qrr in", values, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrNotIn(List<Float> values) {
            addCriterion("qrr not in", values, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrBetween(Float value1, Float value2) {
            addCriterion("qrr between", value1, value2, "qrr");
            return (Criteria) this;
        }

        public Criteria andQrrNotBetween(Float value1, Float value2) {
            addCriterion("qrr not between", value1, value2, "qrr");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(String value) {
            addCriterion("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(String value) {
            addCriterion("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(String value) {
            addCriterion("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(String value) {
            addCriterion("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(String value) {
            addCriterion("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(String value) {
            addCriterion("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLike(String value) {
            addCriterion("trade_date like", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotLike(String value) {
            addCriterion("trade_date not like", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<String> values) {
            addCriterion("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<String> values) {
            addCriterion("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(String value1, String value2) {
            addCriterion("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(String value1, String value2) {
            addCriterion("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andBoardCodeIsNull() {
            addCriterion("board_code is null");
            return (Criteria) this;
        }

        public Criteria andBoardCodeIsNotNull() {
            addCriterion("board_code is not null");
            return (Criteria) this;
        }

        public Criteria andBoardCodeEqualTo(String value) {
            addCriterion("board_code =", value, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeNotEqualTo(String value) {
            addCriterion("board_code <>", value, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeGreaterThan(String value) {
            addCriterion("board_code >", value, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("board_code >=", value, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeLessThan(String value) {
            addCriterion("board_code <", value, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeLessThanOrEqualTo(String value) {
            addCriterion("board_code <=", value, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeLike(String value) {
            addCriterion("board_code like", value, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeNotLike(String value) {
            addCriterion("board_code not like", value, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeIn(List<String> values) {
            addCriterion("board_code in", values, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeNotIn(List<String> values) {
            addCriterion("board_code not in", values, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeBetween(String value1, String value2) {
            addCriterion("board_code between", value1, value2, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardCodeNotBetween(String value1, String value2) {
            addCriterion("board_code not between", value1, value2, "boardCode");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNull() {
            addCriterion("board_name is null");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNotNull() {
            addCriterion("board_name is not null");
            return (Criteria) this;
        }

        public Criteria andBoardNameEqualTo(String value) {
            addCriterion("board_name =", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotEqualTo(String value) {
            addCriterion("board_name <>", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThan(String value) {
            addCriterion("board_name >", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThanOrEqualTo(String value) {
            addCriterion("board_name >=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThan(String value) {
            addCriterion("board_name <", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThanOrEqualTo(String value) {
            addCriterion("board_name <=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLike(String value) {
            addCriterion("board_name like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotLike(String value) {
            addCriterion("board_name not like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameIn(List<String> values) {
            addCriterion("board_name in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotIn(List<String> values) {
            addCriterion("board_name not in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameBetween(String value1, String value2) {
            addCriterion("board_name between", value1, value2, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotBetween(String value1, String value2) {
            addCriterion("board_name not between", value1, value2, "boardName");
            return (Criteria) this;
        }

        public Criteria andMarketValueIsNull() {
            addCriterion("market_value is null");
            return (Criteria) this;
        }

        public Criteria andMarketValueIsNotNull() {
            addCriterion("market_value is not null");
            return (Criteria) this;
        }

        public Criteria andMarketValueEqualTo(Double value) {
            addCriterion("market_value =", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotEqualTo(Double value) {
            addCriterion("market_value <>", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueGreaterThan(Double value) {
            addCriterion("market_value >", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueGreaterThanOrEqualTo(Double value) {
            addCriterion("market_value >=", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueLessThan(Double value) {
            addCriterion("market_value <", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueLessThanOrEqualTo(Double value) {
            addCriterion("market_value <=", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueIn(List<Double> values) {
            addCriterion("market_value in", values, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotIn(List<Double> values) {
            addCriterion("market_value not in", values, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueBetween(Double value1, Double value2) {
            addCriterion("market_value between", value1, value2, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotBetween(Double value1, Double value2) {
            addCriterion("market_value not between", value1, value2, "marketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueIsNull() {
            addCriterion("circulation_market_value is null");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueIsNotNull() {
            addCriterion("circulation_market_value is not null");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueEqualTo(Double value) {
            addCriterion("circulation_market_value =", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueNotEqualTo(Double value) {
            addCriterion("circulation_market_value <>", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueGreaterThan(Double value) {
            addCriterion("circulation_market_value >", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueGreaterThanOrEqualTo(Double value) {
            addCriterion("circulation_market_value >=", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueLessThan(Double value) {
            addCriterion("circulation_market_value <", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueLessThanOrEqualTo(Double value) {
            addCriterion("circulation_market_value <=", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueIn(List<Double> values) {
            addCriterion("circulation_market_value in", values, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueNotIn(List<Double> values) {
            addCriterion("circulation_market_value not in", values, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueBetween(Double value1, Double value2) {
            addCriterion("circulation_market_value between", value1, value2, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueNotBetween(Double value1, Double value2) {
            addCriterion("circulation_market_value not between", value1, value2, "circulationMarketValue");
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