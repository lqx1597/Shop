package cn.shop.po;

import java.util.ArrayList;
import java.util.List;

public class OrderitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderitemExample() {
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

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(Integer value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(Integer value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(Integer value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<Integer> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_idEqualTo(Integer value) {
            addCriterion("product_id =", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThan(Integer value) {
            addCriterion("product_id >", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThan(Integer value) {
            addCriterion("product_id <", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idIn(List<Integer> values) {
            addCriterion("product_id in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andSale_numberIsNull() {
            addCriterion("sale_number is null");
            return (Criteria) this;
        }

        public Criteria andSale_numberIsNotNull() {
            addCriterion("sale_number is not null");
            return (Criteria) this;
        }

        public Criteria andSale_numberEqualTo(Integer value) {
            addCriterion("sale_number =", value, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_numberNotEqualTo(Integer value) {
            addCriterion("sale_number <>", value, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_numberGreaterThan(Integer value) {
            addCriterion("sale_number >", value, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_number >=", value, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_numberLessThan(Integer value) {
            addCriterion("sale_number <", value, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_numberLessThanOrEqualTo(Integer value) {
            addCriterion("sale_number <=", value, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_numberIn(List<Integer> values) {
            addCriterion("sale_number in", values, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_numberNotIn(List<Integer> values) {
            addCriterion("sale_number not in", values, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_numberBetween(Integer value1, Integer value2) {
            addCriterion("sale_number between", value1, value2, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_number not between", value1, value2, "sale_number");
            return (Criteria) this;
        }

        public Criteria andSale_priceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSale_priceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSale_priceEqualTo(Integer value) {
            addCriterion("sale_price =", value, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSale_priceNotEqualTo(Integer value) {
            addCriterion("sale_price <>", value, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSale_priceGreaterThan(Integer value) {
            addCriterion("sale_price >", value, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSale_priceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_price >=", value, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSale_priceLessThan(Integer value) {
            addCriterion("sale_price <", value, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSale_priceLessThanOrEqualTo(Integer value) {
            addCriterion("sale_price <=", value, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSale_priceIn(List<Integer> values) {
            addCriterion("sale_price in", values, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSale_priceNotIn(List<Integer> values) {
            addCriterion("sale_price not in", values, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSale_priceBetween(Integer value1, Integer value2) {
            addCriterion("sale_price between", value1, value2, "sale_price");
            return (Criteria) this;
        }

        public Criteria andSale_priceNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_price not between", value1, value2, "sale_price");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyEqualTo(Integer value) {
            addCriterion("total_money =", value, "total_money");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyNotEqualTo(Integer value) {
            addCriterion("total_money <>", value, "total_money");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyGreaterThan(Integer value) {
            addCriterion("total_money >", value, "total_money");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_money >=", value, "total_money");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyLessThan(Integer value) {
            addCriterion("total_money <", value, "total_money");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyLessThanOrEqualTo(Integer value) {
            addCriterion("total_money <=", value, "total_money");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyIn(List<Integer> values) {
            addCriterion("total_money in", values, "total_money");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyNotIn(List<Integer> values) {
            addCriterion("total_money not in", values, "total_money");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyBetween(Integer value1, Integer value2) {
            addCriterion("total_money between", value1, value2, "total_money");
            return (Criteria) this;
        }

        public Criteria andTotal_moneyNotBetween(Integer value1, Integer value2) {
            addCriterion("total_money not between", value1, value2, "total_money");
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