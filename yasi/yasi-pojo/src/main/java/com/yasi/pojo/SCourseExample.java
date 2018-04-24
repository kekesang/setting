package com.yasi.pojo;

import java.util.ArrayList;
import java.util.List;

public class SCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SCourseExample() {
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

        public Criteria andCNoIsNull() {
            addCriterion("c_no is null");
            return (Criteria) this;
        }

        public Criteria andCNoIsNotNull() {
            addCriterion("c_no is not null");
            return (Criteria) this;
        }

        public Criteria andCNoEqualTo(String value) {
            addCriterion("c_no =", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotEqualTo(String value) {
            addCriterion("c_no <>", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoGreaterThan(String value) {
            addCriterion("c_no >", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoGreaterThanOrEqualTo(String value) {
            addCriterion("c_no >=", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLessThan(String value) {
            addCriterion("c_no <", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLessThanOrEqualTo(String value) {
            addCriterion("c_no <=", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoLike(String value) {
            addCriterion("c_no like", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotLike(String value) {
            addCriterion("c_no not like", value, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoIn(List<String> values) {
            addCriterion("c_no in", values, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotIn(List<String> values) {
            addCriterion("c_no not in", values, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoBetween(String value1, String value2) {
            addCriterion("c_no between", value1, value2, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNoNotBetween(String value1, String value2) {
            addCriterion("c_no not between", value1, value2, "cNo");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCMajorIsNull() {
            addCriterion("c_major is null");
            return (Criteria) this;
        }

        public Criteria andCMajorIsNotNull() {
            addCriterion("c_major is not null");
            return (Criteria) this;
        }

        public Criteria andCMajorEqualTo(String value) {
            addCriterion("c_major =", value, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorNotEqualTo(String value) {
            addCriterion("c_major <>", value, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorGreaterThan(String value) {
            addCriterion("c_major >", value, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorGreaterThanOrEqualTo(String value) {
            addCriterion("c_major >=", value, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorLessThan(String value) {
            addCriterion("c_major <", value, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorLessThanOrEqualTo(String value) {
            addCriterion("c_major <=", value, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorLike(String value) {
            addCriterion("c_major like", value, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorNotLike(String value) {
            addCriterion("c_major not like", value, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorIn(List<String> values) {
            addCriterion("c_major in", values, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorNotIn(List<String> values) {
            addCriterion("c_major not in", values, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorBetween(String value1, String value2) {
            addCriterion("c_major between", value1, value2, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCMajorNotBetween(String value1, String value2) {
            addCriterion("c_major not between", value1, value2, "cMajor");
            return (Criteria) this;
        }

        public Criteria andCAidIsNull() {
            addCriterion("c_aid is null");
            return (Criteria) this;
        }

        public Criteria andCAidIsNotNull() {
            addCriterion("c_aid is not null");
            return (Criteria) this;
        }

        public Criteria andCAidEqualTo(String value) {
            addCriterion("c_aid =", value, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidNotEqualTo(String value) {
            addCriterion("c_aid <>", value, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidGreaterThan(String value) {
            addCriterion("c_aid >", value, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidGreaterThanOrEqualTo(String value) {
            addCriterion("c_aid >=", value, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidLessThan(String value) {
            addCriterion("c_aid <", value, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidLessThanOrEqualTo(String value) {
            addCriterion("c_aid <=", value, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidLike(String value) {
            addCriterion("c_aid like", value, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidNotLike(String value) {
            addCriterion("c_aid not like", value, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidIn(List<String> values) {
            addCriterion("c_aid in", values, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidNotIn(List<String> values) {
            addCriterion("c_aid not in", values, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidBetween(String value1, String value2) {
            addCriterion("c_aid between", value1, value2, "cAid");
            return (Criteria) this;
        }

        public Criteria andCAidNotBetween(String value1, String value2) {
            addCriterion("c_aid not between", value1, value2, "cAid");
            return (Criteria) this;
        }

        public Criteria andCContentIsNull() {
            addCriterion("c_content is null");
            return (Criteria) this;
        }

        public Criteria andCContentIsNotNull() {
            addCriterion("c_content is not null");
            return (Criteria) this;
        }

        public Criteria andCContentEqualTo(String value) {
            addCriterion("c_content =", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotEqualTo(String value) {
            addCriterion("c_content <>", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThan(String value) {
            addCriterion("c_content >", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThanOrEqualTo(String value) {
            addCriterion("c_content >=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThan(String value) {
            addCriterion("c_content <", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThanOrEqualTo(String value) {
            addCriterion("c_content <=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLike(String value) {
            addCriterion("c_content like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotLike(String value) {
            addCriterion("c_content not like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentIn(List<String> values) {
            addCriterion("c_content in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotIn(List<String> values) {
            addCriterion("c_content not in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentBetween(String value1, String value2) {
            addCriterion("c_content between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotBetween(String value1, String value2) {
            addCriterion("c_content not between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCCatenoIsNull() {
            addCriterion("c_cateno is null");
            return (Criteria) this;
        }

        public Criteria andCCatenoIsNotNull() {
            addCriterion("c_cateno is not null");
            return (Criteria) this;
        }

        public Criteria andCCatenoEqualTo(String value) {
            addCriterion("c_cateno =", value, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoNotEqualTo(String value) {
            addCriterion("c_cateno <>", value, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoGreaterThan(String value) {
            addCriterion("c_cateno >", value, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoGreaterThanOrEqualTo(String value) {
            addCriterion("c_cateno >=", value, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoLessThan(String value) {
            addCriterion("c_cateno <", value, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoLessThanOrEqualTo(String value) {
            addCriterion("c_cateno <=", value, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoLike(String value) {
            addCriterion("c_cateno like", value, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoNotLike(String value) {
            addCriterion("c_cateno not like", value, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoIn(List<String> values) {
            addCriterion("c_cateno in", values, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoNotIn(List<String> values) {
            addCriterion("c_cateno not in", values, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoBetween(String value1, String value2) {
            addCriterion("c_cateno between", value1, value2, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCCatenoNotBetween(String value1, String value2) {
            addCriterion("c_cateno not between", value1, value2, "cCateno");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNull() {
            addCriterion("c_type is null");
            return (Criteria) this;
        }

        public Criteria andCTypeIsNotNull() {
            addCriterion("c_type is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeEqualTo(String value) {
            addCriterion("c_type =", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotEqualTo(String value) {
            addCriterion("c_type <>", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThan(String value) {
            addCriterion("c_type >", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeGreaterThanOrEqualTo(String value) {
            addCriterion("c_type >=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThan(String value) {
            addCriterion("c_type <", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLessThanOrEqualTo(String value) {
            addCriterion("c_type <=", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeLike(String value) {
            addCriterion("c_type like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotLike(String value) {
            addCriterion("c_type not like", value, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeIn(List<String> values) {
            addCriterion("c_type in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotIn(List<String> values) {
            addCriterion("c_type not in", values, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeBetween(String value1, String value2) {
            addCriterion("c_type between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCTypeNotBetween(String value1, String value2) {
            addCriterion("c_type not between", value1, value2, "cType");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNull() {
            addCriterion("c_price is null");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNotNull() {
            addCriterion("c_price is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceEqualTo(Integer value) {
            addCriterion("c_price =", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotEqualTo(Integer value) {
            addCriterion("c_price <>", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThan(Integer value) {
            addCriterion("c_price >", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_price >=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThan(Integer value) {
            addCriterion("c_price <", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThanOrEqualTo(Integer value) {
            addCriterion("c_price <=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceIn(List<Integer> values) {
            addCriterion("c_price in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotIn(List<Integer> values) {
            addCriterion("c_price not in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceBetween(Integer value1, Integer value2) {
            addCriterion("c_price between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("c_price not between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCDpriceIsNull() {
            addCriterion("c_dprice is null");
            return (Criteria) this;
        }

        public Criteria andCDpriceIsNotNull() {
            addCriterion("c_dprice is not null");
            return (Criteria) this;
        }

        public Criteria andCDpriceEqualTo(Integer value) {
            addCriterion("c_dprice =", value, "cDprice");
            return (Criteria) this;
        }

        public Criteria andCDpriceNotEqualTo(Integer value) {
            addCriterion("c_dprice <>", value, "cDprice");
            return (Criteria) this;
        }

        public Criteria andCDpriceGreaterThan(Integer value) {
            addCriterion("c_dprice >", value, "cDprice");
            return (Criteria) this;
        }

        public Criteria andCDpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_dprice >=", value, "cDprice");
            return (Criteria) this;
        }

        public Criteria andCDpriceLessThan(Integer value) {
            addCriterion("c_dprice <", value, "cDprice");
            return (Criteria) this;
        }

        public Criteria andCDpriceLessThanOrEqualTo(Integer value) {
            addCriterion("c_dprice <=", value, "cDprice");
            return (Criteria) this;
        }

        public Criteria andCDpriceIn(List<Integer> values) {
            addCriterion("c_dprice in", values, "cDprice");
            return (Criteria) this;
        }

        public Criteria andCDpriceNotIn(List<Integer> values) {
            addCriterion("c_dprice not in", values, "cDprice");
            return (Criteria) this;
        }

        public Criteria andCDpriceBetween(Integer value1, Integer value2) {
            addCriterion("c_dprice between", value1, value2, "cDprice");
            return (Criteria) this;
        }

        public Criteria andCDpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("c_dprice not between", value1, value2, "cDprice");
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