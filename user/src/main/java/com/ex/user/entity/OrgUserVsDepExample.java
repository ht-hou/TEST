package com.ex.user.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrgUserVsDepExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgUserVsDepExample() {
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

        public Criteria andUdIdIsNull() {
            addCriterion("UD_ID is null");
            return (Criteria) this;
        }

        public Criteria andUdIdIsNotNull() {
            addCriterion("UD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUdIdEqualTo(String value) {
            addCriterion("UD_ID =", value, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdNotEqualTo(String value) {
            addCriterion("UD_ID <>", value, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdGreaterThan(String value) {
            addCriterion("UD_ID >", value, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdGreaterThanOrEqualTo(String value) {
            addCriterion("UD_ID >=", value, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdLessThan(String value) {
            addCriterion("UD_ID <", value, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdLessThanOrEqualTo(String value) {
            addCriterion("UD_ID <=", value, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdLike(String value) {
            addCriterion("UD_ID like", value, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdNotLike(String value) {
            addCriterion("UD_ID not like", value, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdIn(List<String> values) {
            addCriterion("UD_ID in", values, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdNotIn(List<String> values) {
            addCriterion("UD_ID not in", values, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdBetween(String value1, String value2) {
            addCriterion("UD_ID between", value1, value2, "udId");
            return (Criteria) this;
        }

        public Criteria andUdIdNotBetween(String value1, String value2) {
            addCriterion("UD_ID not between", value1, value2, "udId");
            return (Criteria) this;
        }

        public Criteria andDIdIsNull() {
            addCriterion("D_ID is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(String value) {
            addCriterion("D_ID =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(String value) {
            addCriterion("D_ID <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(String value) {
            addCriterion("D_ID >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(String value) {
            addCriterion("D_ID >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(String value) {
            addCriterion("D_ID <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(String value) {
            addCriterion("D_ID <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLike(String value) {
            addCriterion("D_ID like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotLike(String value) {
            addCriterion("D_ID not like", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<String> values) {
            addCriterion("D_ID in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<String> values) {
            addCriterion("D_ID not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(String value1, String value2) {
            addCriterion("D_ID between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(String value1, String value2) {
            addCriterion("D_ID not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("U_ID like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("U_ID not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andKeshiidIsNull() {
            addCriterion("KESHIID is null");
            return (Criteria) this;
        }

        public Criteria andKeshiidIsNotNull() {
            addCriterion("KESHIID is not null");
            return (Criteria) this;
        }

        public Criteria andKeshiidEqualTo(String value) {
            addCriterion("KESHIID =", value, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidNotEqualTo(String value) {
            addCriterion("KESHIID <>", value, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidGreaterThan(String value) {
            addCriterion("KESHIID >", value, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidGreaterThanOrEqualTo(String value) {
            addCriterion("KESHIID >=", value, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidLessThan(String value) {
            addCriterion("KESHIID <", value, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidLessThanOrEqualTo(String value) {
            addCriterion("KESHIID <=", value, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidLike(String value) {
            addCriterion("KESHIID like", value, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidNotLike(String value) {
            addCriterion("KESHIID not like", value, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidIn(List<String> values) {
            addCriterion("KESHIID in", values, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidNotIn(List<String> values) {
            addCriterion("KESHIID not in", values, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidBetween(String value1, String value2) {
            addCriterion("KESHIID between", value1, value2, "keshiid");
            return (Criteria) this;
        }

        public Criteria andKeshiidNotBetween(String value1, String value2) {
            addCriterion("KESHIID not between", value1, value2, "keshiid");
            return (Criteria) this;
        }

        public Criteria andUdPositionIsNull() {
            addCriterion("UD_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andUdPositionIsNotNull() {
            addCriterion("UD_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andUdPositionEqualTo(String value) {
            addCriterion("UD_POSITION =", value, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionNotEqualTo(String value) {
            addCriterion("UD_POSITION <>", value, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionGreaterThan(String value) {
            addCriterion("UD_POSITION >", value, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionGreaterThanOrEqualTo(String value) {
            addCriterion("UD_POSITION >=", value, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionLessThan(String value) {
            addCriterion("UD_POSITION <", value, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionLessThanOrEqualTo(String value) {
            addCriterion("UD_POSITION <=", value, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionLike(String value) {
            addCriterion("UD_POSITION like", value, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionNotLike(String value) {
            addCriterion("UD_POSITION not like", value, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionIn(List<String> values) {
            addCriterion("UD_POSITION in", values, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionNotIn(List<String> values) {
            addCriterion("UD_POSITION not in", values, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionBetween(String value1, String value2) {
            addCriterion("UD_POSITION between", value1, value2, "udPosition");
            return (Criteria) this;
        }

        public Criteria andUdPositionNotBetween(String value1, String value2) {
            addCriterion("UD_POSITION not between", value1, value2, "udPosition");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexIsNull() {
            addCriterion("DEPCONNTACTINDEX is null");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexIsNotNull() {
            addCriterion("DEPCONNTACTINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexEqualTo(Integer value) {
            addCriterion("DEPCONNTACTINDEX =", value, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexNotEqualTo(Integer value) {
            addCriterion("DEPCONNTACTINDEX <>", value, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexGreaterThan(Integer value) {
            addCriterion("DEPCONNTACTINDEX >", value, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPCONNTACTINDEX >=", value, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexLessThan(Integer value) {
            addCriterion("DEPCONNTACTINDEX <", value, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexLessThanOrEqualTo(Integer value) {
            addCriterion("DEPCONNTACTINDEX <=", value, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexIn(List<Integer> values) {
            addCriterion("DEPCONNTACTINDEX in", values, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexNotIn(List<Integer> values) {
            addCriterion("DEPCONNTACTINDEX not in", values, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexBetween(Integer value1, Integer value2) {
            addCriterion("DEPCONNTACTINDEX between", value1, value2, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andDepconntactindexNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPCONNTACTINDEX not between", value1, value2, "depconntactindex");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("ROLEID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("ROLEID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("ROLEID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("ROLEID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("ROLEID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("ROLEID like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("ROLEID not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("ROLEID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("ROLEID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("ROLEID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("ROLEID not between", value1, value2, "roleid");
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