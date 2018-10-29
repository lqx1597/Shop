package cn.shop.po;

import java.util.ArrayList;
import java.util.List;

public class CustomeraddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomeraddressExample() {
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameIsNull() {
            addCriterion("acceptor_name is null");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameIsNotNull() {
            addCriterion("acceptor_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameEqualTo(String value) {
            addCriterion("acceptor_name =", value, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameNotEqualTo(String value) {
            addCriterion("acceptor_name <>", value, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameGreaterThan(String value) {
            addCriterion("acceptor_name >", value, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameGreaterThanOrEqualTo(String value) {
            addCriterion("acceptor_name >=", value, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameLessThan(String value) {
            addCriterion("acceptor_name <", value, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameLessThanOrEqualTo(String value) {
            addCriterion("acceptor_name <=", value, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameLike(String value) {
            addCriterion("acceptor_name like", value, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameNotLike(String value) {
            addCriterion("acceptor_name not like", value, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameIn(List<String> values) {
            addCriterion("acceptor_name in", values, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameNotIn(List<String> values) {
            addCriterion("acceptor_name not in", values, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameBetween(String value1, String value2) {
            addCriterion("acceptor_name between", value1, value2, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_nameNotBetween(String value1, String value2) {
            addCriterion("acceptor_name not between", value1, value2, "acceptor_name");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileIsNull() {
            addCriterion("acceptor_mobile is null");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileIsNotNull() {
            addCriterion("acceptor_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileEqualTo(String value) {
            addCriterion("acceptor_mobile =", value, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileNotEqualTo(String value) {
            addCriterion("acceptor_mobile <>", value, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileGreaterThan(String value) {
            addCriterion("acceptor_mobile >", value, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("acceptor_mobile >=", value, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileLessThan(String value) {
            addCriterion("acceptor_mobile <", value, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileLessThanOrEqualTo(String value) {
            addCriterion("acceptor_mobile <=", value, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileLike(String value) {
            addCriterion("acceptor_mobile like", value, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileNotLike(String value) {
            addCriterion("acceptor_mobile not like", value, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileIn(List<String> values) {
            addCriterion("acceptor_mobile in", values, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileNotIn(List<String> values) {
            addCriterion("acceptor_mobile not in", values, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileBetween(String value1, String value2) {
            addCriterion("acceptor_mobile between", value1, value2, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andAcceptor_mobileNotBetween(String value1, String value2) {
            addCriterion("acceptor_mobile not between", value1, value2, "acceptor_mobile");
            return (Criteria) this;
        }

        public Criteria andCustomer_idIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomer_idIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer_idEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idLessThan(Integer value) {
            addCriterion("customer_id <", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customer_id");
            return (Criteria) this;
        }

        public Criteria andCustomer_idNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customer_id");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressIsNull() {
            addCriterion("is_default_address is null");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressIsNotNull() {
            addCriterion("is_default_address is not null");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressEqualTo(Integer value) {
            addCriterion("is_default_address =", value, "is_default_address");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressNotEqualTo(Integer value) {
            addCriterion("is_default_address <>", value, "is_default_address");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressGreaterThan(Integer value) {
            addCriterion("is_default_address >", value, "is_default_address");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_default_address >=", value, "is_default_address");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressLessThan(Integer value) {
            addCriterion("is_default_address <", value, "is_default_address");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressLessThanOrEqualTo(Integer value) {
            addCriterion("is_default_address <=", value, "is_default_address");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressIn(List<Integer> values) {
            addCriterion("is_default_address in", values, "is_default_address");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressNotIn(List<Integer> values) {
            addCriterion("is_default_address not in", values, "is_default_address");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressBetween(Integer value1, Integer value2) {
            addCriterion("is_default_address between", value1, value2, "is_default_address");
            return (Criteria) this;
        }

        public Criteria andIs_default_addressNotBetween(Integer value1, Integer value2) {
            addCriterion("is_default_address not between", value1, value2, "is_default_address");
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