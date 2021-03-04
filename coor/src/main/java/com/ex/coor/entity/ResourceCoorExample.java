package com.ex.coor.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResourceCoorExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceCoorExample() {
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

        public Criteria andCooridIsNull() {
            addCriterion("COORID is null");
            return (Criteria) this;
        }

        public Criteria andCooridIsNotNull() {
            addCriterion("COORID is not null");
            return (Criteria) this;
        }

        public Criteria andCooridEqualTo(String value) {
            addCriterion("COORID =", value, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridNotEqualTo(String value) {
            addCriterion("COORID <>", value, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridGreaterThan(String value) {
            addCriterion("COORID >", value, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridGreaterThanOrEqualTo(String value) {
            addCriterion("COORID >=", value, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridLessThan(String value) {
            addCriterion("COORID <", value, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridLessThanOrEqualTo(String value) {
            addCriterion("COORID <=", value, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridLike(String value) {
            addCriterion("COORID like", value, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridNotLike(String value) {
            addCriterion("COORID not like", value, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridIn(List<String> values) {
            addCriterion("COORID in", values, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridNotIn(List<String> values) {
            addCriterion("COORID not in", values, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridBetween(String value1, String value2) {
            addCriterion("COORID between", value1, value2, "coorid");
            return (Criteria) this;
        }

        public Criteria andCooridNotBetween(String value1, String value2) {
            addCriterion("COORID not between", value1, value2, "coorid");
            return (Criteria) this;
        }

        public Criteria andResourceidIsNull() {
            addCriterion("RESOURCEID is null");
            return (Criteria) this;
        }

        public Criteria andResourceidIsNotNull() {
            addCriterion("RESOURCEID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceidEqualTo(String value) {
            addCriterion("RESOURCEID =", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotEqualTo(String value) {
            addCriterion("RESOURCEID <>", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidGreaterThan(String value) {
            addCriterion("RESOURCEID >", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCEID >=", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLessThan(String value) {
            addCriterion("RESOURCEID <", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLessThanOrEqualTo(String value) {
            addCriterion("RESOURCEID <=", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidLike(String value) {
            addCriterion("RESOURCEID like", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotLike(String value) {
            addCriterion("RESOURCEID not like", value, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidIn(List<String> values) {
            addCriterion("RESOURCEID in", values, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotIn(List<String> values) {
            addCriterion("RESOURCEID not in", values, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidBetween(String value1, String value2) {
            addCriterion("RESOURCEID between", value1, value2, "resourceid");
            return (Criteria) this;
        }

        public Criteria andResourceidNotBetween(String value1, String value2) {
            addCriterion("RESOURCEID not between", value1, value2, "resourceid");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNull() {
            addCriterion("CT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCtIdIsNotNull() {
            addCriterion("CT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCtIdEqualTo(String value) {
            addCriterion("CT_ID =", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotEqualTo(String value) {
            addCriterion("CT_ID <>", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThan(String value) {
            addCriterion("CT_ID >", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdGreaterThanOrEqualTo(String value) {
            addCriterion("CT_ID >=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThan(String value) {
            addCriterion("CT_ID <", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLessThanOrEqualTo(String value) {
            addCriterion("CT_ID <=", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdLike(String value) {
            addCriterion("CT_ID like", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotLike(String value) {
            addCriterion("CT_ID not like", value, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdIn(List<String> values) {
            addCriterion("CT_ID in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotIn(List<String> values) {
            addCriterion("CT_ID not in", values, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdBetween(String value1, String value2) {
            addCriterion("CT_ID between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andCtIdNotBetween(String value1, String value2) {
            addCriterion("CT_ID not between", value1, value2, "ctId");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("X is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("X is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(Short value) {
            addCriterion("X =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(Short value) {
            addCriterion("X <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(Short value) {
            addCriterion("X >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(Short value) {
            addCriterion("X >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(Short value) {
            addCriterion("X <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(Short value) {
            addCriterion("X <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<Short> values) {
            addCriterion("X in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<Short> values) {
            addCriterion("X not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(Short value1, Short value2) {
            addCriterion("X between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(Short value1, Short value2) {
            addCriterion("X not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("Y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("Y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(Short value) {
            addCriterion("Y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(Short value) {
            addCriterion("Y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(Short value) {
            addCriterion("Y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(Short value) {
            addCriterion("Y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(Short value) {
            addCriterion("Y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(Short value) {
            addCriterion("Y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<Short> values) {
            addCriterion("Y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<Short> values) {
            addCriterion("Y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(Short value1, Short value2) {
            addCriterion("Y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(Short value1, Short value2) {
            addCriterion("Y not between", value1, value2, "y");
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