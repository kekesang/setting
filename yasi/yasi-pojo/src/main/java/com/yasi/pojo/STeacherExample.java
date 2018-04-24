package com.yasi.pojo;

import java.util.ArrayList;
import java.util.List;

public class STeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public STeacherExample() {
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

        public Criteria andTeaNoIsNull() {
            addCriterion("tea_no is null");
            return (Criteria) this;
        }

        public Criteria andTeaNoIsNotNull() {
            addCriterion("tea_no is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNoEqualTo(String value) {
            addCriterion("tea_no =", value, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoNotEqualTo(String value) {
            addCriterion("tea_no <>", value, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoGreaterThan(String value) {
            addCriterion("tea_no >", value, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoGreaterThanOrEqualTo(String value) {
            addCriterion("tea_no >=", value, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoLessThan(String value) {
            addCriterion("tea_no <", value, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoLessThanOrEqualTo(String value) {
            addCriterion("tea_no <=", value, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoLike(String value) {
            addCriterion("tea_no like", value, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoNotLike(String value) {
            addCriterion("tea_no not like", value, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoIn(List<String> values) {
            addCriterion("tea_no in", values, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoNotIn(List<String> values) {
            addCriterion("tea_no not in", values, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoBetween(String value1, String value2) {
            addCriterion("tea_no between", value1, value2, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNoNotBetween(String value1, String value2) {
            addCriterion("tea_no not between", value1, value2, "teaNo");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaMajorIsNull() {
            addCriterion("tea_major is null");
            return (Criteria) this;
        }

        public Criteria andTeaMajorIsNotNull() {
            addCriterion("tea_major is not null");
            return (Criteria) this;
        }

        public Criteria andTeaMajorEqualTo(String value) {
            addCriterion("tea_major =", value, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorNotEqualTo(String value) {
            addCriterion("tea_major <>", value, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorGreaterThan(String value) {
            addCriterion("tea_major >", value, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorGreaterThanOrEqualTo(String value) {
            addCriterion("tea_major >=", value, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorLessThan(String value) {
            addCriterion("tea_major <", value, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorLessThanOrEqualTo(String value) {
            addCriterion("tea_major <=", value, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorLike(String value) {
            addCriterion("tea_major like", value, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorNotLike(String value) {
            addCriterion("tea_major not like", value, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorIn(List<String> values) {
            addCriterion("tea_major in", values, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorNotIn(List<String> values) {
            addCriterion("tea_major not in", values, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorBetween(String value1, String value2) {
            addCriterion("tea_major between", value1, value2, "teaMajor");
            return (Criteria) this;
        }

        public Criteria andTeaMajorNotBetween(String value1, String value2) {
            addCriterion("tea_major not between", value1, value2, "teaMajor");
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