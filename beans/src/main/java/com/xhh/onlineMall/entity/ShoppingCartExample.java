package com.xhh.onlineMall.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingCartExample() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Integer value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Integer value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Integer value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Integer value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Integer> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Integer> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Integer value1, Integer value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(String value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(String value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(String value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(String value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(String value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLike(String value) {
            addCriterion("sku_id like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotLike(String value) {
            addCriterion("sku_id not like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<String> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<String> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(String value1, String value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(String value1, String value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCartNumIsNull() {
            addCriterion("cart_num is null");
            return (Criteria) this;
        }

        public Criteria andCartNumIsNotNull() {
            addCriterion("cart_num is not null");
            return (Criteria) this;
        }

        public Criteria andCartNumEqualTo(String value) {
            addCriterion("cart_num =", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumNotEqualTo(String value) {
            addCriterion("cart_num <>", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumGreaterThan(String value) {
            addCriterion("cart_num >", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumGreaterThanOrEqualTo(String value) {
            addCriterion("cart_num >=", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumLessThan(String value) {
            addCriterion("cart_num <", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumLessThanOrEqualTo(String value) {
            addCriterion("cart_num <=", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumLike(String value) {
            addCriterion("cart_num like", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumNotLike(String value) {
            addCriterion("cart_num not like", value, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumIn(List<String> values) {
            addCriterion("cart_num in", values, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumNotIn(List<String> values) {
            addCriterion("cart_num not in", values, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumBetween(String value1, String value2) {
            addCriterion("cart_num between", value1, value2, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartNumNotBetween(String value1, String value2) {
            addCriterion("cart_num not between", value1, value2, "cartNum");
            return (Criteria) this;
        }

        public Criteria andCartTimeIsNull() {
            addCriterion("cart_time is null");
            return (Criteria) this;
        }

        public Criteria andCartTimeIsNotNull() {
            addCriterion("cart_time is not null");
            return (Criteria) this;
        }

        public Criteria andCartTimeEqualTo(String value) {
            addCriterion("cart_time =", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeNotEqualTo(String value) {
            addCriterion("cart_time <>", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeGreaterThan(String value) {
            addCriterion("cart_time >", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("cart_time >=", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeLessThan(String value) {
            addCriterion("cart_time <", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeLessThanOrEqualTo(String value) {
            addCriterion("cart_time <=", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeLike(String value) {
            addCriterion("cart_time like", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeNotLike(String value) {
            addCriterion("cart_time not like", value, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeIn(List<String> values) {
            addCriterion("cart_time in", values, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeNotIn(List<String> values) {
            addCriterion("cart_time not in", values, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeBetween(String value1, String value2) {
            addCriterion("cart_time between", value1, value2, "cartTime");
            return (Criteria) this;
        }

        public Criteria andCartTimeNotBetween(String value1, String value2) {
            addCriterion("cart_time not between", value1, value2, "cartTime");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(BigDecimal value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(BigDecimal value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(BigDecimal value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(BigDecimal value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<BigDecimal> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<BigDecimal> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPropsIsNull() {
            addCriterion("sku_props is null");
            return (Criteria) this;
        }

        public Criteria andSkuPropsIsNotNull() {
            addCriterion("sku_props is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPropsEqualTo(String value) {
            addCriterion("sku_props =", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsNotEqualTo(String value) {
            addCriterion("sku_props <>", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsGreaterThan(String value) {
            addCriterion("sku_props >", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsGreaterThanOrEqualTo(String value) {
            addCriterion("sku_props >=", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsLessThan(String value) {
            addCriterion("sku_props <", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsLessThanOrEqualTo(String value) {
            addCriterion("sku_props <=", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsLike(String value) {
            addCriterion("sku_props like", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsNotLike(String value) {
            addCriterion("sku_props not like", value, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsIn(List<String> values) {
            addCriterion("sku_props in", values, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsNotIn(List<String> values) {
            addCriterion("sku_props not in", values, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsBetween(String value1, String value2) {
            addCriterion("sku_props between", value1, value2, "skuProps");
            return (Criteria) this;
        }

        public Criteria andSkuPropsNotBetween(String value1, String value2) {
            addCriterion("sku_props not between", value1, value2, "skuProps");
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