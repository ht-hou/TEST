package com.ex.coor.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceDataExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceDataExample() {
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

        public Criteria andRescateidIsNull() {
            addCriterion("RESCATEID is null");
            return (Criteria) this;
        }

        public Criteria andRescateidIsNotNull() {
            addCriterion("RESCATEID is not null");
            return (Criteria) this;
        }

        public Criteria andRescateidEqualTo(String value) {
            addCriterion("RESCATEID =", value, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidNotEqualTo(String value) {
            addCriterion("RESCATEID <>", value, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidGreaterThan(String value) {
            addCriterion("RESCATEID >", value, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidGreaterThanOrEqualTo(String value) {
            addCriterion("RESCATEID >=", value, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidLessThan(String value) {
            addCriterion("RESCATEID <", value, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidLessThanOrEqualTo(String value) {
            addCriterion("RESCATEID <=", value, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidLike(String value) {
            addCriterion("RESCATEID like", value, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidNotLike(String value) {
            addCriterion("RESCATEID not like", value, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidIn(List<String> values) {
            addCriterion("RESCATEID in", values, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidNotIn(List<String> values) {
            addCriterion("RESCATEID not in", values, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidBetween(String value1, String value2) {
            addCriterion("RESCATEID between", value1, value2, "rescateid");
            return (Criteria) this;
        }

        public Criteria andRescateidNotBetween(String value1, String value2) {
            addCriterion("RESCATEID not between", value1, value2, "rescateid");
            return (Criteria) this;
        }

        public Criteria andResourcenameIsNull() {
            addCriterion("RESOURCENAME is null");
            return (Criteria) this;
        }

        public Criteria andResourcenameIsNotNull() {
            addCriterion("RESOURCENAME is not null");
            return (Criteria) this;
        }

        public Criteria andResourcenameEqualTo(String value) {
            addCriterion("RESOURCENAME =", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotEqualTo(String value) {
            addCriterion("RESOURCENAME <>", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameGreaterThan(String value) {
            addCriterion("RESOURCENAME >", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCENAME >=", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameLessThan(String value) {
            addCriterion("RESOURCENAME <", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameLessThanOrEqualTo(String value) {
            addCriterion("RESOURCENAME <=", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameLike(String value) {
            addCriterion("RESOURCENAME like", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotLike(String value) {
            addCriterion("RESOURCENAME not like", value, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameIn(List<String> values) {
            addCriterion("RESOURCENAME in", values, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotIn(List<String> values) {
            addCriterion("RESOURCENAME not in", values, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameBetween(String value1, String value2) {
            addCriterion("RESOURCENAME between", value1, value2, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourcenameNotBetween(String value1, String value2) {
            addCriterion("RESOURCENAME not between", value1, value2, "resourcename");
            return (Criteria) this;
        }

        public Criteria andResourceaddressIsNull() {
            addCriterion("RESOURCEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andResourceaddressIsNotNull() {
            addCriterion("RESOURCEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andResourceaddressEqualTo(String value) {
            addCriterion("RESOURCEADDRESS =", value, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressNotEqualTo(String value) {
            addCriterion("RESOURCEADDRESS <>", value, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressGreaterThan(String value) {
            addCriterion("RESOURCEADDRESS >", value, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCEADDRESS >=", value, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressLessThan(String value) {
            addCriterion("RESOURCEADDRESS <", value, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressLessThanOrEqualTo(String value) {
            addCriterion("RESOURCEADDRESS <=", value, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressLike(String value) {
            addCriterion("RESOURCEADDRESS like", value, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressNotLike(String value) {
            addCriterion("RESOURCEADDRESS not like", value, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressIn(List<String> values) {
            addCriterion("RESOURCEADDRESS in", values, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressNotIn(List<String> values) {
            addCriterion("RESOURCEADDRESS not in", values, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressBetween(String value1, String value2) {
            addCriterion("RESOURCEADDRESS between", value1, value2, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andResourceaddressNotBetween(String value1, String value2) {
            addCriterion("RESOURCEADDRESS not between", value1, value2, "resourceaddress");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("COUNT =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("COUNT <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("COUNT >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("COUNT <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("COUNT in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("COUNT not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("COUNT between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andFromunitIsNull() {
            addCriterion("FROMUNIT is null");
            return (Criteria) this;
        }

        public Criteria andFromunitIsNotNull() {
            addCriterion("FROMUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andFromunitEqualTo(String value) {
            addCriterion("FROMUNIT =", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitNotEqualTo(String value) {
            addCriterion("FROMUNIT <>", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitGreaterThan(String value) {
            addCriterion("FROMUNIT >", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitGreaterThanOrEqualTo(String value) {
            addCriterion("FROMUNIT >=", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitLessThan(String value) {
            addCriterion("FROMUNIT <", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitLessThanOrEqualTo(String value) {
            addCriterion("FROMUNIT <=", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitLike(String value) {
            addCriterion("FROMUNIT like", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitNotLike(String value) {
            addCriterion("FROMUNIT not like", value, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitIn(List<String> values) {
            addCriterion("FROMUNIT in", values, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitNotIn(List<String> values) {
            addCriterion("FROMUNIT not in", values, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitBetween(String value1, String value2) {
            addCriterion("FROMUNIT between", value1, value2, "fromunit");
            return (Criteria) this;
        }

        public Criteria andFromunitNotBetween(String value1, String value2) {
            addCriterion("FROMUNIT not between", value1, value2, "fromunit");
            return (Criteria) this;
        }

        public Criteria andGoodatIsNull() {
            addCriterion("GOODAT is null");
            return (Criteria) this;
        }

        public Criteria andGoodatIsNotNull() {
            addCriterion("GOODAT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodatEqualTo(String value) {
            addCriterion("GOODAT =", value, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatNotEqualTo(String value) {
            addCriterion("GOODAT <>", value, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatGreaterThan(String value) {
            addCriterion("GOODAT >", value, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatGreaterThanOrEqualTo(String value) {
            addCriterion("GOODAT >=", value, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatLessThan(String value) {
            addCriterion("GOODAT <", value, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatLessThanOrEqualTo(String value) {
            addCriterion("GOODAT <=", value, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatLike(String value) {
            addCriterion("GOODAT like", value, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatNotLike(String value) {
            addCriterion("GOODAT not like", value, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatIn(List<String> values) {
            addCriterion("GOODAT in", values, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatNotIn(List<String> values) {
            addCriterion("GOODAT not in", values, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatBetween(String value1, String value2) {
            addCriterion("GOODAT between", value1, value2, "goodat");
            return (Criteria) this;
        }

        public Criteria andGoodatNotBetween(String value1, String value2) {
            addCriterion("GOODAT not between", value1, value2, "goodat");
            return (Criteria) this;
        }

        public Criteria andPeoplenumIsNull() {
            addCriterion("PEOPLENUM is null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumIsNotNull() {
            addCriterion("PEOPLENUM is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumEqualTo(Integer value) {
            addCriterion("PEOPLENUM =", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotEqualTo(Integer value) {
            addCriterion("PEOPLENUM <>", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumGreaterThan(Integer value) {
            addCriterion("PEOPLENUM >", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PEOPLENUM >=", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumLessThan(Integer value) {
            addCriterion("PEOPLENUM <", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumLessThanOrEqualTo(Integer value) {
            addCriterion("PEOPLENUM <=", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumIn(List<Integer> values) {
            addCriterion("PEOPLENUM in", values, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotIn(List<Integer> values) {
            addCriterion("PEOPLENUM not in", values, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumBetween(Integer value1, Integer value2) {
            addCriterion("PEOPLENUM between", value1, value2, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotBetween(Integer value1, Integer value2) {
            addCriterion("PEOPLENUM not between", value1, value2, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andHoldnumIsNull() {
            addCriterion("HOLDNUM is null");
            return (Criteria) this;
        }

        public Criteria andHoldnumIsNotNull() {
            addCriterion("HOLDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andHoldnumEqualTo(Integer value) {
            addCriterion("HOLDNUM =", value, "holdnum");
            return (Criteria) this;
        }

        public Criteria andHoldnumNotEqualTo(Integer value) {
            addCriterion("HOLDNUM <>", value, "holdnum");
            return (Criteria) this;
        }

        public Criteria andHoldnumGreaterThan(Integer value) {
            addCriterion("HOLDNUM >", value, "holdnum");
            return (Criteria) this;
        }

        public Criteria andHoldnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOLDNUM >=", value, "holdnum");
            return (Criteria) this;
        }

        public Criteria andHoldnumLessThan(Integer value) {
            addCriterion("HOLDNUM <", value, "holdnum");
            return (Criteria) this;
        }

        public Criteria andHoldnumLessThanOrEqualTo(Integer value) {
            addCriterion("HOLDNUM <=", value, "holdnum");
            return (Criteria) this;
        }

        public Criteria andHoldnumIn(List<Integer> values) {
            addCriterion("HOLDNUM in", values, "holdnum");
            return (Criteria) this;
        }

        public Criteria andHoldnumNotIn(List<Integer> values) {
            addCriterion("HOLDNUM not in", values, "holdnum");
            return (Criteria) this;
        }

        public Criteria andHoldnumBetween(Integer value1, Integer value2) {
            addCriterion("HOLDNUM between", value1, value2, "holdnum");
            return (Criteria) this;
        }

        public Criteria andHoldnumNotBetween(Integer value1, Integer value2) {
            addCriterion("HOLDNUM not between", value1, value2, "holdnum");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("CONTACTS is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("CONTACTS is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("CONTACTS =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("CONTACTS <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("CONTACTS >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("CONTACTS <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("CONTACTS like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("CONTACTS not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("CONTACTS in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("CONTACTS not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("CONTACTS between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("CONTACTS not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("TELPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("TELPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("TELPHONE =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("TELPHONE <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("TELPHONE >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELPHONE >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("TELPHONE <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("TELPHONE <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("TELPHONE like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("TELPHONE not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("TELPHONE in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("TELPHONE not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("TELPHONE between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("TELPHONE not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andAreanumIsNull() {
            addCriterion("AREANUM is null");
            return (Criteria) this;
        }

        public Criteria andAreanumIsNotNull() {
            addCriterion("AREANUM is not null");
            return (Criteria) this;
        }

        public Criteria andAreanumEqualTo(String value) {
            addCriterion("AREANUM =", value, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumNotEqualTo(String value) {
            addCriterion("AREANUM <>", value, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumGreaterThan(String value) {
            addCriterion("AREANUM >", value, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumGreaterThanOrEqualTo(String value) {
            addCriterion("AREANUM >=", value, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumLessThan(String value) {
            addCriterion("AREANUM <", value, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumLessThanOrEqualTo(String value) {
            addCriterion("AREANUM <=", value, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumLike(String value) {
            addCriterion("AREANUM like", value, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumNotLike(String value) {
            addCriterion("AREANUM not like", value, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumIn(List<String> values) {
            addCriterion("AREANUM in", values, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumNotIn(List<String> values) {
            addCriterion("AREANUM not in", values, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumBetween(String value1, String value2) {
            addCriterion("AREANUM between", value1, value2, "areanum");
            return (Criteria) this;
        }

        public Criteria andAreanumNotBetween(String value1, String value2) {
            addCriterion("AREANUM not between", value1, value2, "areanum");
            return (Criteria) this;
        }

        public Criteria andSubnumIsNull() {
            addCriterion("SUBNUM is null");
            return (Criteria) this;
        }

        public Criteria andSubnumIsNotNull() {
            addCriterion("SUBNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSubnumEqualTo(String value) {
            addCriterion("SUBNUM =", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotEqualTo(String value) {
            addCriterion("SUBNUM <>", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumGreaterThan(String value) {
            addCriterion("SUBNUM >", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumGreaterThanOrEqualTo(String value) {
            addCriterion("SUBNUM >=", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumLessThan(String value) {
            addCriterion("SUBNUM <", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumLessThanOrEqualTo(String value) {
            addCriterion("SUBNUM <=", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumLike(String value) {
            addCriterion("SUBNUM like", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotLike(String value) {
            addCriterion("SUBNUM not like", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumIn(List<String> values) {
            addCriterion("SUBNUM in", values, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotIn(List<String> values) {
            addCriterion("SUBNUM not in", values, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumBetween(String value1, String value2) {
            addCriterion("SUBNUM between", value1, value2, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotBetween(String value1, String value2) {
            addCriterion("SUBNUM not between", value1, value2, "subnum");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("MOBILEPHONE =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("MOBILEPHONE <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("MOBILEPHONE >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("MOBILEPHONE <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("MOBILEPHONE like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("MOBILEPHONE not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("MOBILEPHONE in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("MOBILEPHONE not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("CITYCODE is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("CITYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("CITYCODE =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("CITYCODE <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("CITYCODE >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITYCODE >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("CITYCODE <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("CITYCODE <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("CITYCODE like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("CITYCODE not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("CITYCODE in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("CITYCODE not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("CITYCODE between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("CITYCODE not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeIsNull() {
            addCriterion("DISTRICTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeIsNotNull() {
            addCriterion("DISTRICTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeEqualTo(String value) {
            addCriterion("DISTRICTCODE =", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotEqualTo(String value) {
            addCriterion("DISTRICTCODE <>", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeGreaterThan(String value) {
            addCriterion("DISTRICTCODE >", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICTCODE >=", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeLessThan(String value) {
            addCriterion("DISTRICTCODE <", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeLessThanOrEqualTo(String value) {
            addCriterion("DISTRICTCODE <=", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeLike(String value) {
            addCriterion("DISTRICTCODE like", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotLike(String value) {
            addCriterion("DISTRICTCODE not like", value, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeIn(List<String> values) {
            addCriterion("DISTRICTCODE in", values, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotIn(List<String> values) {
            addCriterion("DISTRICTCODE not in", values, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeBetween(String value1, String value2) {
            addCriterion("DISTRICTCODE between", value1, value2, "districtcode");
            return (Criteria) this;
        }

        public Criteria andDistrictcodeNotBetween(String value1, String value2) {
            addCriterion("DISTRICTCODE not between", value1, value2, "districtcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeIsNull() {
            addCriterion("STREETCODE is null");
            return (Criteria) this;
        }

        public Criteria andStreetcodeIsNotNull() {
            addCriterion("STREETCODE is not null");
            return (Criteria) this;
        }

        public Criteria andStreetcodeEqualTo(String value) {
            addCriterion("STREETCODE =", value, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeNotEqualTo(String value) {
            addCriterion("STREETCODE <>", value, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeGreaterThan(String value) {
            addCriterion("STREETCODE >", value, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("STREETCODE >=", value, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeLessThan(String value) {
            addCriterion("STREETCODE <", value, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeLessThanOrEqualTo(String value) {
            addCriterion("STREETCODE <=", value, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeLike(String value) {
            addCriterion("STREETCODE like", value, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeNotLike(String value) {
            addCriterion("STREETCODE not like", value, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeIn(List<String> values) {
            addCriterion("STREETCODE in", values, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeNotIn(List<String> values) {
            addCriterion("STREETCODE not in", values, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeBetween(String value1, String value2) {
            addCriterion("STREETCODE between", value1, value2, "streetcode");
            return (Criteria) this;
        }

        public Criteria andStreetcodeNotBetween(String value1, String value2) {
            addCriterion("STREETCODE not between", value1, value2, "streetcode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeIsNull() {
            addCriterion("COMMITTEECODE is null");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeIsNotNull() {
            addCriterion("COMMITTEECODE is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeEqualTo(String value) {
            addCriterion("COMMITTEECODE =", value, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeNotEqualTo(String value) {
            addCriterion("COMMITTEECODE <>", value, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeGreaterThan(String value) {
            addCriterion("COMMITTEECODE >", value, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMITTEECODE >=", value, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeLessThan(String value) {
            addCriterion("COMMITTEECODE <", value, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeLessThanOrEqualTo(String value) {
            addCriterion("COMMITTEECODE <=", value, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeLike(String value) {
            addCriterion("COMMITTEECODE like", value, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeNotLike(String value) {
            addCriterion("COMMITTEECODE not like", value, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeIn(List<String> values) {
            addCriterion("COMMITTEECODE in", values, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeNotIn(List<String> values) {
            addCriterion("COMMITTEECODE not in", values, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeBetween(String value1, String value2) {
            addCriterion("COMMITTEECODE between", value1, value2, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCommitteecodeNotBetween(String value1, String value2) {
            addCriterion("COMMITTEECODE not between", value1, value2, "committeecode");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CREATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CREATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("CREATEUSERID =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("CREATEUSERID <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("CREATEUSERID >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("CREATEUSERID <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("CREATEUSERID like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("CREATEUSERID not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("CREATEUSERID in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("CREATEUSERID not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("CREATEUSERID between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERID not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatedepIsNull() {
            addCriterion("CREATEDEP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedepIsNotNull() {
            addCriterion("CREATEDEP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedepEqualTo(String value) {
            addCriterion("CREATEDEP =", value, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepNotEqualTo(String value) {
            addCriterion("CREATEDEP <>", value, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepGreaterThan(String value) {
            addCriterion("CREATEDEP >", value, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDEP >=", value, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepLessThan(String value) {
            addCriterion("CREATEDEP <", value, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepLessThanOrEqualTo(String value) {
            addCriterion("CREATEDEP <=", value, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepLike(String value) {
            addCriterion("CREATEDEP like", value, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepNotLike(String value) {
            addCriterion("CREATEDEP not like", value, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepIn(List<String> values) {
            addCriterion("CREATEDEP in", values, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepNotIn(List<String> values) {
            addCriterion("CREATEDEP not in", values, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepBetween(String value1, String value2) {
            addCriterion("CREATEDEP between", value1, value2, "createdep");
            return (Criteria) this;
        }

        public Criteria andCreatedepNotBetween(String value1, String value2) {
            addCriterion("CREATEDEP not between", value1, value2, "createdep");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("UPDATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("UPDATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(String value) {
            addCriterion("UPDATEUSERID =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(String value) {
            addCriterion("UPDATEUSERID <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(String value) {
            addCriterion("UPDATEUSERID >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSERID >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(String value) {
            addCriterion("UPDATEUSERID <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSERID <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLike(String value) {
            addCriterion("UPDATEUSERID like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotLike(String value) {
            addCriterion("UPDATEUSERID not like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<String> values) {
            addCriterion("UPDATEUSERID in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<String> values) {
            addCriterion("UPDATEUSERID not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(String value1, String value2) {
            addCriterion("UPDATEUSERID between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSERID not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatedepIsNull() {
            addCriterion("UPDATEDEP is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedepIsNotNull() {
            addCriterion("UPDATEDEP is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedepEqualTo(String value) {
            addCriterion("UPDATEDEP =", value, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepNotEqualTo(String value) {
            addCriterion("UPDATEDEP <>", value, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepGreaterThan(String value) {
            addCriterion("UPDATEDEP >", value, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEDEP >=", value, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepLessThan(String value) {
            addCriterion("UPDATEDEP <", value, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepLessThanOrEqualTo(String value) {
            addCriterion("UPDATEDEP <=", value, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepLike(String value) {
            addCriterion("UPDATEDEP like", value, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepNotLike(String value) {
            addCriterion("UPDATEDEP not like", value, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepIn(List<String> values) {
            addCriterion("UPDATEDEP in", values, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepNotIn(List<String> values) {
            addCriterion("UPDATEDEP not in", values, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepBetween(String value1, String value2) {
            addCriterion("UPDATEDEP between", value1, value2, "updatedep");
            return (Criteria) this;
        }

        public Criteria andUpdatedepNotBetween(String value1, String value2) {
            addCriterion("UPDATEDEP not between", value1, value2, "updatedep");
            return (Criteria) this;
        }

        public Criteria andIsimportIsNull() {
            addCriterion("ISIMPORT is null");
            return (Criteria) this;
        }

        public Criteria andIsimportIsNotNull() {
            addCriterion("ISIMPORT is not null");
            return (Criteria) this;
        }

        public Criteria andIsimportEqualTo(Integer value) {
            addCriterion("ISIMPORT =", value, "isimport");
            return (Criteria) this;
        }

        public Criteria andIsimportNotEqualTo(Integer value) {
            addCriterion("ISIMPORT <>", value, "isimport");
            return (Criteria) this;
        }

        public Criteria andIsimportGreaterThan(Integer value) {
            addCriterion("ISIMPORT >", value, "isimport");
            return (Criteria) this;
        }

        public Criteria andIsimportGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISIMPORT >=", value, "isimport");
            return (Criteria) this;
        }

        public Criteria andIsimportLessThan(Integer value) {
            addCriterion("ISIMPORT <", value, "isimport");
            return (Criteria) this;
        }

        public Criteria andIsimportLessThanOrEqualTo(Integer value) {
            addCriterion("ISIMPORT <=", value, "isimport");
            return (Criteria) this;
        }

        public Criteria andIsimportIn(List<Integer> values) {
            addCriterion("ISIMPORT in", values, "isimport");
            return (Criteria) this;
        }

        public Criteria andIsimportNotIn(List<Integer> values) {
            addCriterion("ISIMPORT not in", values, "isimport");
            return (Criteria) this;
        }

        public Criteria andIsimportBetween(Integer value1, Integer value2) {
            addCriterion("ISIMPORT between", value1, value2, "isimport");
            return (Criteria) this;
        }

        public Criteria andIsimportNotBetween(Integer value1, Integer value2) {
            addCriterion("ISIMPORT not between", value1, value2, "isimport");
            return (Criteria) this;
        }

        public Criteria andAddressfailIsNull() {
            addCriterion("ADDRESSFAIL is null");
            return (Criteria) this;
        }

        public Criteria andAddressfailIsNotNull() {
            addCriterion("ADDRESSFAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAddressfailEqualTo(Integer value) {
            addCriterion("ADDRESSFAIL =", value, "addressfail");
            return (Criteria) this;
        }

        public Criteria andAddressfailNotEqualTo(Integer value) {
            addCriterion("ADDRESSFAIL <>", value, "addressfail");
            return (Criteria) this;
        }

        public Criteria andAddressfailGreaterThan(Integer value) {
            addCriterion("ADDRESSFAIL >", value, "addressfail");
            return (Criteria) this;
        }

        public Criteria andAddressfailGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADDRESSFAIL >=", value, "addressfail");
            return (Criteria) this;
        }

        public Criteria andAddressfailLessThan(Integer value) {
            addCriterion("ADDRESSFAIL <", value, "addressfail");
            return (Criteria) this;
        }

        public Criteria andAddressfailLessThanOrEqualTo(Integer value) {
            addCriterion("ADDRESSFAIL <=", value, "addressfail");
            return (Criteria) this;
        }

        public Criteria andAddressfailIn(List<Integer> values) {
            addCriterion("ADDRESSFAIL in", values, "addressfail");
            return (Criteria) this;
        }

        public Criteria andAddressfailNotIn(List<Integer> values) {
            addCriterion("ADDRESSFAIL not in", values, "addressfail");
            return (Criteria) this;
        }

        public Criteria andAddressfailBetween(Integer value1, Integer value2) {
            addCriterion("ADDRESSFAIL between", value1, value2, "addressfail");
            return (Criteria) this;
        }

        public Criteria andAddressfailNotBetween(Integer value1, Integer value2) {
            addCriterion("ADDRESSFAIL not between", value1, value2, "addressfail");
            return (Criteria) this;
        }

        public Criteria andF1IsNull() {
            addCriterion("F1 is null");
            return (Criteria) this;
        }

        public Criteria andF1IsNotNull() {
            addCriterion("F1 is not null");
            return (Criteria) this;
        }

        public Criteria andF1EqualTo(String value) {
            addCriterion("F1 =", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotEqualTo(String value) {
            addCriterion("F1 <>", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThan(String value) {
            addCriterion("F1 >", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThanOrEqualTo(String value) {
            addCriterion("F1 >=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThan(String value) {
            addCriterion("F1 <", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThanOrEqualTo(String value) {
            addCriterion("F1 <=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Like(String value) {
            addCriterion("F1 like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotLike(String value) {
            addCriterion("F1 not like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1In(List<String> values) {
            addCriterion("F1 in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotIn(List<String> values) {
            addCriterion("F1 not in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Between(String value1, String value2) {
            addCriterion("F1 between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotBetween(String value1, String value2) {
            addCriterion("F1 not between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF2IsNull() {
            addCriterion("F2 is null");
            return (Criteria) this;
        }

        public Criteria andF2IsNotNull() {
            addCriterion("F2 is not null");
            return (Criteria) this;
        }

        public Criteria andF2EqualTo(String value) {
            addCriterion("F2 =", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotEqualTo(String value) {
            addCriterion("F2 <>", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThan(String value) {
            addCriterion("F2 >", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThanOrEqualTo(String value) {
            addCriterion("F2 >=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThan(String value) {
            addCriterion("F2 <", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThanOrEqualTo(String value) {
            addCriterion("F2 <=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Like(String value) {
            addCriterion("F2 like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotLike(String value) {
            addCriterion("F2 not like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2In(List<String> values) {
            addCriterion("F2 in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotIn(List<String> values) {
            addCriterion("F2 not in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Between(String value1, String value2) {
            addCriterion("F2 between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotBetween(String value1, String value2) {
            addCriterion("F2 not between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF3IsNull() {
            addCriterion("F3 is null");
            return (Criteria) this;
        }

        public Criteria andF3IsNotNull() {
            addCriterion("F3 is not null");
            return (Criteria) this;
        }

        public Criteria andF3EqualTo(String value) {
            addCriterion("F3 =", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotEqualTo(String value) {
            addCriterion("F3 <>", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThan(String value) {
            addCriterion("F3 >", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThanOrEqualTo(String value) {
            addCriterion("F3 >=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThan(String value) {
            addCriterion("F3 <", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThanOrEqualTo(String value) {
            addCriterion("F3 <=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Like(String value) {
            addCriterion("F3 like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotLike(String value) {
            addCriterion("F3 not like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3In(List<String> values) {
            addCriterion("F3 in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotIn(List<String> values) {
            addCriterion("F3 not in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Between(String value1, String value2) {
            addCriterion("F3 between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotBetween(String value1, String value2) {
            addCriterion("F3 not between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF4IsNull() {
            addCriterion("F4 is null");
            return (Criteria) this;
        }

        public Criteria andF4IsNotNull() {
            addCriterion("F4 is not null");
            return (Criteria) this;
        }

        public Criteria andF4EqualTo(String value) {
            addCriterion("F4 =", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotEqualTo(String value) {
            addCriterion("F4 <>", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThan(String value) {
            addCriterion("F4 >", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThanOrEqualTo(String value) {
            addCriterion("F4 >=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThan(String value) {
            addCriterion("F4 <", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThanOrEqualTo(String value) {
            addCriterion("F4 <=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4Like(String value) {
            addCriterion("F4 like", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotLike(String value) {
            addCriterion("F4 not like", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4In(List<String> values) {
            addCriterion("F4 in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotIn(List<String> values) {
            addCriterion("F4 not in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4Between(String value1, String value2) {
            addCriterion("F4 between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotBetween(String value1, String value2) {
            addCriterion("F4 not between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andF5IsNull() {
            addCriterion("F5 is null");
            return (Criteria) this;
        }

        public Criteria andF5IsNotNull() {
            addCriterion("F5 is not null");
            return (Criteria) this;
        }

        public Criteria andF5EqualTo(String value) {
            addCriterion("F5 =", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotEqualTo(String value) {
            addCriterion("F5 <>", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5GreaterThan(String value) {
            addCriterion("F5 >", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5GreaterThanOrEqualTo(String value) {
            addCriterion("F5 >=", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5LessThan(String value) {
            addCriterion("F5 <", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5LessThanOrEqualTo(String value) {
            addCriterion("F5 <=", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5Like(String value) {
            addCriterion("F5 like", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotLike(String value) {
            addCriterion("F5 not like", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5In(List<String> values) {
            addCriterion("F5 in", values, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotIn(List<String> values) {
            addCriterion("F5 not in", values, "f5");
            return (Criteria) this;
        }

        public Criteria andF5Between(String value1, String value2) {
            addCriterion("F5 between", value1, value2, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotBetween(String value1, String value2) {
            addCriterion("F5 not between", value1, value2, "f5");
            return (Criteria) this;
        }

        public Criteria andF6IsNull() {
            addCriterion("F6 is null");
            return (Criteria) this;
        }

        public Criteria andF6IsNotNull() {
            addCriterion("F6 is not null");
            return (Criteria) this;
        }

        public Criteria andF6EqualTo(String value) {
            addCriterion("F6 =", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotEqualTo(String value) {
            addCriterion("F6 <>", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6GreaterThan(String value) {
            addCriterion("F6 >", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6GreaterThanOrEqualTo(String value) {
            addCriterion("F6 >=", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6LessThan(String value) {
            addCriterion("F6 <", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6LessThanOrEqualTo(String value) {
            addCriterion("F6 <=", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6Like(String value) {
            addCriterion("F6 like", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotLike(String value) {
            addCriterion("F6 not like", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6In(List<String> values) {
            addCriterion("F6 in", values, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotIn(List<String> values) {
            addCriterion("F6 not in", values, "f6");
            return (Criteria) this;
        }

        public Criteria andF6Between(String value1, String value2) {
            addCriterion("F6 between", value1, value2, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotBetween(String value1, String value2) {
            addCriterion("F6 not between", value1, value2, "f6");
            return (Criteria) this;
        }

        public Criteria andF7IsNull() {
            addCriterion("F7 is null");
            return (Criteria) this;
        }

        public Criteria andF7IsNotNull() {
            addCriterion("F7 is not null");
            return (Criteria) this;
        }

        public Criteria andF7EqualTo(String value) {
            addCriterion("F7 =", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotEqualTo(String value) {
            addCriterion("F7 <>", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7GreaterThan(String value) {
            addCriterion("F7 >", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7GreaterThanOrEqualTo(String value) {
            addCriterion("F7 >=", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7LessThan(String value) {
            addCriterion("F7 <", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7LessThanOrEqualTo(String value) {
            addCriterion("F7 <=", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7Like(String value) {
            addCriterion("F7 like", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotLike(String value) {
            addCriterion("F7 not like", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7In(List<String> values) {
            addCriterion("F7 in", values, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotIn(List<String> values) {
            addCriterion("F7 not in", values, "f7");
            return (Criteria) this;
        }

        public Criteria andF7Between(String value1, String value2) {
            addCriterion("F7 between", value1, value2, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotBetween(String value1, String value2) {
            addCriterion("F7 not between", value1, value2, "f7");
            return (Criteria) this;
        }

        public Criteria andF8IsNull() {
            addCriterion("F8 is null");
            return (Criteria) this;
        }

        public Criteria andF8IsNotNull() {
            addCriterion("F8 is not null");
            return (Criteria) this;
        }

        public Criteria andF8EqualTo(String value) {
            addCriterion("F8 =", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotEqualTo(String value) {
            addCriterion("F8 <>", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8GreaterThan(String value) {
            addCriterion("F8 >", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8GreaterThanOrEqualTo(String value) {
            addCriterion("F8 >=", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8LessThan(String value) {
            addCriterion("F8 <", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8LessThanOrEqualTo(String value) {
            addCriterion("F8 <=", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8Like(String value) {
            addCriterion("F8 like", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotLike(String value) {
            addCriterion("F8 not like", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8In(List<String> values) {
            addCriterion("F8 in", values, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotIn(List<String> values) {
            addCriterion("F8 not in", values, "f8");
            return (Criteria) this;
        }

        public Criteria andF8Between(String value1, String value2) {
            addCriterion("F8 between", value1, value2, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotBetween(String value1, String value2) {
            addCriterion("F8 not between", value1, value2, "f8");
            return (Criteria) this;
        }

        public Criteria andF9IsNull() {
            addCriterion("F9 is null");
            return (Criteria) this;
        }

        public Criteria andF9IsNotNull() {
            addCriterion("F9 is not null");
            return (Criteria) this;
        }

        public Criteria andF9EqualTo(String value) {
            addCriterion("F9 =", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotEqualTo(String value) {
            addCriterion("F9 <>", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9GreaterThan(String value) {
            addCriterion("F9 >", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9GreaterThanOrEqualTo(String value) {
            addCriterion("F9 >=", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9LessThan(String value) {
            addCriterion("F9 <", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9LessThanOrEqualTo(String value) {
            addCriterion("F9 <=", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9Like(String value) {
            addCriterion("F9 like", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotLike(String value) {
            addCriterion("F9 not like", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9In(List<String> values) {
            addCriterion("F9 in", values, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotIn(List<String> values) {
            addCriterion("F9 not in", values, "f9");
            return (Criteria) this;
        }

        public Criteria andF9Between(String value1, String value2) {
            addCriterion("F9 between", value1, value2, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotBetween(String value1, String value2) {
            addCriterion("F9 not between", value1, value2, "f9");
            return (Criteria) this;
        }

        public Criteria andF10IsNull() {
            addCriterion("F10 is null");
            return (Criteria) this;
        }

        public Criteria andF10IsNotNull() {
            addCriterion("F10 is not null");
            return (Criteria) this;
        }

        public Criteria andF10EqualTo(String value) {
            addCriterion("F10 =", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotEqualTo(String value) {
            addCriterion("F10 <>", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10GreaterThan(String value) {
            addCriterion("F10 >", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10GreaterThanOrEqualTo(String value) {
            addCriterion("F10 >=", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10LessThan(String value) {
            addCriterion("F10 <", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10LessThanOrEqualTo(String value) {
            addCriterion("F10 <=", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10Like(String value) {
            addCriterion("F10 like", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotLike(String value) {
            addCriterion("F10 not like", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10In(List<String> values) {
            addCriterion("F10 in", values, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotIn(List<String> values) {
            addCriterion("F10 not in", values, "f10");
            return (Criteria) this;
        }

        public Criteria andF10Between(String value1, String value2) {
            addCriterion("F10 between", value1, value2, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotBetween(String value1, String value2) {
            addCriterion("F10 not between", value1, value2, "f10");
            return (Criteria) this;
        }

        public Criteria andF11IsNull() {
            addCriterion("F11 is null");
            return (Criteria) this;
        }

        public Criteria andF11IsNotNull() {
            addCriterion("F11 is not null");
            return (Criteria) this;
        }

        public Criteria andF11EqualTo(String value) {
            addCriterion("F11 =", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotEqualTo(String value) {
            addCriterion("F11 <>", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11GreaterThan(String value) {
            addCriterion("F11 >", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11GreaterThanOrEqualTo(String value) {
            addCriterion("F11 >=", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11LessThan(String value) {
            addCriterion("F11 <", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11LessThanOrEqualTo(String value) {
            addCriterion("F11 <=", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11Like(String value) {
            addCriterion("F11 like", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotLike(String value) {
            addCriterion("F11 not like", value, "f11");
            return (Criteria) this;
        }

        public Criteria andF11In(List<String> values) {
            addCriterion("F11 in", values, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotIn(List<String> values) {
            addCriterion("F11 not in", values, "f11");
            return (Criteria) this;
        }

        public Criteria andF11Between(String value1, String value2) {
            addCriterion("F11 between", value1, value2, "f11");
            return (Criteria) this;
        }

        public Criteria andF11NotBetween(String value1, String value2) {
            addCriterion("F11 not between", value1, value2, "f11");
            return (Criteria) this;
        }

        public Criteria andF12IsNull() {
            addCriterion("F12 is null");
            return (Criteria) this;
        }

        public Criteria andF12IsNotNull() {
            addCriterion("F12 is not null");
            return (Criteria) this;
        }

        public Criteria andF12EqualTo(String value) {
            addCriterion("F12 =", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12NotEqualTo(String value) {
            addCriterion("F12 <>", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12GreaterThan(String value) {
            addCriterion("F12 >", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12GreaterThanOrEqualTo(String value) {
            addCriterion("F12 >=", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12LessThan(String value) {
            addCriterion("F12 <", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12LessThanOrEqualTo(String value) {
            addCriterion("F12 <=", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12Like(String value) {
            addCriterion("F12 like", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12NotLike(String value) {
            addCriterion("F12 not like", value, "f12");
            return (Criteria) this;
        }

        public Criteria andF12In(List<String> values) {
            addCriterion("F12 in", values, "f12");
            return (Criteria) this;
        }

        public Criteria andF12NotIn(List<String> values) {
            addCriterion("F12 not in", values, "f12");
            return (Criteria) this;
        }

        public Criteria andF12Between(String value1, String value2) {
            addCriterion("F12 between", value1, value2, "f12");
            return (Criteria) this;
        }

        public Criteria andF12NotBetween(String value1, String value2) {
            addCriterion("F12 not between", value1, value2, "f12");
            return (Criteria) this;
        }

        public Criteria andF13IsNull() {
            addCriterion("F13 is null");
            return (Criteria) this;
        }

        public Criteria andF13IsNotNull() {
            addCriterion("F13 is not null");
            return (Criteria) this;
        }

        public Criteria andF13EqualTo(String value) {
            addCriterion("F13 =", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13NotEqualTo(String value) {
            addCriterion("F13 <>", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13GreaterThan(String value) {
            addCriterion("F13 >", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13GreaterThanOrEqualTo(String value) {
            addCriterion("F13 >=", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13LessThan(String value) {
            addCriterion("F13 <", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13LessThanOrEqualTo(String value) {
            addCriterion("F13 <=", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13Like(String value) {
            addCriterion("F13 like", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13NotLike(String value) {
            addCriterion("F13 not like", value, "f13");
            return (Criteria) this;
        }

        public Criteria andF13In(List<String> values) {
            addCriterion("F13 in", values, "f13");
            return (Criteria) this;
        }

        public Criteria andF13NotIn(List<String> values) {
            addCriterion("F13 not in", values, "f13");
            return (Criteria) this;
        }

        public Criteria andF13Between(String value1, String value2) {
            addCriterion("F13 between", value1, value2, "f13");
            return (Criteria) this;
        }

        public Criteria andF13NotBetween(String value1, String value2) {
            addCriterion("F13 not between", value1, value2, "f13");
            return (Criteria) this;
        }

        public Criteria andF14IsNull() {
            addCriterion("F14 is null");
            return (Criteria) this;
        }

        public Criteria andF14IsNotNull() {
            addCriterion("F14 is not null");
            return (Criteria) this;
        }

        public Criteria andF14EqualTo(String value) {
            addCriterion("F14 =", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14NotEqualTo(String value) {
            addCriterion("F14 <>", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14GreaterThan(String value) {
            addCriterion("F14 >", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14GreaterThanOrEqualTo(String value) {
            addCriterion("F14 >=", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14LessThan(String value) {
            addCriterion("F14 <", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14LessThanOrEqualTo(String value) {
            addCriterion("F14 <=", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14Like(String value) {
            addCriterion("F14 like", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14NotLike(String value) {
            addCriterion("F14 not like", value, "f14");
            return (Criteria) this;
        }

        public Criteria andF14In(List<String> values) {
            addCriterion("F14 in", values, "f14");
            return (Criteria) this;
        }

        public Criteria andF14NotIn(List<String> values) {
            addCriterion("F14 not in", values, "f14");
            return (Criteria) this;
        }

        public Criteria andF14Between(String value1, String value2) {
            addCriterion("F14 between", value1, value2, "f14");
            return (Criteria) this;
        }

        public Criteria andF14NotBetween(String value1, String value2) {
            addCriterion("F14 not between", value1, value2, "f14");
            return (Criteria) this;
        }

        public Criteria andF15IsNull() {
            addCriterion("F15 is null");
            return (Criteria) this;
        }

        public Criteria andF15IsNotNull() {
            addCriterion("F15 is not null");
            return (Criteria) this;
        }

        public Criteria andF15EqualTo(String value) {
            addCriterion("F15 =", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15NotEqualTo(String value) {
            addCriterion("F15 <>", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15GreaterThan(String value) {
            addCriterion("F15 >", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15GreaterThanOrEqualTo(String value) {
            addCriterion("F15 >=", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15LessThan(String value) {
            addCriterion("F15 <", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15LessThanOrEqualTo(String value) {
            addCriterion("F15 <=", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15Like(String value) {
            addCriterion("F15 like", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15NotLike(String value) {
            addCriterion("F15 not like", value, "f15");
            return (Criteria) this;
        }

        public Criteria andF15In(List<String> values) {
            addCriterion("F15 in", values, "f15");
            return (Criteria) this;
        }

        public Criteria andF15NotIn(List<String> values) {
            addCriterion("F15 not in", values, "f15");
            return (Criteria) this;
        }

        public Criteria andF15Between(String value1, String value2) {
            addCriterion("F15 between", value1, value2, "f15");
            return (Criteria) this;
        }

        public Criteria andF15NotBetween(String value1, String value2) {
            addCriterion("F15 not between", value1, value2, "f15");
            return (Criteria) this;
        }

        public Criteria andF16IsNull() {
            addCriterion("F16 is null");
            return (Criteria) this;
        }

        public Criteria andF16IsNotNull() {
            addCriterion("F16 is not null");
            return (Criteria) this;
        }

        public Criteria andF16EqualTo(String value) {
            addCriterion("F16 =", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16NotEqualTo(String value) {
            addCriterion("F16 <>", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16GreaterThan(String value) {
            addCriterion("F16 >", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16GreaterThanOrEqualTo(String value) {
            addCriterion("F16 >=", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16LessThan(String value) {
            addCriterion("F16 <", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16LessThanOrEqualTo(String value) {
            addCriterion("F16 <=", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16Like(String value) {
            addCriterion("F16 like", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16NotLike(String value) {
            addCriterion("F16 not like", value, "f16");
            return (Criteria) this;
        }

        public Criteria andF16In(List<String> values) {
            addCriterion("F16 in", values, "f16");
            return (Criteria) this;
        }

        public Criteria andF16NotIn(List<String> values) {
            addCriterion("F16 not in", values, "f16");
            return (Criteria) this;
        }

        public Criteria andF16Between(String value1, String value2) {
            addCriterion("F16 between", value1, value2, "f16");
            return (Criteria) this;
        }

        public Criteria andF16NotBetween(String value1, String value2) {
            addCriterion("F16 not between", value1, value2, "f16");
            return (Criteria) this;
        }

        public Criteria andF17IsNull() {
            addCriterion("F17 is null");
            return (Criteria) this;
        }

        public Criteria andF17IsNotNull() {
            addCriterion("F17 is not null");
            return (Criteria) this;
        }

        public Criteria andF17EqualTo(String value) {
            addCriterion("F17 =", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17NotEqualTo(String value) {
            addCriterion("F17 <>", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17GreaterThan(String value) {
            addCriterion("F17 >", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17GreaterThanOrEqualTo(String value) {
            addCriterion("F17 >=", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17LessThan(String value) {
            addCriterion("F17 <", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17LessThanOrEqualTo(String value) {
            addCriterion("F17 <=", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17Like(String value) {
            addCriterion("F17 like", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17NotLike(String value) {
            addCriterion("F17 not like", value, "f17");
            return (Criteria) this;
        }

        public Criteria andF17In(List<String> values) {
            addCriterion("F17 in", values, "f17");
            return (Criteria) this;
        }

        public Criteria andF17NotIn(List<String> values) {
            addCriterion("F17 not in", values, "f17");
            return (Criteria) this;
        }

        public Criteria andF17Between(String value1, String value2) {
            addCriterion("F17 between", value1, value2, "f17");
            return (Criteria) this;
        }

        public Criteria andF17NotBetween(String value1, String value2) {
            addCriterion("F17 not between", value1, value2, "f17");
            return (Criteria) this;
        }

        public Criteria andF18IsNull() {
            addCriterion("F18 is null");
            return (Criteria) this;
        }

        public Criteria andF18IsNotNull() {
            addCriterion("F18 is not null");
            return (Criteria) this;
        }

        public Criteria andF18EqualTo(String value) {
            addCriterion("F18 =", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18NotEqualTo(String value) {
            addCriterion("F18 <>", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18GreaterThan(String value) {
            addCriterion("F18 >", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18GreaterThanOrEqualTo(String value) {
            addCriterion("F18 >=", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18LessThan(String value) {
            addCriterion("F18 <", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18LessThanOrEqualTo(String value) {
            addCriterion("F18 <=", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18Like(String value) {
            addCriterion("F18 like", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18NotLike(String value) {
            addCriterion("F18 not like", value, "f18");
            return (Criteria) this;
        }

        public Criteria andF18In(List<String> values) {
            addCriterion("F18 in", values, "f18");
            return (Criteria) this;
        }

        public Criteria andF18NotIn(List<String> values) {
            addCriterion("F18 not in", values, "f18");
            return (Criteria) this;
        }

        public Criteria andF18Between(String value1, String value2) {
            addCriterion("F18 between", value1, value2, "f18");
            return (Criteria) this;
        }

        public Criteria andF18NotBetween(String value1, String value2) {
            addCriterion("F18 not between", value1, value2, "f18");
            return (Criteria) this;
        }

        public Criteria andF19IsNull() {
            addCriterion("F19 is null");
            return (Criteria) this;
        }

        public Criteria andF19IsNotNull() {
            addCriterion("F19 is not null");
            return (Criteria) this;
        }

        public Criteria andF19EqualTo(String value) {
            addCriterion("F19 =", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19NotEqualTo(String value) {
            addCriterion("F19 <>", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19GreaterThan(String value) {
            addCriterion("F19 >", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19GreaterThanOrEqualTo(String value) {
            addCriterion("F19 >=", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19LessThan(String value) {
            addCriterion("F19 <", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19LessThanOrEqualTo(String value) {
            addCriterion("F19 <=", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19Like(String value) {
            addCriterion("F19 like", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19NotLike(String value) {
            addCriterion("F19 not like", value, "f19");
            return (Criteria) this;
        }

        public Criteria andF19In(List<String> values) {
            addCriterion("F19 in", values, "f19");
            return (Criteria) this;
        }

        public Criteria andF19NotIn(List<String> values) {
            addCriterion("F19 not in", values, "f19");
            return (Criteria) this;
        }

        public Criteria andF19Between(String value1, String value2) {
            addCriterion("F19 between", value1, value2, "f19");
            return (Criteria) this;
        }

        public Criteria andF19NotBetween(String value1, String value2) {
            addCriterion("F19 not between", value1, value2, "f19");
            return (Criteria) this;
        }

        public Criteria andF20IsNull() {
            addCriterion("F20 is null");
            return (Criteria) this;
        }

        public Criteria andF20IsNotNull() {
            addCriterion("F20 is not null");
            return (Criteria) this;
        }

        public Criteria andF20EqualTo(String value) {
            addCriterion("F20 =", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20NotEqualTo(String value) {
            addCriterion("F20 <>", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20GreaterThan(String value) {
            addCriterion("F20 >", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20GreaterThanOrEqualTo(String value) {
            addCriterion("F20 >=", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20LessThan(String value) {
            addCriterion("F20 <", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20LessThanOrEqualTo(String value) {
            addCriterion("F20 <=", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20Like(String value) {
            addCriterion("F20 like", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20NotLike(String value) {
            addCriterion("F20 not like", value, "f20");
            return (Criteria) this;
        }

        public Criteria andF20In(List<String> values) {
            addCriterion("F20 in", values, "f20");
            return (Criteria) this;
        }

        public Criteria andF20NotIn(List<String> values) {
            addCriterion("F20 not in", values, "f20");
            return (Criteria) this;
        }

        public Criteria andF20Between(String value1, String value2) {
            addCriterion("F20 between", value1, value2, "f20");
            return (Criteria) this;
        }

        public Criteria andF20NotBetween(String value1, String value2) {
            addCriterion("F20 not between", value1, value2, "f20");
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