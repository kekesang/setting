package com.yasi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SClassExample() {
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

        public Criteria andClassNoIsNull() {
            addCriterion("class_no is null");
            return (Criteria) this;
        }

        public Criteria andClassNoIsNotNull() {
            addCriterion("class_no is not null");
            return (Criteria) this;
        }

        public Criteria andClassNoEqualTo(String value) {
            addCriterion("class_no =", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotEqualTo(String value) {
            addCriterion("class_no <>", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThan(String value) {
            addCriterion("class_no >", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoGreaterThanOrEqualTo(String value) {
            addCriterion("class_no >=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThan(String value) {
            addCriterion("class_no <", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLessThanOrEqualTo(String value) {
            addCriterion("class_no <=", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoLike(String value) {
            addCriterion("class_no like", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotLike(String value) {
            addCriterion("class_no not like", value, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoIn(List<String> values) {
            addCriterion("class_no in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotIn(List<String> values) {
            addCriterion("class_no not in", values, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoBetween(String value1, String value2) {
            addCriterion("class_no between", value1, value2, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNoNotBetween(String value1, String value2) {
            addCriterion("class_no not between", value1, value2, "classNo");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassPriceIsNull() {
            addCriterion("class_price is null");
            return (Criteria) this;
        }

        public Criteria andClassPriceIsNotNull() {
            addCriterion("class_price is not null");
            return (Criteria) this;
        }

        public Criteria andClassPriceEqualTo(Integer value) {
            addCriterion("class_price =", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceNotEqualTo(Integer value) {
            addCriterion("class_price <>", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceGreaterThan(Integer value) {
            addCriterion("class_price >", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_price >=", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceLessThan(Integer value) {
            addCriterion("class_price <", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceLessThanOrEqualTo(Integer value) {
            addCriterion("class_price <=", value, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceIn(List<Integer> values) {
            addCriterion("class_price in", values, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceNotIn(List<Integer> values) {
            addCriterion("class_price not in", values, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceBetween(Integer value1, Integer value2) {
            addCriterion("class_price between", value1, value2, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("class_price not between", value1, value2, "classPrice");
            return (Criteria) this;
        }

        public Criteria andClassNumsIsNull() {
            addCriterion("class_nums is null");
            return (Criteria) this;
        }

        public Criteria andClassNumsIsNotNull() {
            addCriterion("class_nums is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumsEqualTo(Integer value) {
            addCriterion("class_nums =", value, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassNumsNotEqualTo(Integer value) {
            addCriterion("class_nums <>", value, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassNumsGreaterThan(Integer value) {
            addCriterion("class_nums >", value, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_nums >=", value, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassNumsLessThan(Integer value) {
            addCriterion("class_nums <", value, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassNumsLessThanOrEqualTo(Integer value) {
            addCriterion("class_nums <=", value, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassNumsIn(List<Integer> values) {
            addCriterion("class_nums in", values, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassNumsNotIn(List<Integer> values) {
            addCriterion("class_nums not in", values, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassNumsBetween(Integer value1, Integer value2) {
            addCriterion("class_nums between", value1, value2, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("class_nums not between", value1, value2, "classNums");
            return (Criteria) this;
        }

        public Criteria andClassTeanoIsNull() {
            addCriterion("class_teano is null");
            return (Criteria) this;
        }

        public Criteria andClassTeanoIsNotNull() {
            addCriterion("class_teano is not null");
            return (Criteria) this;
        }

        public Criteria andClassTeanoEqualTo(String value) {
            addCriterion("class_teano =", value, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoNotEqualTo(String value) {
            addCriterion("class_teano <>", value, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoGreaterThan(String value) {
            addCriterion("class_teano >", value, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoGreaterThanOrEqualTo(String value) {
            addCriterion("class_teano >=", value, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoLessThan(String value) {
            addCriterion("class_teano <", value, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoLessThanOrEqualTo(String value) {
            addCriterion("class_teano <=", value, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoLike(String value) {
            addCriterion("class_teano like", value, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoNotLike(String value) {
            addCriterion("class_teano not like", value, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoIn(List<String> values) {
            addCriterion("class_teano in", values, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoNotIn(List<String> values) {
            addCriterion("class_teano not in", values, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoBetween(String value1, String value2) {
            addCriterion("class_teano between", value1, value2, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassTeanoNotBetween(String value1, String value2) {
            addCriterion("class_teano not between", value1, value2, "classTeano");
            return (Criteria) this;
        }

        public Criteria andClassAddressIsNull() {
            addCriterion("class_address is null");
            return (Criteria) this;
        }

        public Criteria andClassAddressIsNotNull() {
            addCriterion("class_address is not null");
            return (Criteria) this;
        }

        public Criteria andClassAddressEqualTo(String value) {
            addCriterion("class_address =", value, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressNotEqualTo(String value) {
            addCriterion("class_address <>", value, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressGreaterThan(String value) {
            addCriterion("class_address >", value, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressGreaterThanOrEqualTo(String value) {
            addCriterion("class_address >=", value, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressLessThan(String value) {
            addCriterion("class_address <", value, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressLessThanOrEqualTo(String value) {
            addCriterion("class_address <=", value, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressLike(String value) {
            addCriterion("class_address like", value, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressNotLike(String value) {
            addCriterion("class_address not like", value, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressIn(List<String> values) {
            addCriterion("class_address in", values, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressNotIn(List<String> values) {
            addCriterion("class_address not in", values, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressBetween(String value1, String value2) {
            addCriterion("class_address between", value1, value2, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassAddressNotBetween(String value1, String value2) {
            addCriterion("class_address not between", value1, value2, "classAddress");
            return (Criteria) this;
        }

        public Criteria andClassBeginIsNull() {
            addCriterion("class_begin is null");
            return (Criteria) this;
        }

        public Criteria andClassBeginIsNotNull() {
            addCriterion("class_begin is not null");
            return (Criteria) this;
        }

        public Criteria andClassBeginEqualTo(Date value) {
            addCriterion("class_begin =", value, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassBeginNotEqualTo(Date value) {
            addCriterion("class_begin <>", value, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassBeginGreaterThan(Date value) {
            addCriterion("class_begin >", value, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("class_begin >=", value, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassBeginLessThan(Date value) {
            addCriterion("class_begin <", value, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassBeginLessThanOrEqualTo(Date value) {
            addCriterion("class_begin <=", value, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassBeginIn(List<Date> values) {
            addCriterion("class_begin in", values, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassBeginNotIn(List<Date> values) {
            addCriterion("class_begin not in", values, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassBeginBetween(Date value1, Date value2) {
            addCriterion("class_begin between", value1, value2, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassBeginNotBetween(Date value1, Date value2) {
            addCriterion("class_begin not between", value1, value2, "classBegin");
            return (Criteria) this;
        }

        public Criteria andClassEndIsNull() {
            addCriterion("class_end is null");
            return (Criteria) this;
        }

        public Criteria andClassEndIsNotNull() {
            addCriterion("class_end is not null");
            return (Criteria) this;
        }

        public Criteria andClassEndEqualTo(Date value) {
            addCriterion("class_end =", value, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassEndNotEqualTo(Date value) {
            addCriterion("class_end <>", value, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassEndGreaterThan(Date value) {
            addCriterion("class_end >", value, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassEndGreaterThanOrEqualTo(Date value) {
            addCriterion("class_end >=", value, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassEndLessThan(Date value) {
            addCriterion("class_end <", value, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassEndLessThanOrEqualTo(Date value) {
            addCriterion("class_end <=", value, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassEndIn(List<Date> values) {
            addCriterion("class_end in", values, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassEndNotIn(List<Date> values) {
            addCriterion("class_end not in", values, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassEndBetween(Date value1, Date value2) {
            addCriterion("class_end between", value1, value2, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassEndNotBetween(Date value1, Date value2) {
            addCriterion("class_end not between", value1, value2, "classEnd");
            return (Criteria) this;
        }

        public Criteria andClassCnoIsNull() {
            addCriterion("class_cno is null");
            return (Criteria) this;
        }

        public Criteria andClassCnoIsNotNull() {
            addCriterion("class_cno is not null");
            return (Criteria) this;
        }

        public Criteria andClassCnoEqualTo(String value) {
            addCriterion("class_cno =", value, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoNotEqualTo(String value) {
            addCriterion("class_cno <>", value, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoGreaterThan(String value) {
            addCriterion("class_cno >", value, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoGreaterThanOrEqualTo(String value) {
            addCriterion("class_cno >=", value, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoLessThan(String value) {
            addCriterion("class_cno <", value, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoLessThanOrEqualTo(String value) {
            addCriterion("class_cno <=", value, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoLike(String value) {
            addCriterion("class_cno like", value, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoNotLike(String value) {
            addCriterion("class_cno not like", value, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoIn(List<String> values) {
            addCriterion("class_cno in", values, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoNotIn(List<String> values) {
            addCriterion("class_cno not in", values, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoBetween(String value1, String value2) {
            addCriterion("class_cno between", value1, value2, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassCnoNotBetween(String value1, String value2) {
            addCriterion("class_cno not between", value1, value2, "classCno");
            return (Criteria) this;
        }

        public Criteria andClassStatusIsNull() {
            addCriterion("class_status is null");
            return (Criteria) this;
        }

        public Criteria andClassStatusIsNotNull() {
            addCriterion("class_status is not null");
            return (Criteria) this;
        }

        public Criteria andClassStatusEqualTo(String value) {
            addCriterion("class_status =", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotEqualTo(String value) {
            addCriterion("class_status <>", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusGreaterThan(String value) {
            addCriterion("class_status >", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusGreaterThanOrEqualTo(String value) {
            addCriterion("class_status >=", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusLessThan(String value) {
            addCriterion("class_status <", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusLessThanOrEqualTo(String value) {
            addCriterion("class_status <=", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusLike(String value) {
            addCriterion("class_status like", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotLike(String value) {
            addCriterion("class_status not like", value, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusIn(List<String> values) {
            addCriterion("class_status in", values, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotIn(List<String> values) {
            addCriterion("class_status not in", values, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusBetween(String value1, String value2) {
            addCriterion("class_status between", value1, value2, "classStatus");
            return (Criteria) this;
        }

        public Criteria andClassStatusNotBetween(String value1, String value2) {
            addCriterion("class_status not between", value1, value2, "classStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andClassTotalIsNull() {
            addCriterion("class_total is null");
            return (Criteria) this;
        }

        public Criteria andClassTotalIsNotNull() {
            addCriterion("class_total is not null");
            return (Criteria) this;
        }

        public Criteria andClassTotalEqualTo(Integer value) {
            addCriterion("class_total =", value, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassTotalNotEqualTo(Integer value) {
            addCriterion("class_total <>", value, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassTotalGreaterThan(Integer value) {
            addCriterion("class_total >", value, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_total >=", value, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassTotalLessThan(Integer value) {
            addCriterion("class_total <", value, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassTotalLessThanOrEqualTo(Integer value) {
            addCriterion("class_total <=", value, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassTotalIn(List<Integer> values) {
            addCriterion("class_total in", values, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassTotalNotIn(List<Integer> values) {
            addCriterion("class_total not in", values, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassTotalBetween(Integer value1, Integer value2) {
            addCriterion("class_total between", value1, value2, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("class_total not between", value1, value2, "classTotal");
            return (Criteria) this;
        }

        public Criteria andClassInIsNull() {
            addCriterion("class_in is null");
            return (Criteria) this;
        }

        public Criteria andClassInIsNotNull() {
            addCriterion("class_in is not null");
            return (Criteria) this;
        }

        public Criteria andClassInEqualTo(Integer value) {
            addCriterion("class_in =", value, "classIn");
            return (Criteria) this;
        }

        public Criteria andClassInNotEqualTo(Integer value) {
            addCriterion("class_in <>", value, "classIn");
            return (Criteria) this;
        }

        public Criteria andClassInGreaterThan(Integer value) {
            addCriterion("class_in >", value, "classIn");
            return (Criteria) this;
        }

        public Criteria andClassInGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_in >=", value, "classIn");
            return (Criteria) this;
        }

        public Criteria andClassInLessThan(Integer value) {
            addCriterion("class_in <", value, "classIn");
            return (Criteria) this;
        }

        public Criteria andClassInLessThanOrEqualTo(Integer value) {
            addCriterion("class_in <=", value, "classIn");
            return (Criteria) this;
        }

        public Criteria andClassInIn(List<Integer> values) {
            addCriterion("class_in in", values, "classIn");
            return (Criteria) this;
        }

        public Criteria andClassInNotIn(List<Integer> values) {
            addCriterion("class_in not in", values, "classIn");
            return (Criteria) this;
        }

        public Criteria andClassInBetween(Integer value1, Integer value2) {
            addCriterion("class_in between", value1, value2, "classIn");
            return (Criteria) this;
        }

        public Criteria andClassInNotBetween(Integer value1, Integer value2) {
            addCriterion("class_in not between", value1, value2, "classIn");
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