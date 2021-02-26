package com.ex.user.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrgDepartmentExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgDepartmentExample() {
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

        public Criteria andDiIdIsNull() {
            addCriterion("DI_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiIdIsNotNull() {
            addCriterion("DI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiIdEqualTo(String value) {
            addCriterion("DI_ID =", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdNotEqualTo(String value) {
            addCriterion("DI_ID <>", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdGreaterThan(String value) {
            addCriterion("DI_ID >", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdGreaterThanOrEqualTo(String value) {
            addCriterion("DI_ID >=", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdLessThan(String value) {
            addCriterion("DI_ID <", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdLessThanOrEqualTo(String value) {
            addCriterion("DI_ID <=", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdLike(String value) {
            addCriterion("DI_ID like", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdNotLike(String value) {
            addCriterion("DI_ID not like", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdIn(List<String> values) {
            addCriterion("DI_ID in", values, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdNotIn(List<String> values) {
            addCriterion("DI_ID not in", values, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdBetween(String value1, String value2) {
            addCriterion("DI_ID between", value1, value2, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdNotBetween(String value1, String value2) {
            addCriterion("DI_ID not between", value1, value2, "diId");
            return (Criteria) this;
        }

        public Criteria andMemidIsNull() {
            addCriterion("MEMID is null");
            return (Criteria) this;
        }

        public Criteria andMemidIsNotNull() {
            addCriterion("MEMID is not null");
            return (Criteria) this;
        }

        public Criteria andMemidEqualTo(String value) {
            addCriterion("MEMID =", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotEqualTo(String value) {
            addCriterion("MEMID <>", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidGreaterThan(String value) {
            addCriterion("MEMID >", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidGreaterThanOrEqualTo(String value) {
            addCriterion("MEMID >=", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidLessThan(String value) {
            addCriterion("MEMID <", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidLessThanOrEqualTo(String value) {
            addCriterion("MEMID <=", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidLike(String value) {
            addCriterion("MEMID like", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotLike(String value) {
            addCriterion("MEMID not like", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidIn(List<String> values) {
            addCriterion("MEMID in", values, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotIn(List<String> values) {
            addCriterion("MEMID not in", values, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidBetween(String value1, String value2) {
            addCriterion("MEMID between", value1, value2, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotBetween(String value1, String value2) {
            addCriterion("MEMID not between", value1, value2, "memid");
            return (Criteria) this;
        }

        public Criteria andDPdidIsNull() {
            addCriterion("D_PDID is null");
            return (Criteria) this;
        }

        public Criteria andDPdidIsNotNull() {
            addCriterion("D_PDID is not null");
            return (Criteria) this;
        }

        public Criteria andDPdidEqualTo(String value) {
            addCriterion("D_PDID =", value, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidNotEqualTo(String value) {
            addCriterion("D_PDID <>", value, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidGreaterThan(String value) {
            addCriterion("D_PDID >", value, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidGreaterThanOrEqualTo(String value) {
            addCriterion("D_PDID >=", value, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidLessThan(String value) {
            addCriterion("D_PDID <", value, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidLessThanOrEqualTo(String value) {
            addCriterion("D_PDID <=", value, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidLike(String value) {
            addCriterion("D_PDID like", value, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidNotLike(String value) {
            addCriterion("D_PDID not like", value, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidIn(List<String> values) {
            addCriterion("D_PDID in", values, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidNotIn(List<String> values) {
            addCriterion("D_PDID not in", values, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidBetween(String value1, String value2) {
            addCriterion("D_PDID between", value1, value2, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidNotBetween(String value1, String value2) {
            addCriterion("D_PDID not between", value1, value2, "dPdid");
            return (Criteria) this;
        }

        public Criteria andDPdidlistIsNull() {
            addCriterion("D_PDIDLIST is null");
            return (Criteria) this;
        }

        public Criteria andDPdidlistIsNotNull() {
            addCriterion("D_PDIDLIST is not null");
            return (Criteria) this;
        }

        public Criteria andDPdidlistEqualTo(String value) {
            addCriterion("D_PDIDLIST =", value, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistNotEqualTo(String value) {
            addCriterion("D_PDIDLIST <>", value, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistGreaterThan(String value) {
            addCriterion("D_PDIDLIST >", value, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistGreaterThanOrEqualTo(String value) {
            addCriterion("D_PDIDLIST >=", value, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistLessThan(String value) {
            addCriterion("D_PDIDLIST <", value, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistLessThanOrEqualTo(String value) {
            addCriterion("D_PDIDLIST <=", value, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistLike(String value) {
            addCriterion("D_PDIDLIST like", value, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistNotLike(String value) {
            addCriterion("D_PDIDLIST not like", value, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistIn(List<String> values) {
            addCriterion("D_PDIDLIST in", values, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistNotIn(List<String> values) {
            addCriterion("D_PDIDLIST not in", values, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistBetween(String value1, String value2) {
            addCriterion("D_PDIDLIST between", value1, value2, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistNotBetween(String value1, String value2) {
            addCriterion("D_PDIDLIST not between", value1, value2, "dPdidlist");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnIsNull() {
            addCriterion("D_PDIDLISTCN is null");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnIsNotNull() {
            addCriterion("D_PDIDLISTCN is not null");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnEqualTo(String value) {
            addCriterion("D_PDIDLISTCN =", value, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnNotEqualTo(String value) {
            addCriterion("D_PDIDLISTCN <>", value, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnGreaterThan(String value) {
            addCriterion("D_PDIDLISTCN >", value, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnGreaterThanOrEqualTo(String value) {
            addCriterion("D_PDIDLISTCN >=", value, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnLessThan(String value) {
            addCriterion("D_PDIDLISTCN <", value, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnLessThanOrEqualTo(String value) {
            addCriterion("D_PDIDLISTCN <=", value, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnLike(String value) {
            addCriterion("D_PDIDLISTCN like", value, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnNotLike(String value) {
            addCriterion("D_PDIDLISTCN not like", value, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnIn(List<String> values) {
            addCriterion("D_PDIDLISTCN in", values, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnNotIn(List<String> values) {
            addCriterion("D_PDIDLISTCN not in", values, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnBetween(String value1, String value2) {
            addCriterion("D_PDIDLISTCN between", value1, value2, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDPdidlistcnNotBetween(String value1, String value2) {
            addCriterion("D_PDIDLISTCN not between", value1, value2, "dPdidlistcn");
            return (Criteria) this;
        }

        public Criteria andDHaschildIsNull() {
            addCriterion("D_HASCHILD is null");
            return (Criteria) this;
        }

        public Criteria andDHaschildIsNotNull() {
            addCriterion("D_HASCHILD is not null");
            return (Criteria) this;
        }

        public Criteria andDHaschildEqualTo(Integer value) {
            addCriterion("D_HASCHILD =", value, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDHaschildNotEqualTo(Integer value) {
            addCriterion("D_HASCHILD <>", value, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDHaschildGreaterThan(Integer value) {
            addCriterion("D_HASCHILD >", value, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDHaschildGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_HASCHILD >=", value, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDHaschildLessThan(Integer value) {
            addCriterion("D_HASCHILD <", value, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDHaschildLessThanOrEqualTo(Integer value) {
            addCriterion("D_HASCHILD <=", value, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDHaschildIn(List<Integer> values) {
            addCriterion("D_HASCHILD in", values, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDHaschildNotIn(List<Integer> values) {
            addCriterion("D_HASCHILD not in", values, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDHaschildBetween(Integer value1, Integer value2) {
            addCriterion("D_HASCHILD between", value1, value2, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDHaschildNotBetween(Integer value1, Integer value2) {
            addCriterion("D_HASCHILD not between", value1, value2, "dHaschild");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("D_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("D_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("D_NAME =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("D_NAME <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("D_NAME >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("D_NAME >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("D_NAME <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("D_NAME <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("D_NAME like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("D_NAME not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("D_NAME in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("D_NAME not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("D_NAME between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("D_NAME not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDEasynameIsNull() {
            addCriterion("D_EASYNAME is null");
            return (Criteria) this;
        }

        public Criteria andDEasynameIsNotNull() {
            addCriterion("D_EASYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDEasynameEqualTo(String value) {
            addCriterion("D_EASYNAME =", value, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameNotEqualTo(String value) {
            addCriterion("D_EASYNAME <>", value, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameGreaterThan(String value) {
            addCriterion("D_EASYNAME >", value, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameGreaterThanOrEqualTo(String value) {
            addCriterion("D_EASYNAME >=", value, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameLessThan(String value) {
            addCriterion("D_EASYNAME <", value, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameLessThanOrEqualTo(String value) {
            addCriterion("D_EASYNAME <=", value, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameLike(String value) {
            addCriterion("D_EASYNAME like", value, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameNotLike(String value) {
            addCriterion("D_EASYNAME not like", value, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameIn(List<String> values) {
            addCriterion("D_EASYNAME in", values, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameNotIn(List<String> values) {
            addCriterion("D_EASYNAME not in", values, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameBetween(String value1, String value2) {
            addCriterion("D_EASYNAME between", value1, value2, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDEasynameNotBetween(String value1, String value2) {
            addCriterion("D_EASYNAME not between", value1, value2, "dEasyname");
            return (Criteria) this;
        }

        public Criteria andDAddressIsNull() {
            addCriterion("D_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDAddressIsNotNull() {
            addCriterion("D_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDAddressEqualTo(String value) {
            addCriterion("D_ADDRESS =", value, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressNotEqualTo(String value) {
            addCriterion("D_ADDRESS <>", value, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressGreaterThan(String value) {
            addCriterion("D_ADDRESS >", value, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressGreaterThanOrEqualTo(String value) {
            addCriterion("D_ADDRESS >=", value, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressLessThan(String value) {
            addCriterion("D_ADDRESS <", value, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressLessThanOrEqualTo(String value) {
            addCriterion("D_ADDRESS <=", value, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressLike(String value) {
            addCriterion("D_ADDRESS like", value, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressNotLike(String value) {
            addCriterion("D_ADDRESS not like", value, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressIn(List<String> values) {
            addCriterion("D_ADDRESS in", values, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressNotIn(List<String> values) {
            addCriterion("D_ADDRESS not in", values, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressBetween(String value1, String value2) {
            addCriterion("D_ADDRESS between", value1, value2, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDAddressNotBetween(String value1, String value2) {
            addCriterion("D_ADDRESS not between", value1, value2, "dAddress");
            return (Criteria) this;
        }

        public Criteria andDPostcardIsNull() {
            addCriterion("D_POSTCARD is null");
            return (Criteria) this;
        }

        public Criteria andDPostcardIsNotNull() {
            addCriterion("D_POSTCARD is not null");
            return (Criteria) this;
        }

        public Criteria andDPostcardEqualTo(String value) {
            addCriterion("D_POSTCARD =", value, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardNotEqualTo(String value) {
            addCriterion("D_POSTCARD <>", value, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardGreaterThan(String value) {
            addCriterion("D_POSTCARD >", value, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardGreaterThanOrEqualTo(String value) {
            addCriterion("D_POSTCARD >=", value, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardLessThan(String value) {
            addCriterion("D_POSTCARD <", value, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardLessThanOrEqualTo(String value) {
            addCriterion("D_POSTCARD <=", value, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardLike(String value) {
            addCriterion("D_POSTCARD like", value, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardNotLike(String value) {
            addCriterion("D_POSTCARD not like", value, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardIn(List<String> values) {
            addCriterion("D_POSTCARD in", values, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardNotIn(List<String> values) {
            addCriterion("D_POSTCARD not in", values, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardBetween(String value1, String value2) {
            addCriterion("D_POSTCARD between", value1, value2, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDPostcardNotBetween(String value1, String value2) {
            addCriterion("D_POSTCARD not between", value1, value2, "dPostcard");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsIsNull() {
            addCriterion("D_SENDDUTYSMS is null");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsIsNotNull() {
            addCriterion("D_SENDDUTYSMS is not null");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsEqualTo(Integer value) {
            addCriterion("D_SENDDUTYSMS =", value, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsNotEqualTo(Integer value) {
            addCriterion("D_SENDDUTYSMS <>", value, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsGreaterThan(Integer value) {
            addCriterion("D_SENDDUTYSMS >", value, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_SENDDUTYSMS >=", value, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsLessThan(Integer value) {
            addCriterion("D_SENDDUTYSMS <", value, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsLessThanOrEqualTo(Integer value) {
            addCriterion("D_SENDDUTYSMS <=", value, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsIn(List<Integer> values) {
            addCriterion("D_SENDDUTYSMS in", values, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsNotIn(List<Integer> values) {
            addCriterion("D_SENDDUTYSMS not in", values, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsBetween(Integer value1, Integer value2) {
            addCriterion("D_SENDDUTYSMS between", value1, value2, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDSenddutysmsNotBetween(Integer value1, Integer value2) {
            addCriterion("D_SENDDUTYSMS not between", value1, value2, "dSenddutysms");
            return (Criteria) this;
        }

        public Criteria andDIndexIsNull() {
            addCriterion("D_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andDIndexIsNotNull() {
            addCriterion("D_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andDIndexEqualTo(Integer value) {
            addCriterion("D_INDEX =", value, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIndexNotEqualTo(Integer value) {
            addCriterion("D_INDEX <>", value, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIndexGreaterThan(Integer value) {
            addCriterion("D_INDEX >", value, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_INDEX >=", value, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIndexLessThan(Integer value) {
            addCriterion("D_INDEX <", value, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIndexLessThanOrEqualTo(Integer value) {
            addCriterion("D_INDEX <=", value, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIndexIn(List<Integer> values) {
            addCriterion("D_INDEX in", values, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIndexNotIn(List<Integer> values) {
            addCriterion("D_INDEX not in", values, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIndexBetween(Integer value1, Integer value2) {
            addCriterion("D_INDEX between", value1, value2, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("D_INDEX not between", value1, value2, "dIndex");
            return (Criteria) this;
        }

        public Criteria andDIsgroupIsNull() {
            addCriterion("D_ISGROUP is null");
            return (Criteria) this;
        }

        public Criteria andDIsgroupIsNotNull() {
            addCriterion("D_ISGROUP is not null");
            return (Criteria) this;
        }

        public Criteria andDIsgroupEqualTo(Integer value) {
            addCriterion("D_ISGROUP =", value, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsgroupNotEqualTo(Integer value) {
            addCriterion("D_ISGROUP <>", value, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsgroupGreaterThan(Integer value) {
            addCriterion("D_ISGROUP >", value, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsgroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_ISGROUP >=", value, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsgroupLessThan(Integer value) {
            addCriterion("D_ISGROUP <", value, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsgroupLessThanOrEqualTo(Integer value) {
            addCriterion("D_ISGROUP <=", value, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsgroupIn(List<Integer> values) {
            addCriterion("D_ISGROUP in", values, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsgroupNotIn(List<Integer> values) {
            addCriterion("D_ISGROUP not in", values, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsgroupBetween(Integer value1, Integer value2) {
            addCriterion("D_ISGROUP between", value1, value2, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsgroupNotBetween(Integer value1, Integer value2) {
            addCriterion("D_ISGROUP not between", value1, value2, "dIsgroup");
            return (Criteria) this;
        }

        public Criteria andDIsstopIsNull() {
            addCriterion("D_ISSTOP is null");
            return (Criteria) this;
        }

        public Criteria andDIsstopIsNotNull() {
            addCriterion("D_ISSTOP is not null");
            return (Criteria) this;
        }

        public Criteria andDIsstopEqualTo(Integer value) {
            addCriterion("D_ISSTOP =", value, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDIsstopNotEqualTo(Integer value) {
            addCriterion("D_ISSTOP <>", value, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDIsstopGreaterThan(Integer value) {
            addCriterion("D_ISSTOP >", value, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDIsstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_ISSTOP >=", value, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDIsstopLessThan(Integer value) {
            addCriterion("D_ISSTOP <", value, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDIsstopLessThanOrEqualTo(Integer value) {
            addCriterion("D_ISSTOP <=", value, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDIsstopIn(List<Integer> values) {
            addCriterion("D_ISSTOP in", values, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDIsstopNotIn(List<Integer> values) {
            addCriterion("D_ISSTOP not in", values, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDIsstopBetween(Integer value1, Integer value2) {
            addCriterion("D_ISSTOP between", value1, value2, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDIsstopNotBetween(Integer value1, Integer value2) {
            addCriterion("D_ISSTOP not between", value1, value2, "dIsstop");
            return (Criteria) this;
        }

        public Criteria andDLevelIsNull() {
            addCriterion("D_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDLevelIsNotNull() {
            addCriterion("D_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDLevelEqualTo(Integer value) {
            addCriterion("D_LEVEL =", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelNotEqualTo(Integer value) {
            addCriterion("D_LEVEL <>", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelGreaterThan(Integer value) {
            addCriterion("D_LEVEL >", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_LEVEL >=", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelLessThan(Integer value) {
            addCriterion("D_LEVEL <", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelLessThanOrEqualTo(Integer value) {
            addCriterion("D_LEVEL <=", value, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelIn(List<Integer> values) {
            addCriterion("D_LEVEL in", values, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelNotIn(List<Integer> values) {
            addCriterion("D_LEVEL not in", values, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelBetween(Integer value1, Integer value2) {
            addCriterion("D_LEVEL between", value1, value2, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("D_LEVEL not between", value1, value2, "dLevel");
            return (Criteria) this;
        }

        public Criteria andDCityIsNull() {
            addCriterion("D_CITY is null");
            return (Criteria) this;
        }

        public Criteria andDCityIsNotNull() {
            addCriterion("D_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andDCityEqualTo(String value) {
            addCriterion("D_CITY =", value, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityNotEqualTo(String value) {
            addCriterion("D_CITY <>", value, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityGreaterThan(String value) {
            addCriterion("D_CITY >", value, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityGreaterThanOrEqualTo(String value) {
            addCriterion("D_CITY >=", value, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityLessThan(String value) {
            addCriterion("D_CITY <", value, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityLessThanOrEqualTo(String value) {
            addCriterion("D_CITY <=", value, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityLike(String value) {
            addCriterion("D_CITY like", value, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityNotLike(String value) {
            addCriterion("D_CITY not like", value, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityIn(List<String> values) {
            addCriterion("D_CITY in", values, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityNotIn(List<String> values) {
            addCriterion("D_CITY not in", values, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityBetween(String value1, String value2) {
            addCriterion("D_CITY between", value1, value2, "dCity");
            return (Criteria) this;
        }

        public Criteria andDCityNotBetween(String value1, String value2) {
            addCriterion("D_CITY not between", value1, value2, "dCity");
            return (Criteria) this;
        }

        public Criteria andDDistrictIsNull() {
            addCriterion("D_DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andDDistrictIsNotNull() {
            addCriterion("D_DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andDDistrictEqualTo(String value) {
            addCriterion("D_DISTRICT =", value, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictNotEqualTo(String value) {
            addCriterion("D_DISTRICT <>", value, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictGreaterThan(String value) {
            addCriterion("D_DISTRICT >", value, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("D_DISTRICT >=", value, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictLessThan(String value) {
            addCriterion("D_DISTRICT <", value, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictLessThanOrEqualTo(String value) {
            addCriterion("D_DISTRICT <=", value, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictLike(String value) {
            addCriterion("D_DISTRICT like", value, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictNotLike(String value) {
            addCriterion("D_DISTRICT not like", value, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictIn(List<String> values) {
            addCriterion("D_DISTRICT in", values, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictNotIn(List<String> values) {
            addCriterion("D_DISTRICT not in", values, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictBetween(String value1, String value2) {
            addCriterion("D_DISTRICT between", value1, value2, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDDistrictNotBetween(String value1, String value2) {
            addCriterion("D_DISTRICT not between", value1, value2, "dDistrict");
            return (Criteria) this;
        }

        public Criteria andDStreetIsNull() {
            addCriterion("D_STREET is null");
            return (Criteria) this;
        }

        public Criteria andDStreetIsNotNull() {
            addCriterion("D_STREET is not null");
            return (Criteria) this;
        }

        public Criteria andDStreetEqualTo(String value) {
            addCriterion("D_STREET =", value, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetNotEqualTo(String value) {
            addCriterion("D_STREET <>", value, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetGreaterThan(String value) {
            addCriterion("D_STREET >", value, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetGreaterThanOrEqualTo(String value) {
            addCriterion("D_STREET >=", value, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetLessThan(String value) {
            addCriterion("D_STREET <", value, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetLessThanOrEqualTo(String value) {
            addCriterion("D_STREET <=", value, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetLike(String value) {
            addCriterion("D_STREET like", value, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetNotLike(String value) {
            addCriterion("D_STREET not like", value, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetIn(List<String> values) {
            addCriterion("D_STREET in", values, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetNotIn(List<String> values) {
            addCriterion("D_STREET not in", values, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetBetween(String value1, String value2) {
            addCriterion("D_STREET between", value1, value2, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDStreetNotBetween(String value1, String value2) {
            addCriterion("D_STREET not between", value1, value2, "dStreet");
            return (Criteria) this;
        }

        public Criteria andDCommitteeIsNull() {
            addCriterion("D_COMMITTEE is null");
            return (Criteria) this;
        }

        public Criteria andDCommitteeIsNotNull() {
            addCriterion("D_COMMITTEE is not null");
            return (Criteria) this;
        }

        public Criteria andDCommitteeEqualTo(String value) {
            addCriterion("D_COMMITTEE =", value, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeNotEqualTo(String value) {
            addCriterion("D_COMMITTEE <>", value, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeGreaterThan(String value) {
            addCriterion("D_COMMITTEE >", value, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeGreaterThanOrEqualTo(String value) {
            addCriterion("D_COMMITTEE >=", value, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeLessThan(String value) {
            addCriterion("D_COMMITTEE <", value, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeLessThanOrEqualTo(String value) {
            addCriterion("D_COMMITTEE <=", value, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeLike(String value) {
            addCriterion("D_COMMITTEE like", value, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeNotLike(String value) {
            addCriterion("D_COMMITTEE not like", value, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeIn(List<String> values) {
            addCriterion("D_COMMITTEE in", values, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeNotIn(List<String> values) {
            addCriterion("D_COMMITTEE not in", values, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeBetween(String value1, String value2) {
            addCriterion("D_COMMITTEE between", value1, value2, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDCommitteeNotBetween(String value1, String value2) {
            addCriterion("D_COMMITTEE not between", value1, value2, "dCommittee");
            return (Criteria) this;
        }

        public Criteria andDIconIsNull() {
            addCriterion("D_ICON is null");
            return (Criteria) this;
        }

        public Criteria andDIconIsNotNull() {
            addCriterion("D_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andDIconEqualTo(String value) {
            addCriterion("D_ICON =", value, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconNotEqualTo(String value) {
            addCriterion("D_ICON <>", value, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconGreaterThan(String value) {
            addCriterion("D_ICON >", value, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconGreaterThanOrEqualTo(String value) {
            addCriterion("D_ICON >=", value, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconLessThan(String value) {
            addCriterion("D_ICON <", value, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconLessThanOrEqualTo(String value) {
            addCriterion("D_ICON <=", value, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconLike(String value) {
            addCriterion("D_ICON like", value, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconNotLike(String value) {
            addCriterion("D_ICON not like", value, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconIn(List<String> values) {
            addCriterion("D_ICON in", values, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconNotIn(List<String> values) {
            addCriterion("D_ICON not in", values, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconBetween(String value1, String value2) {
            addCriterion("D_ICON between", value1, value2, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDIconNotBetween(String value1, String value2) {
            addCriterion("D_ICON not between", value1, value2, "dIcon");
            return (Criteria) this;
        }

        public Criteria andDLogoIsNull() {
            addCriterion("D_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andDLogoIsNotNull() {
            addCriterion("D_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andDLogoEqualTo(String value) {
            addCriterion("D_LOGO =", value, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoNotEqualTo(String value) {
            addCriterion("D_LOGO <>", value, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoGreaterThan(String value) {
            addCriterion("D_LOGO >", value, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoGreaterThanOrEqualTo(String value) {
            addCriterion("D_LOGO >=", value, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoLessThan(String value) {
            addCriterion("D_LOGO <", value, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoLessThanOrEqualTo(String value) {
            addCriterion("D_LOGO <=", value, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoLike(String value) {
            addCriterion("D_LOGO like", value, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoNotLike(String value) {
            addCriterion("D_LOGO not like", value, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoIn(List<String> values) {
            addCriterion("D_LOGO in", values, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoNotIn(List<String> values) {
            addCriterion("D_LOGO not in", values, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoBetween(String value1, String value2) {
            addCriterion("D_LOGO between", value1, value2, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDLogoNotBetween(String value1, String value2) {
            addCriterion("D_LOGO not between", value1, value2, "dLogo");
            return (Criteria) this;
        }

        public Criteria andDPrititleIsNull() {
            addCriterion("D_PRITITLE is null");
            return (Criteria) this;
        }

        public Criteria andDPrititleIsNotNull() {
            addCriterion("D_PRITITLE is not null");
            return (Criteria) this;
        }

        public Criteria andDPrititleEqualTo(String value) {
            addCriterion("D_PRITITLE =", value, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleNotEqualTo(String value) {
            addCriterion("D_PRITITLE <>", value, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleGreaterThan(String value) {
            addCriterion("D_PRITITLE >", value, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleGreaterThanOrEqualTo(String value) {
            addCriterion("D_PRITITLE >=", value, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleLessThan(String value) {
            addCriterion("D_PRITITLE <", value, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleLessThanOrEqualTo(String value) {
            addCriterion("D_PRITITLE <=", value, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleLike(String value) {
            addCriterion("D_PRITITLE like", value, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleNotLike(String value) {
            addCriterion("D_PRITITLE not like", value, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleIn(List<String> values) {
            addCriterion("D_PRITITLE in", values, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleNotIn(List<String> values) {
            addCriterion("D_PRITITLE not in", values, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleBetween(String value1, String value2) {
            addCriterion("D_PRITITLE between", value1, value2, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDPrititleNotBetween(String value1, String value2) {
            addCriterion("D_PRITITLE not between", value1, value2, "dPrititle");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeIsNull() {
            addCriterion("D_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeIsNotNull() {
            addCriterion("D_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeEqualTo(Date value) {
            addCriterion("D_CREATETIME =", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeNotEqualTo(Date value) {
            addCriterion("D_CREATETIME <>", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeGreaterThan(Date value) {
            addCriterion("D_CREATETIME >", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_CREATETIME >=", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeLessThan(Date value) {
            addCriterion("D_CREATETIME <", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("D_CREATETIME <=", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeIn(List<Date> values) {
            addCriterion("D_CREATETIME in", values, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeNotIn(List<Date> values) {
            addCriterion("D_CREATETIME not in", values, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeBetween(Date value1, Date value2) {
            addCriterion("D_CREATETIME between", value1, value2, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("D_CREATETIME not between", value1, value2, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidIsNull() {
            addCriterion("D_CREATEDEPID is null");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidIsNotNull() {
            addCriterion("D_CREATEDEPID is not null");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidEqualTo(String value) {
            addCriterion("D_CREATEDEPID =", value, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidNotEqualTo(String value) {
            addCriterion("D_CREATEDEPID <>", value, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidGreaterThan(String value) {
            addCriterion("D_CREATEDEPID >", value, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidGreaterThanOrEqualTo(String value) {
            addCriterion("D_CREATEDEPID >=", value, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidLessThan(String value) {
            addCriterion("D_CREATEDEPID <", value, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidLessThanOrEqualTo(String value) {
            addCriterion("D_CREATEDEPID <=", value, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidLike(String value) {
            addCriterion("D_CREATEDEPID like", value, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidNotLike(String value) {
            addCriterion("D_CREATEDEPID not like", value, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidIn(List<String> values) {
            addCriterion("D_CREATEDEPID in", values, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidNotIn(List<String> values) {
            addCriterion("D_CREATEDEPID not in", values, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidBetween(String value1, String value2) {
            addCriterion("D_CREATEDEPID between", value1, value2, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreatedepidNotBetween(String value1, String value2) {
            addCriterion("D_CREATEDEPID not between", value1, value2, "dCreatedepid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridIsNull() {
            addCriterion("D_CREATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridIsNotNull() {
            addCriterion("D_CREATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridEqualTo(String value) {
            addCriterion("D_CREATEUSERID =", value, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridNotEqualTo(String value) {
            addCriterion("D_CREATEUSERID <>", value, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridGreaterThan(String value) {
            addCriterion("D_CREATEUSERID >", value, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("D_CREATEUSERID >=", value, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridLessThan(String value) {
            addCriterion("D_CREATEUSERID <", value, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("D_CREATEUSERID <=", value, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridLike(String value) {
            addCriterion("D_CREATEUSERID like", value, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridNotLike(String value) {
            addCriterion("D_CREATEUSERID not like", value, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridIn(List<String> values) {
            addCriterion("D_CREATEUSERID in", values, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridNotIn(List<String> values) {
            addCriterion("D_CREATEUSERID not in", values, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridBetween(String value1, String value2) {
            addCriterion("D_CREATEUSERID between", value1, value2, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDCreateuseridNotBetween(String value1, String value2) {
            addCriterion("D_CREATEUSERID not between", value1, value2, "dCreateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeIsNull() {
            addCriterion("D_UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeIsNotNull() {
            addCriterion("D_UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeEqualTo(Date value) {
            addCriterion("D_UPDATETIME =", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeNotEqualTo(Date value) {
            addCriterion("D_UPDATETIME <>", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeGreaterThan(Date value) {
            addCriterion("D_UPDATETIME >", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_UPDATETIME >=", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeLessThan(Date value) {
            addCriterion("D_UPDATETIME <", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("D_UPDATETIME <=", value, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeIn(List<Date> values) {
            addCriterion("D_UPDATETIME in", values, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeNotIn(List<Date> values) {
            addCriterion("D_UPDATETIME not in", values, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("D_UPDATETIME between", value1, value2, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("D_UPDATETIME not between", value1, value2, "dUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidIsNull() {
            addCriterion("D_UPDATEDEPID is null");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidIsNotNull() {
            addCriterion("D_UPDATEDEPID is not null");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidEqualTo(String value) {
            addCriterion("D_UPDATEDEPID =", value, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidNotEqualTo(String value) {
            addCriterion("D_UPDATEDEPID <>", value, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidGreaterThan(String value) {
            addCriterion("D_UPDATEDEPID >", value, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidGreaterThanOrEqualTo(String value) {
            addCriterion("D_UPDATEDEPID >=", value, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidLessThan(String value) {
            addCriterion("D_UPDATEDEPID <", value, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidLessThanOrEqualTo(String value) {
            addCriterion("D_UPDATEDEPID <=", value, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidLike(String value) {
            addCriterion("D_UPDATEDEPID like", value, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidNotLike(String value) {
            addCriterion("D_UPDATEDEPID not like", value, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidIn(List<String> values) {
            addCriterion("D_UPDATEDEPID in", values, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidNotIn(List<String> values) {
            addCriterion("D_UPDATEDEPID not in", values, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidBetween(String value1, String value2) {
            addCriterion("D_UPDATEDEPID between", value1, value2, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdatedepidNotBetween(String value1, String value2) {
            addCriterion("D_UPDATEDEPID not between", value1, value2, "dUpdatedepid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridIsNull() {
            addCriterion("D_UPDATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridIsNotNull() {
            addCriterion("D_UPDATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridEqualTo(String value) {
            addCriterion("D_UPDATEUSERID =", value, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridNotEqualTo(String value) {
            addCriterion("D_UPDATEUSERID <>", value, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridGreaterThan(String value) {
            addCriterion("D_UPDATEUSERID >", value, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("D_UPDATEUSERID >=", value, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridLessThan(String value) {
            addCriterion("D_UPDATEUSERID <", value, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("D_UPDATEUSERID <=", value, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridLike(String value) {
            addCriterion("D_UPDATEUSERID like", value, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridNotLike(String value) {
            addCriterion("D_UPDATEUSERID not like", value, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridIn(List<String> values) {
            addCriterion("D_UPDATEUSERID in", values, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridNotIn(List<String> values) {
            addCriterion("D_UPDATEUSERID not in", values, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridBetween(String value1, String value2) {
            addCriterion("D_UPDATEUSERID between", value1, value2, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("D_UPDATEUSERID not between", value1, value2, "dUpdateuserid");
            return (Criteria) this;
        }

        public Criteria andDStoptimeIsNull() {
            addCriterion("D_STOPTIME is null");
            return (Criteria) this;
        }

        public Criteria andDStoptimeIsNotNull() {
            addCriterion("D_STOPTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDStoptimeEqualTo(Date value) {
            addCriterion("D_STOPTIME =", value, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStoptimeNotEqualTo(Date value) {
            addCriterion("D_STOPTIME <>", value, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStoptimeGreaterThan(Date value) {
            addCriterion("D_STOPTIME >", value, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStoptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("D_STOPTIME >=", value, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStoptimeLessThan(Date value) {
            addCriterion("D_STOPTIME <", value, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStoptimeLessThanOrEqualTo(Date value) {
            addCriterion("D_STOPTIME <=", value, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStoptimeIn(List<Date> values) {
            addCriterion("D_STOPTIME in", values, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStoptimeNotIn(List<Date> values) {
            addCriterion("D_STOPTIME not in", values, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStoptimeBetween(Date value1, Date value2) {
            addCriterion("D_STOPTIME between", value1, value2, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStoptimeNotBetween(Date value1, Date value2) {
            addCriterion("D_STOPTIME not between", value1, value2, "dStoptime");
            return (Criteria) this;
        }

        public Criteria andDStopdepidIsNull() {
            addCriterion("D_STOPDEPID is null");
            return (Criteria) this;
        }

        public Criteria andDStopdepidIsNotNull() {
            addCriterion("D_STOPDEPID is not null");
            return (Criteria) this;
        }

        public Criteria andDStopdepidEqualTo(String value) {
            addCriterion("D_STOPDEPID =", value, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidNotEqualTo(String value) {
            addCriterion("D_STOPDEPID <>", value, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidGreaterThan(String value) {
            addCriterion("D_STOPDEPID >", value, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidGreaterThanOrEqualTo(String value) {
            addCriterion("D_STOPDEPID >=", value, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidLessThan(String value) {
            addCriterion("D_STOPDEPID <", value, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidLessThanOrEqualTo(String value) {
            addCriterion("D_STOPDEPID <=", value, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidLike(String value) {
            addCriterion("D_STOPDEPID like", value, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidNotLike(String value) {
            addCriterion("D_STOPDEPID not like", value, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidIn(List<String> values) {
            addCriterion("D_STOPDEPID in", values, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidNotIn(List<String> values) {
            addCriterion("D_STOPDEPID not in", values, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidBetween(String value1, String value2) {
            addCriterion("D_STOPDEPID between", value1, value2, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopdepidNotBetween(String value1, String value2) {
            addCriterion("D_STOPDEPID not between", value1, value2, "dStopdepid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridIsNull() {
            addCriterion("D_STOPUSERID is null");
            return (Criteria) this;
        }

        public Criteria andDStopuseridIsNotNull() {
            addCriterion("D_STOPUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andDStopuseridEqualTo(String value) {
            addCriterion("D_STOPUSERID =", value, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridNotEqualTo(String value) {
            addCriterion("D_STOPUSERID <>", value, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridGreaterThan(String value) {
            addCriterion("D_STOPUSERID >", value, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridGreaterThanOrEqualTo(String value) {
            addCriterion("D_STOPUSERID >=", value, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridLessThan(String value) {
            addCriterion("D_STOPUSERID <", value, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridLessThanOrEqualTo(String value) {
            addCriterion("D_STOPUSERID <=", value, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridLike(String value) {
            addCriterion("D_STOPUSERID like", value, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridNotLike(String value) {
            addCriterion("D_STOPUSERID not like", value, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridIn(List<String> values) {
            addCriterion("D_STOPUSERID in", values, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridNotIn(List<String> values) {
            addCriterion("D_STOPUSERID not in", values, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridBetween(String value1, String value2) {
            addCriterion("D_STOPUSERID between", value1, value2, "dStopuserid");
            return (Criteria) this;
        }

        public Criteria andDStopuseridNotBetween(String value1, String value2) {
            addCriterion("D_STOPUSERID not between", value1, value2, "dStopuserid");
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