package com.ex.user.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrgUserExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgUserExample() {
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

        public Criteria andUlIdIsNull() {
            addCriterion("UL_ID is null");
            return (Criteria) this;
        }

        public Criteria andUlIdIsNotNull() {
            addCriterion("UL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUlIdEqualTo(String value) {
            addCriterion("UL_ID =", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotEqualTo(String value) {
            addCriterion("UL_ID <>", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdGreaterThan(String value) {
            addCriterion("UL_ID >", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdGreaterThanOrEqualTo(String value) {
            addCriterion("UL_ID >=", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdLessThan(String value) {
            addCriterion("UL_ID <", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdLessThanOrEqualTo(String value) {
            addCriterion("UL_ID <=", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdLike(String value) {
            addCriterion("UL_ID like", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotLike(String value) {
            addCriterion("UL_ID not like", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdIn(List<String> values) {
            addCriterion("UL_ID in", values, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotIn(List<String> values) {
            addCriterion("UL_ID not in", values, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdBetween(String value1, String value2) {
            addCriterion("UL_ID between", value1, value2, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotBetween(String value1, String value2) {
            addCriterion("UL_ID not between", value1, value2, "ulId");
            return (Criteria) this;
        }

        public Criteria andUUsernameIsNull() {
            addCriterion("U_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUUsernameIsNotNull() {
            addCriterion("U_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUUsernameEqualTo(String value) {
            addCriterion("U_USERNAME =", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotEqualTo(String value) {
            addCriterion("U_USERNAME <>", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThan(String value) {
            addCriterion("U_USERNAME >", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("U_USERNAME >=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThan(String value) {
            addCriterion("U_USERNAME <", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThanOrEqualTo(String value) {
            addCriterion("U_USERNAME <=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLike(String value) {
            addCriterion("U_USERNAME like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotLike(String value) {
            addCriterion("U_USERNAME not like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameIn(List<String> values) {
            addCriterion("U_USERNAME in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotIn(List<String> values) {
            addCriterion("U_USERNAME not in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameBetween(String value1, String value2) {
            addCriterion("U_USERNAME between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotBetween(String value1, String value2) {
            addCriterion("U_USERNAME not between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUPassIsNull() {
            addCriterion("U_PASS is null");
            return (Criteria) this;
        }

        public Criteria andUPassIsNotNull() {
            addCriterion("U_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andUPassEqualTo(String value) {
            addCriterion("U_PASS =", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotEqualTo(String value) {
            addCriterion("U_PASS <>", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThan(String value) {
            addCriterion("U_PASS >", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThanOrEqualTo(String value) {
            addCriterion("U_PASS >=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThan(String value) {
            addCriterion("U_PASS <", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThanOrEqualTo(String value) {
            addCriterion("U_PASS <=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLike(String value) {
            addCriterion("U_PASS like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotLike(String value) {
            addCriterion("U_PASS not like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassIn(List<String> values) {
            addCriterion("U_PASS in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotIn(List<String> values) {
            addCriterion("U_PASS not in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassBetween(String value1, String value2) {
            addCriterion("U_PASS between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotBetween(String value1, String value2) {
            addCriterion("U_PASS not between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andUTruenameIsNull() {
            addCriterion("U_TRUENAME is null");
            return (Criteria) this;
        }

        public Criteria andUTruenameIsNotNull() {
            addCriterion("U_TRUENAME is not null");
            return (Criteria) this;
        }

        public Criteria andUTruenameEqualTo(String value) {
            addCriterion("U_TRUENAME =", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameNotEqualTo(String value) {
            addCriterion("U_TRUENAME <>", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameGreaterThan(String value) {
            addCriterion("U_TRUENAME >", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("U_TRUENAME >=", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameLessThan(String value) {
            addCriterion("U_TRUENAME <", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameLessThanOrEqualTo(String value) {
            addCriterion("U_TRUENAME <=", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameLike(String value) {
            addCriterion("U_TRUENAME like", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameNotLike(String value) {
            addCriterion("U_TRUENAME not like", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameIn(List<String> values) {
            addCriterion("U_TRUENAME in", values, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameNotIn(List<String> values) {
            addCriterion("U_TRUENAME not in", values, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameBetween(String value1, String value2) {
            addCriterion("U_TRUENAME between", value1, value2, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameNotBetween(String value1, String value2) {
            addCriterion("U_TRUENAME not between", value1, value2, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("U_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("U_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(Integer value) {
            addCriterion("U_SEX =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(Integer value) {
            addCriterion("U_SEX <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(Integer value) {
            addCriterion("U_SEX >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_SEX >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(Integer value) {
            addCriterion("U_SEX <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(Integer value) {
            addCriterion("U_SEX <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<Integer> values) {
            addCriterion("U_SEX in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<Integer> values) {
            addCriterion("U_SEX not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(Integer value1, Integer value2) {
            addCriterion("U_SEX between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(Integer value1, Integer value2) {
            addCriterion("U_SEX not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUMobileIsNull() {
            addCriterion("U_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUMobileIsNotNull() {
            addCriterion("U_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUMobileEqualTo(String value) {
            addCriterion("U_MOBILE =", value, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileNotEqualTo(String value) {
            addCriterion("U_MOBILE <>", value, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileGreaterThan(String value) {
            addCriterion("U_MOBILE >", value, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileGreaterThanOrEqualTo(String value) {
            addCriterion("U_MOBILE >=", value, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileLessThan(String value) {
            addCriterion("U_MOBILE <", value, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileLessThanOrEqualTo(String value) {
            addCriterion("U_MOBILE <=", value, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileLike(String value) {
            addCriterion("U_MOBILE like", value, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileNotLike(String value) {
            addCriterion("U_MOBILE not like", value, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileIn(List<String> values) {
            addCriterion("U_MOBILE in", values, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileNotIn(List<String> values) {
            addCriterion("U_MOBILE not in", values, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileBetween(String value1, String value2) {
            addCriterion("U_MOBILE between", value1, value2, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUMobileNotBetween(String value1, String value2) {
            addCriterion("U_MOBILE not between", value1, value2, "uMobile");
            return (Criteria) this;
        }

        public Criteria andUOfficetelIsNull() {
            addCriterion("U_OFFICETEL is null");
            return (Criteria) this;
        }

        public Criteria andUOfficetelIsNotNull() {
            addCriterion("U_OFFICETEL is not null");
            return (Criteria) this;
        }

        public Criteria andUOfficetelEqualTo(String value) {
            addCriterion("U_OFFICETEL =", value, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelNotEqualTo(String value) {
            addCriterion("U_OFFICETEL <>", value, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelGreaterThan(String value) {
            addCriterion("U_OFFICETEL >", value, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelGreaterThanOrEqualTo(String value) {
            addCriterion("U_OFFICETEL >=", value, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelLessThan(String value) {
            addCriterion("U_OFFICETEL <", value, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelLessThanOrEqualTo(String value) {
            addCriterion("U_OFFICETEL <=", value, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelLike(String value) {
            addCriterion("U_OFFICETEL like", value, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelNotLike(String value) {
            addCriterion("U_OFFICETEL not like", value, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelIn(List<String> values) {
            addCriterion("U_OFFICETEL in", values, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelNotIn(List<String> values) {
            addCriterion("U_OFFICETEL not in", values, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelBetween(String value1, String value2) {
            addCriterion("U_OFFICETEL between", value1, value2, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficetelNotBetween(String value1, String value2) {
            addCriterion("U_OFFICETEL not between", value1, value2, "uOfficetel");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumIsNull() {
            addCriterion("U_OFFICEAREANUM is null");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumIsNotNull() {
            addCriterion("U_OFFICEAREANUM is not null");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumEqualTo(String value) {
            addCriterion("U_OFFICEAREANUM =", value, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumNotEqualTo(String value) {
            addCriterion("U_OFFICEAREANUM <>", value, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumGreaterThan(String value) {
            addCriterion("U_OFFICEAREANUM >", value, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumGreaterThanOrEqualTo(String value) {
            addCriterion("U_OFFICEAREANUM >=", value, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumLessThan(String value) {
            addCriterion("U_OFFICEAREANUM <", value, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumLessThanOrEqualTo(String value) {
            addCriterion("U_OFFICEAREANUM <=", value, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumLike(String value) {
            addCriterion("U_OFFICEAREANUM like", value, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumNotLike(String value) {
            addCriterion("U_OFFICEAREANUM not like", value, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumIn(List<String> values) {
            addCriterion("U_OFFICEAREANUM in", values, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumNotIn(List<String> values) {
            addCriterion("U_OFFICEAREANUM not in", values, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumBetween(String value1, String value2) {
            addCriterion("U_OFFICEAREANUM between", value1, value2, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficeareanumNotBetween(String value1, String value2) {
            addCriterion("U_OFFICEAREANUM not between", value1, value2, "uOfficeareanum");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubIsNull() {
            addCriterion("U_OFFICETELSUB is null");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubIsNotNull() {
            addCriterion("U_OFFICETELSUB is not null");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubEqualTo(String value) {
            addCriterion("U_OFFICETELSUB =", value, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubNotEqualTo(String value) {
            addCriterion("U_OFFICETELSUB <>", value, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubGreaterThan(String value) {
            addCriterion("U_OFFICETELSUB >", value, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubGreaterThanOrEqualTo(String value) {
            addCriterion("U_OFFICETELSUB >=", value, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubLessThan(String value) {
            addCriterion("U_OFFICETELSUB <", value, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubLessThanOrEqualTo(String value) {
            addCriterion("U_OFFICETELSUB <=", value, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubLike(String value) {
            addCriterion("U_OFFICETELSUB like", value, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubNotLike(String value) {
            addCriterion("U_OFFICETELSUB not like", value, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubIn(List<String> values) {
            addCriterion("U_OFFICETELSUB in", values, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubNotIn(List<String> values) {
            addCriterion("U_OFFICETELSUB not in", values, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubBetween(String value1, String value2) {
            addCriterion("U_OFFICETELSUB between", value1, value2, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUOfficetelsubNotBetween(String value1, String value2) {
            addCriterion("U_OFFICETELSUB not between", value1, value2, "uOfficetelsub");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumIsNull() {
            addCriterion("U_HOMEAREANUM is null");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumIsNotNull() {
            addCriterion("U_HOMEAREANUM is not null");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumEqualTo(String value) {
            addCriterion("U_HOMEAREANUM =", value, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumNotEqualTo(String value) {
            addCriterion("U_HOMEAREANUM <>", value, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumGreaterThan(String value) {
            addCriterion("U_HOMEAREANUM >", value, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumGreaterThanOrEqualTo(String value) {
            addCriterion("U_HOMEAREANUM >=", value, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumLessThan(String value) {
            addCriterion("U_HOMEAREANUM <", value, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumLessThanOrEqualTo(String value) {
            addCriterion("U_HOMEAREANUM <=", value, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumLike(String value) {
            addCriterion("U_HOMEAREANUM like", value, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumNotLike(String value) {
            addCriterion("U_HOMEAREANUM not like", value, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumIn(List<String> values) {
            addCriterion("U_HOMEAREANUM in", values, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumNotIn(List<String> values) {
            addCriterion("U_HOMEAREANUM not in", values, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumBetween(String value1, String value2) {
            addCriterion("U_HOMEAREANUM between", value1, value2, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHomeareanumNotBetween(String value1, String value2) {
            addCriterion("U_HOMEAREANUM not between", value1, value2, "uHomeareanum");
            return (Criteria) this;
        }

        public Criteria andUHometelIsNull() {
            addCriterion("U_HOMETEL is null");
            return (Criteria) this;
        }

        public Criteria andUHometelIsNotNull() {
            addCriterion("U_HOMETEL is not null");
            return (Criteria) this;
        }

        public Criteria andUHometelEqualTo(String value) {
            addCriterion("U_HOMETEL =", value, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelNotEqualTo(String value) {
            addCriterion("U_HOMETEL <>", value, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelGreaterThan(String value) {
            addCriterion("U_HOMETEL >", value, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelGreaterThanOrEqualTo(String value) {
            addCriterion("U_HOMETEL >=", value, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelLessThan(String value) {
            addCriterion("U_HOMETEL <", value, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelLessThanOrEqualTo(String value) {
            addCriterion("U_HOMETEL <=", value, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelLike(String value) {
            addCriterion("U_HOMETEL like", value, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelNotLike(String value) {
            addCriterion("U_HOMETEL not like", value, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelIn(List<String> values) {
            addCriterion("U_HOMETEL in", values, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelNotIn(List<String> values) {
            addCriterion("U_HOMETEL not in", values, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelBetween(String value1, String value2) {
            addCriterion("U_HOMETEL between", value1, value2, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUHometelNotBetween(String value1, String value2) {
            addCriterion("U_HOMETEL not between", value1, value2, "uHometel");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("U_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("U_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("U_EMAIL =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("U_EMAIL <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("U_EMAIL >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("U_EMAIL >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("U_EMAIL <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("U_EMAIL <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("U_EMAIL like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("U_EMAIL not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("U_EMAIL in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("U_EMAIL not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("U_EMAIL between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("U_EMAIL not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUWeixinidIsNull() {
            addCriterion("U_WEIXINID is null");
            return (Criteria) this;
        }

        public Criteria andUWeixinidIsNotNull() {
            addCriterion("U_WEIXINID is not null");
            return (Criteria) this;
        }

        public Criteria andUWeixinidEqualTo(String value) {
            addCriterion("U_WEIXINID =", value, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidNotEqualTo(String value) {
            addCriterion("U_WEIXINID <>", value, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidGreaterThan(String value) {
            addCriterion("U_WEIXINID >", value, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidGreaterThanOrEqualTo(String value) {
            addCriterion("U_WEIXINID >=", value, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidLessThan(String value) {
            addCriterion("U_WEIXINID <", value, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidLessThanOrEqualTo(String value) {
            addCriterion("U_WEIXINID <=", value, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidLike(String value) {
            addCriterion("U_WEIXINID like", value, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidNotLike(String value) {
            addCriterion("U_WEIXINID not like", value, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidIn(List<String> values) {
            addCriterion("U_WEIXINID in", values, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidNotIn(List<String> values) {
            addCriterion("U_WEIXINID not in", values, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidBetween(String value1, String value2) {
            addCriterion("U_WEIXINID between", value1, value2, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUWeixinidNotBetween(String value1, String value2) {
            addCriterion("U_WEIXINID not between", value1, value2, "uWeixinid");
            return (Criteria) this;
        }

        public Criteria andUHeadiconIsNull() {
            addCriterion("U_HEADICON is null");
            return (Criteria) this;
        }

        public Criteria andUHeadiconIsNotNull() {
            addCriterion("U_HEADICON is not null");
            return (Criteria) this;
        }

        public Criteria andUHeadiconEqualTo(String value) {
            addCriterion("U_HEADICON =", value, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconNotEqualTo(String value) {
            addCriterion("U_HEADICON <>", value, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconGreaterThan(String value) {
            addCriterion("U_HEADICON >", value, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconGreaterThanOrEqualTo(String value) {
            addCriterion("U_HEADICON >=", value, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconLessThan(String value) {
            addCriterion("U_HEADICON <", value, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconLessThanOrEqualTo(String value) {
            addCriterion("U_HEADICON <=", value, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconLike(String value) {
            addCriterion("U_HEADICON like", value, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconNotLike(String value) {
            addCriterion("U_HEADICON not like", value, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconIn(List<String> values) {
            addCriterion("U_HEADICON in", values, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconNotIn(List<String> values) {
            addCriterion("U_HEADICON not in", values, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconBetween(String value1, String value2) {
            addCriterion("U_HEADICON between", value1, value2, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUHeadiconNotBetween(String value1, String value2) {
            addCriterion("U_HEADICON not between", value1, value2, "uHeadicon");
            return (Criteria) this;
        }

        public Criteria andUIsstopIsNull() {
            addCriterion("U_ISSTOP is null");
            return (Criteria) this;
        }

        public Criteria andUIsstopIsNotNull() {
            addCriterion("U_ISSTOP is not null");
            return (Criteria) this;
        }

        public Criteria andUIsstopEqualTo(Integer value) {
            addCriterion("U_ISSTOP =", value, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsstopNotEqualTo(Integer value) {
            addCriterion("U_ISSTOP <>", value, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsstopGreaterThan(Integer value) {
            addCriterion("U_ISSTOP >", value, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ISSTOP >=", value, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsstopLessThan(Integer value) {
            addCriterion("U_ISSTOP <", value, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsstopLessThanOrEqualTo(Integer value) {
            addCriterion("U_ISSTOP <=", value, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsstopIn(List<Integer> values) {
            addCriterion("U_ISSTOP in", values, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsstopNotIn(List<Integer> values) {
            addCriterion("U_ISSTOP not in", values, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsstopBetween(Integer value1, Integer value2) {
            addCriterion("U_ISSTOP between", value1, value2, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsstopNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ISSTOP not between", value1, value2, "uIsstop");
            return (Criteria) this;
        }

        public Criteria andUIsadminIsNull() {
            addCriterion("U_ISADMIN is null");
            return (Criteria) this;
        }

        public Criteria andUIsadminIsNotNull() {
            addCriterion("U_ISADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andUIsadminEqualTo(Integer value) {
            addCriterion("U_ISADMIN =", value, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUIsadminNotEqualTo(Integer value) {
            addCriterion("U_ISADMIN <>", value, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUIsadminGreaterThan(Integer value) {
            addCriterion("U_ISADMIN >", value, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUIsadminGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ISADMIN >=", value, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUIsadminLessThan(Integer value) {
            addCriterion("U_ISADMIN <", value, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUIsadminLessThanOrEqualTo(Integer value) {
            addCriterion("U_ISADMIN <=", value, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUIsadminIn(List<Integer> values) {
            addCriterion("U_ISADMIN in", values, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUIsadminNotIn(List<Integer> values) {
            addCriterion("U_ISADMIN not in", values, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUIsadminBetween(Integer value1, Integer value2) {
            addCriterion("U_ISADMIN between", value1, value2, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUIsadminNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ISADMIN not between", value1, value2, "uIsadmin");
            return (Criteria) this;
        }

        public Criteria andUSecretIsNull() {
            addCriterion("U_SECRET is null");
            return (Criteria) this;
        }

        public Criteria andUSecretIsNotNull() {
            addCriterion("U_SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andUSecretEqualTo(Integer value) {
            addCriterion("U_SECRET =", value, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUSecretNotEqualTo(Integer value) {
            addCriterion("U_SECRET <>", value, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUSecretGreaterThan(Integer value) {
            addCriterion("U_SECRET >", value, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUSecretGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_SECRET >=", value, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUSecretLessThan(Integer value) {
            addCriterion("U_SECRET <", value, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUSecretLessThanOrEqualTo(Integer value) {
            addCriterion("U_SECRET <=", value, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUSecretIn(List<Integer> values) {
            addCriterion("U_SECRET in", values, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUSecretNotIn(List<Integer> values) {
            addCriterion("U_SECRET not in", values, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUSecretBetween(Integer value1, Integer value2) {
            addCriterion("U_SECRET between", value1, value2, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUSecretNotBetween(Integer value1, Integer value2) {
            addCriterion("U_SECRET not between", value1, value2, "uSecret");
            return (Criteria) this;
        }

        public Criteria andUIndexIsNull() {
            addCriterion("U_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andUIndexIsNotNull() {
            addCriterion("U_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andUIndexEqualTo(Integer value) {
            addCriterion("U_INDEX =", value, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUIndexNotEqualTo(Integer value) {
            addCriterion("U_INDEX <>", value, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUIndexGreaterThan(Integer value) {
            addCriterion("U_INDEX >", value, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_INDEX >=", value, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUIndexLessThan(Integer value) {
            addCriterion("U_INDEX <", value, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUIndexLessThanOrEqualTo(Integer value) {
            addCriterion("U_INDEX <=", value, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUIndexIn(List<Integer> values) {
            addCriterion("U_INDEX in", values, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUIndexNotIn(List<Integer> values) {
            addCriterion("U_INDEX not in", values, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUIndexBetween(Integer value1, Integer value2) {
            addCriterion("U_INDEX between", value1, value2, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("U_INDEX not between", value1, value2, "uIndex");
            return (Criteria) this;
        }

        public Criteria andUOutsideIsNull() {
            addCriterion("U_OUTSIDE is null");
            return (Criteria) this;
        }

        public Criteria andUOutsideIsNotNull() {
            addCriterion("U_OUTSIDE is not null");
            return (Criteria) this;
        }

        public Criteria andUOutsideEqualTo(Integer value) {
            addCriterion("U_OUTSIDE =", value, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUOutsideNotEqualTo(Integer value) {
            addCriterion("U_OUTSIDE <>", value, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUOutsideGreaterThan(Integer value) {
            addCriterion("U_OUTSIDE >", value, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUOutsideGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_OUTSIDE >=", value, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUOutsideLessThan(Integer value) {
            addCriterion("U_OUTSIDE <", value, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUOutsideLessThanOrEqualTo(Integer value) {
            addCriterion("U_OUTSIDE <=", value, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUOutsideIn(List<Integer> values) {
            addCriterion("U_OUTSIDE in", values, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUOutsideNotIn(List<Integer> values) {
            addCriterion("U_OUTSIDE not in", values, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUOutsideBetween(Integer value1, Integer value2) {
            addCriterion("U_OUTSIDE between", value1, value2, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUOutsideNotBetween(Integer value1, Integer value2) {
            addCriterion("U_OUTSIDE not between", value1, value2, "uOutside");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeIsNull() {
            addCriterion("U_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeIsNotNull() {
            addCriterion("U_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeEqualTo(Date value) {
            addCriterion("U_CREATETIME =", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeNotEqualTo(Date value) {
            addCriterion("U_CREATETIME <>", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeGreaterThan(Date value) {
            addCriterion("U_CREATETIME >", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("U_CREATETIME >=", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeLessThan(Date value) {
            addCriterion("U_CREATETIME <", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("U_CREATETIME <=", value, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeIn(List<Date> values) {
            addCriterion("U_CREATETIME in", values, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeNotIn(List<Date> values) {
            addCriterion("U_CREATETIME not in", values, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeBetween(Date value1, Date value2) {
            addCriterion("U_CREATETIME between", value1, value2, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("U_CREATETIME not between", value1, value2, "uCreatetime");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidIsNull() {
            addCriterion("U_CREATEDEPID is null");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidIsNotNull() {
            addCriterion("U_CREATEDEPID is not null");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidEqualTo(String value) {
            addCriterion("U_CREATEDEPID =", value, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidNotEqualTo(String value) {
            addCriterion("U_CREATEDEPID <>", value, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidGreaterThan(String value) {
            addCriterion("U_CREATEDEPID >", value, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidGreaterThanOrEqualTo(String value) {
            addCriterion("U_CREATEDEPID >=", value, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidLessThan(String value) {
            addCriterion("U_CREATEDEPID <", value, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidLessThanOrEqualTo(String value) {
            addCriterion("U_CREATEDEPID <=", value, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidLike(String value) {
            addCriterion("U_CREATEDEPID like", value, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidNotLike(String value) {
            addCriterion("U_CREATEDEPID not like", value, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidIn(List<String> values) {
            addCriterion("U_CREATEDEPID in", values, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidNotIn(List<String> values) {
            addCriterion("U_CREATEDEPID not in", values, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidBetween(String value1, String value2) {
            addCriterion("U_CREATEDEPID between", value1, value2, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreatedepidNotBetween(String value1, String value2) {
            addCriterion("U_CREATEDEPID not between", value1, value2, "uCreatedepid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridIsNull() {
            addCriterion("U_CREATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridIsNotNull() {
            addCriterion("U_CREATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridEqualTo(String value) {
            addCriterion("U_CREATEUSERID =", value, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridNotEqualTo(String value) {
            addCriterion("U_CREATEUSERID <>", value, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridGreaterThan(String value) {
            addCriterion("U_CREATEUSERID >", value, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("U_CREATEUSERID >=", value, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridLessThan(String value) {
            addCriterion("U_CREATEUSERID <", value, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("U_CREATEUSERID <=", value, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridLike(String value) {
            addCriterion("U_CREATEUSERID like", value, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridNotLike(String value) {
            addCriterion("U_CREATEUSERID not like", value, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridIn(List<String> values) {
            addCriterion("U_CREATEUSERID in", values, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridNotIn(List<String> values) {
            addCriterion("U_CREATEUSERID not in", values, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridBetween(String value1, String value2) {
            addCriterion("U_CREATEUSERID between", value1, value2, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUCreateuseridNotBetween(String value1, String value2) {
            addCriterion("U_CREATEUSERID not between", value1, value2, "uCreateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeIsNull() {
            addCriterion("U_UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeIsNotNull() {
            addCriterion("U_UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeEqualTo(Date value) {
            addCriterion("U_UPDATETIME =", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeNotEqualTo(Date value) {
            addCriterion("U_UPDATETIME <>", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeGreaterThan(Date value) {
            addCriterion("U_UPDATETIME >", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("U_UPDATETIME >=", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeLessThan(Date value) {
            addCriterion("U_UPDATETIME <", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("U_UPDATETIME <=", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeIn(List<Date> values) {
            addCriterion("U_UPDATETIME in", values, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeNotIn(List<Date> values) {
            addCriterion("U_UPDATETIME not in", values, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("U_UPDATETIME between", value1, value2, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("U_UPDATETIME not between", value1, value2, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidIsNull() {
            addCriterion("U_UPDATEDEPID is null");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidIsNotNull() {
            addCriterion("U_UPDATEDEPID is not null");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidEqualTo(String value) {
            addCriterion("U_UPDATEDEPID =", value, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidNotEqualTo(String value) {
            addCriterion("U_UPDATEDEPID <>", value, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidGreaterThan(String value) {
            addCriterion("U_UPDATEDEPID >", value, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidGreaterThanOrEqualTo(String value) {
            addCriterion("U_UPDATEDEPID >=", value, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidLessThan(String value) {
            addCriterion("U_UPDATEDEPID <", value, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidLessThanOrEqualTo(String value) {
            addCriterion("U_UPDATEDEPID <=", value, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidLike(String value) {
            addCriterion("U_UPDATEDEPID like", value, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidNotLike(String value) {
            addCriterion("U_UPDATEDEPID not like", value, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidIn(List<String> values) {
            addCriterion("U_UPDATEDEPID in", values, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidNotIn(List<String> values) {
            addCriterion("U_UPDATEDEPID not in", values, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidBetween(String value1, String value2) {
            addCriterion("U_UPDATEDEPID between", value1, value2, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdatedepidNotBetween(String value1, String value2) {
            addCriterion("U_UPDATEDEPID not between", value1, value2, "uUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridIsNull() {
            addCriterion("U_UPDATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridIsNotNull() {
            addCriterion("U_UPDATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridEqualTo(String value) {
            addCriterion("U_UPDATEUSERID =", value, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridNotEqualTo(String value) {
            addCriterion("U_UPDATEUSERID <>", value, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridGreaterThan(String value) {
            addCriterion("U_UPDATEUSERID >", value, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("U_UPDATEUSERID >=", value, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridLessThan(String value) {
            addCriterion("U_UPDATEUSERID <", value, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("U_UPDATEUSERID <=", value, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridLike(String value) {
            addCriterion("U_UPDATEUSERID like", value, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridNotLike(String value) {
            addCriterion("U_UPDATEUSERID not like", value, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridIn(List<String> values) {
            addCriterion("U_UPDATEUSERID in", values, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridNotIn(List<String> values) {
            addCriterion("U_UPDATEUSERID not in", values, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridBetween(String value1, String value2) {
            addCriterion("U_UPDATEUSERID between", value1, value2, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("U_UPDATEUSERID not between", value1, value2, "uUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andUStoptimeIsNull() {
            addCriterion("U_STOPTIME is null");
            return (Criteria) this;
        }

        public Criteria andUStoptimeIsNotNull() {
            addCriterion("U_STOPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUStoptimeEqualTo(Date value) {
            addCriterion("U_STOPTIME =", value, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStoptimeNotEqualTo(Date value) {
            addCriterion("U_STOPTIME <>", value, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStoptimeGreaterThan(Date value) {
            addCriterion("U_STOPTIME >", value, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStoptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("U_STOPTIME >=", value, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStoptimeLessThan(Date value) {
            addCriterion("U_STOPTIME <", value, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStoptimeLessThanOrEqualTo(Date value) {
            addCriterion("U_STOPTIME <=", value, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStoptimeIn(List<Date> values) {
            addCriterion("U_STOPTIME in", values, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStoptimeNotIn(List<Date> values) {
            addCriterion("U_STOPTIME not in", values, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStoptimeBetween(Date value1, Date value2) {
            addCriterion("U_STOPTIME between", value1, value2, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStoptimeNotBetween(Date value1, Date value2) {
            addCriterion("U_STOPTIME not between", value1, value2, "uStoptime");
            return (Criteria) this;
        }

        public Criteria andUStopdepidIsNull() {
            addCriterion("U_STOPDEPID is null");
            return (Criteria) this;
        }

        public Criteria andUStopdepidIsNotNull() {
            addCriterion("U_STOPDEPID is not null");
            return (Criteria) this;
        }

        public Criteria andUStopdepidEqualTo(String value) {
            addCriterion("U_STOPDEPID =", value, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidNotEqualTo(String value) {
            addCriterion("U_STOPDEPID <>", value, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidGreaterThan(String value) {
            addCriterion("U_STOPDEPID >", value, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidGreaterThanOrEqualTo(String value) {
            addCriterion("U_STOPDEPID >=", value, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidLessThan(String value) {
            addCriterion("U_STOPDEPID <", value, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidLessThanOrEqualTo(String value) {
            addCriterion("U_STOPDEPID <=", value, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidLike(String value) {
            addCriterion("U_STOPDEPID like", value, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidNotLike(String value) {
            addCriterion("U_STOPDEPID not like", value, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidIn(List<String> values) {
            addCriterion("U_STOPDEPID in", values, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidNotIn(List<String> values) {
            addCriterion("U_STOPDEPID not in", values, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidBetween(String value1, String value2) {
            addCriterion("U_STOPDEPID between", value1, value2, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopdepidNotBetween(String value1, String value2) {
            addCriterion("U_STOPDEPID not between", value1, value2, "uStopdepid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridIsNull() {
            addCriterion("U_STOPUSERID is null");
            return (Criteria) this;
        }

        public Criteria andUStopuseridIsNotNull() {
            addCriterion("U_STOPUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andUStopuseridEqualTo(String value) {
            addCriterion("U_STOPUSERID =", value, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridNotEqualTo(String value) {
            addCriterion("U_STOPUSERID <>", value, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridGreaterThan(String value) {
            addCriterion("U_STOPUSERID >", value, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridGreaterThanOrEqualTo(String value) {
            addCriterion("U_STOPUSERID >=", value, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridLessThan(String value) {
            addCriterion("U_STOPUSERID <", value, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridLessThanOrEqualTo(String value) {
            addCriterion("U_STOPUSERID <=", value, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridLike(String value) {
            addCriterion("U_STOPUSERID like", value, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridNotLike(String value) {
            addCriterion("U_STOPUSERID not like", value, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridIn(List<String> values) {
            addCriterion("U_STOPUSERID in", values, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridNotIn(List<String> values) {
            addCriterion("U_STOPUSERID not in", values, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridBetween(String value1, String value2) {
            addCriterion("U_STOPUSERID between", value1, value2, "uStopuserid");
            return (Criteria) this;
        }

        public Criteria andUStopuseridNotBetween(String value1, String value2) {
            addCriterion("U_STOPUSERID not between", value1, value2, "uStopuserid");
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