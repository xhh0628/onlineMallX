package com.xhh.onlineMall.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductParamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductParamsExample() {
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

        public Criteria andParamIdIsNull() {
            addCriterion("param_id is null");
            return (Criteria) this;
        }

        public Criteria andParamIdIsNotNull() {
            addCriterion("param_id is not null");
            return (Criteria) this;
        }

        public Criteria andParamIdEqualTo(String value) {
            addCriterion("param_id =", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotEqualTo(String value) {
            addCriterion("param_id <>", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThan(String value) {
            addCriterion("param_id >", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThanOrEqualTo(String value) {
            addCriterion("param_id >=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThan(String value) {
            addCriterion("param_id <", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThanOrEqualTo(String value) {
            addCriterion("param_id <=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLike(String value) {
            addCriterion("param_id like", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotLike(String value) {
            addCriterion("param_id not like", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdIn(List<String> values) {
            addCriterion("param_id in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotIn(List<String> values) {
            addCriterion("param_id not in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdBetween(String value1, String value2) {
            addCriterion("param_id between", value1, value2, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotBetween(String value1, String value2) {
            addCriterion("param_id not between", value1, value2, "paramId");
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

        public Criteria andProductPlaceIsNull() {
            addCriterion("product_place is null");
            return (Criteria) this;
        }

        public Criteria andProductPlaceIsNotNull() {
            addCriterion("product_place is not null");
            return (Criteria) this;
        }

        public Criteria andProductPlaceEqualTo(String value) {
            addCriterion("product_place =", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceNotEqualTo(String value) {
            addCriterion("product_place <>", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceGreaterThan(String value) {
            addCriterion("product_place >", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("product_place >=", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceLessThan(String value) {
            addCriterion("product_place <", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceLessThanOrEqualTo(String value) {
            addCriterion("product_place <=", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceLike(String value) {
            addCriterion("product_place like", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceNotLike(String value) {
            addCriterion("product_place not like", value, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceIn(List<String> values) {
            addCriterion("product_place in", values, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceNotIn(List<String> values) {
            addCriterion("product_place not in", values, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceBetween(String value1, String value2) {
            addCriterion("product_place between", value1, value2, "productPlace");
            return (Criteria) this;
        }

        public Criteria andProductPlaceNotBetween(String value1, String value2) {
            addCriterion("product_place not between", value1, value2, "productPlace");
            return (Criteria) this;
        }

        public Criteria andFootPeriodIsNull() {
            addCriterion("foot_period is null");
            return (Criteria) this;
        }

        public Criteria andFootPeriodIsNotNull() {
            addCriterion("foot_period is not null");
            return (Criteria) this;
        }

        public Criteria andFootPeriodEqualTo(String value) {
            addCriterion("foot_period =", value, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodNotEqualTo(String value) {
            addCriterion("foot_period <>", value, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodGreaterThan(String value) {
            addCriterion("foot_period >", value, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("foot_period >=", value, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodLessThan(String value) {
            addCriterion("foot_period <", value, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodLessThanOrEqualTo(String value) {
            addCriterion("foot_period <=", value, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodLike(String value) {
            addCriterion("foot_period like", value, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodNotLike(String value) {
            addCriterion("foot_period not like", value, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodIn(List<String> values) {
            addCriterion("foot_period in", values, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodNotIn(List<String> values) {
            addCriterion("foot_period not in", values, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodBetween(String value1, String value2) {
            addCriterion("foot_period between", value1, value2, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andFootPeriodNotBetween(String value1, String value2) {
            addCriterion("foot_period not between", value1, value2, "footPeriod");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("factory_name is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("factory_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("factory_name =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("factory_name <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("factory_name >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("factory_name >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("factory_name <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("factory_name <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("factory_name like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("factory_name not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("factory_name in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("factory_name not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("factory_name between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("factory_name not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressIsNull() {
            addCriterion("factory_address is null");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressIsNotNull() {
            addCriterion("factory_address is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressEqualTo(String value) {
            addCriterion("factory_address =", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressNotEqualTo(String value) {
            addCriterion("factory_address <>", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressGreaterThan(String value) {
            addCriterion("factory_address >", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("factory_address >=", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressLessThan(String value) {
            addCriterion("factory_address <", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressLessThanOrEqualTo(String value) {
            addCriterion("factory_address <=", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressLike(String value) {
            addCriterion("factory_address like", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressNotLike(String value) {
            addCriterion("factory_address not like", value, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressIn(List<String> values) {
            addCriterion("factory_address in", values, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressNotIn(List<String> values) {
            addCriterion("factory_address not in", values, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressBetween(String value1, String value2) {
            addCriterion("factory_address between", value1, value2, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andFactoryAddressNotBetween(String value1, String value2) {
            addCriterion("factory_address not between", value1, value2, "factoryAddress");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodIsNull() {
            addCriterion("packaging_method is null");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodIsNotNull() {
            addCriterion("packaging_method is not null");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodEqualTo(String value) {
            addCriterion("packaging_method =", value, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodNotEqualTo(String value) {
            addCriterion("packaging_method <>", value, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodGreaterThan(String value) {
            addCriterion("packaging_method >", value, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodGreaterThanOrEqualTo(String value) {
            addCriterion("packaging_method >=", value, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodLessThan(String value) {
            addCriterion("packaging_method <", value, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodLessThanOrEqualTo(String value) {
            addCriterion("packaging_method <=", value, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodLike(String value) {
            addCriterion("packaging_method like", value, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodNotLike(String value) {
            addCriterion("packaging_method not like", value, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodIn(List<String> values) {
            addCriterion("packaging_method in", values, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodNotIn(List<String> values) {
            addCriterion("packaging_method not in", values, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodBetween(String value1, String value2) {
            addCriterion("packaging_method between", value1, value2, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andPackagingMethodNotBetween(String value1, String value2) {
            addCriterion("packaging_method not between", value1, value2, "packagingMethod");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andStorageMethodIsNull() {
            addCriterion("storage_method is null");
            return (Criteria) this;
        }

        public Criteria andStorageMethodIsNotNull() {
            addCriterion("storage_method is not null");
            return (Criteria) this;
        }

        public Criteria andStorageMethodEqualTo(String value) {
            addCriterion("storage_method =", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodNotEqualTo(String value) {
            addCriterion("storage_method <>", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodGreaterThan(String value) {
            addCriterion("storage_method >", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodGreaterThanOrEqualTo(String value) {
            addCriterion("storage_method >=", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodLessThan(String value) {
            addCriterion("storage_method <", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodLessThanOrEqualTo(String value) {
            addCriterion("storage_method <=", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodLike(String value) {
            addCriterion("storage_method like", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodNotLike(String value) {
            addCriterion("storage_method not like", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodIn(List<String> values) {
            addCriterion("storage_method in", values, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodNotIn(List<String> values) {
            addCriterion("storage_method not in", values, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodBetween(String value1, String value2) {
            addCriterion("storage_method between", value1, value2, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodNotBetween(String value1, String value2) {
            addCriterion("storage_method not between", value1, value2, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodIsNull() {
            addCriterion("eat_method is null");
            return (Criteria) this;
        }

        public Criteria andEatMethodIsNotNull() {
            addCriterion("eat_method is not null");
            return (Criteria) this;
        }

        public Criteria andEatMethodEqualTo(String value) {
            addCriterion("eat_method =", value, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodNotEqualTo(String value) {
            addCriterion("eat_method <>", value, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodGreaterThan(String value) {
            addCriterion("eat_method >", value, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodGreaterThanOrEqualTo(String value) {
            addCriterion("eat_method >=", value, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodLessThan(String value) {
            addCriterion("eat_method <", value, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodLessThanOrEqualTo(String value) {
            addCriterion("eat_method <=", value, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodLike(String value) {
            addCriterion("eat_method like", value, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodNotLike(String value) {
            addCriterion("eat_method not like", value, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodIn(List<String> values) {
            addCriterion("eat_method in", values, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodNotIn(List<String> values) {
            addCriterion("eat_method not in", values, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodBetween(String value1, String value2) {
            addCriterion("eat_method between", value1, value2, "eatMethod");
            return (Criteria) this;
        }

        public Criteria andEatMethodNotBetween(String value1, String value2) {
            addCriterion("eat_method not between", value1, value2, "eatMethod");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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