package com.xhh.onlineMall.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCommentsExample() {
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

        public Criteria andCommIdIsNull() {
            addCriterion("comm_id is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("comm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(String value) {
            addCriterion("comm_id =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(String value) {
            addCriterion("comm_id <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(String value) {
            addCriterion("comm_id >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(String value) {
            addCriterion("comm_id >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(String value) {
            addCriterion("comm_id <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(String value) {
            addCriterion("comm_id <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLike(String value) {
            addCriterion("comm_id like", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotLike(String value) {
            addCriterion("comm_id not like", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<String> values) {
            addCriterion("comm_id in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<String> values) {
            addCriterion("comm_id not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(String value1, String value2) {
            addCriterion("comm_id between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(String value1, String value2) {
            addCriterion("comm_id not between", value1, value2, "commId");
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNull() {
            addCriterion("order_item_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNotNull() {
            addCriterion("order_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdEqualTo(String value) {
            addCriterion("order_item_id =", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotEqualTo(String value) {
            addCriterion("order_item_id <>", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThan(String value) {
            addCriterion("order_item_id >", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_item_id >=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThan(String value) {
            addCriterion("order_item_id <", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThanOrEqualTo(String value) {
            addCriterion("order_item_id <=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLike(String value) {
            addCriterion("order_item_id like", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotLike(String value) {
            addCriterion("order_item_id not like", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIn(List<String> values) {
            addCriterion("order_item_id in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotIn(List<String> values) {
            addCriterion("order_item_id not in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdBetween(String value1, String value2) {
            addCriterion("order_item_id between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotBetween(String value1, String value2) {
            addCriterion("order_item_id not between", value1, value2, "orderItemId");
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

        public Criteria andIsAnonymousIsNull() {
            addCriterion("is_anonymous is null");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousIsNotNull() {
            addCriterion("is_anonymous is not null");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousEqualTo(Integer value) {
            addCriterion("is_anonymous =", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousNotEqualTo(Integer value) {
            addCriterion("is_anonymous <>", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousGreaterThan(Integer value) {
            addCriterion("is_anonymous >", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_anonymous >=", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousLessThan(Integer value) {
            addCriterion("is_anonymous <", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousLessThanOrEqualTo(Integer value) {
            addCriterion("is_anonymous <=", value, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousIn(List<Integer> values) {
            addCriterion("is_anonymous in", values, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousNotIn(List<Integer> values) {
            addCriterion("is_anonymous not in", values, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousBetween(Integer value1, Integer value2) {
            addCriterion("is_anonymous between", value1, value2, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andIsAnonymousNotBetween(Integer value1, Integer value2) {
            addCriterion("is_anonymous not between", value1, value2, "isAnonymous");
            return (Criteria) this;
        }

        public Criteria andCommTypeIsNull() {
            addCriterion("comm_type is null");
            return (Criteria) this;
        }

        public Criteria andCommTypeIsNotNull() {
            addCriterion("comm_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommTypeEqualTo(Integer value) {
            addCriterion("comm_type =", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeNotEqualTo(Integer value) {
            addCriterion("comm_type <>", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeGreaterThan(Integer value) {
            addCriterion("comm_type >", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_type >=", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeLessThan(Integer value) {
            addCriterion("comm_type <", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeLessThanOrEqualTo(Integer value) {
            addCriterion("comm_type <=", value, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeIn(List<Integer> values) {
            addCriterion("comm_type in", values, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeNotIn(List<Integer> values) {
            addCriterion("comm_type not in", values, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeBetween(Integer value1, Integer value2) {
            addCriterion("comm_type between", value1, value2, "commType");
            return (Criteria) this;
        }

        public Criteria andCommTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_type not between", value1, value2, "commType");
            return (Criteria) this;
        }

        public Criteria andCommLevelIsNull() {
            addCriterion("comm_level is null");
            return (Criteria) this;
        }

        public Criteria andCommLevelIsNotNull() {
            addCriterion("comm_level is not null");
            return (Criteria) this;
        }

        public Criteria andCommLevelEqualTo(Integer value) {
            addCriterion("comm_level =", value, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommLevelNotEqualTo(Integer value) {
            addCriterion("comm_level <>", value, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommLevelGreaterThan(Integer value) {
            addCriterion("comm_level >", value, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_level >=", value, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommLevelLessThan(Integer value) {
            addCriterion("comm_level <", value, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommLevelLessThanOrEqualTo(Integer value) {
            addCriterion("comm_level <=", value, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommLevelIn(List<Integer> values) {
            addCriterion("comm_level in", values, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommLevelNotIn(List<Integer> values) {
            addCriterion("comm_level not in", values, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommLevelBetween(Integer value1, Integer value2) {
            addCriterion("comm_level between", value1, value2, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_level not between", value1, value2, "commLevel");
            return (Criteria) this;
        }

        public Criteria andCommContentIsNull() {
            addCriterion("comm_content is null");
            return (Criteria) this;
        }

        public Criteria andCommContentIsNotNull() {
            addCriterion("comm_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommContentEqualTo(String value) {
            addCriterion("comm_content =", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentNotEqualTo(String value) {
            addCriterion("comm_content <>", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentGreaterThan(String value) {
            addCriterion("comm_content >", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentGreaterThanOrEqualTo(String value) {
            addCriterion("comm_content >=", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentLessThan(String value) {
            addCriterion("comm_content <", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentLessThanOrEqualTo(String value) {
            addCriterion("comm_content <=", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentLike(String value) {
            addCriterion("comm_content like", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentNotLike(String value) {
            addCriterion("comm_content not like", value, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentIn(List<String> values) {
            addCriterion("comm_content in", values, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentNotIn(List<String> values) {
            addCriterion("comm_content not in", values, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentBetween(String value1, String value2) {
            addCriterion("comm_content between", value1, value2, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommContentNotBetween(String value1, String value2) {
            addCriterion("comm_content not between", value1, value2, "commContent");
            return (Criteria) this;
        }

        public Criteria andCommImgsIsNull() {
            addCriterion("comm_imgs is null");
            return (Criteria) this;
        }

        public Criteria andCommImgsIsNotNull() {
            addCriterion("comm_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andCommImgsEqualTo(String value) {
            addCriterion("comm_imgs =", value, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsNotEqualTo(String value) {
            addCriterion("comm_imgs <>", value, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsGreaterThan(String value) {
            addCriterion("comm_imgs >", value, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsGreaterThanOrEqualTo(String value) {
            addCriterion("comm_imgs >=", value, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsLessThan(String value) {
            addCriterion("comm_imgs <", value, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsLessThanOrEqualTo(String value) {
            addCriterion("comm_imgs <=", value, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsLike(String value) {
            addCriterion("comm_imgs like", value, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsNotLike(String value) {
            addCriterion("comm_imgs not like", value, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsIn(List<String> values) {
            addCriterion("comm_imgs in", values, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsNotIn(List<String> values) {
            addCriterion("comm_imgs not in", values, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsBetween(String value1, String value2) {
            addCriterion("comm_imgs between", value1, value2, "commImgs");
            return (Criteria) this;
        }

        public Criteria andCommImgsNotBetween(String value1, String value2) {
            addCriterion("comm_imgs not between", value1, value2, "commImgs");
            return (Criteria) this;
        }

        public Criteria andSepcNameIsNull() {
            addCriterion("sepc_name is null");
            return (Criteria) this;
        }

        public Criteria andSepcNameIsNotNull() {
            addCriterion("sepc_name is not null");
            return (Criteria) this;
        }

        public Criteria andSepcNameEqualTo(Date value) {
            addCriterion("sepc_name =", value, "sepcName");
            return (Criteria) this;
        }

        public Criteria andSepcNameNotEqualTo(Date value) {
            addCriterion("sepc_name <>", value, "sepcName");
            return (Criteria) this;
        }

        public Criteria andSepcNameGreaterThan(Date value) {
            addCriterion("sepc_name >", value, "sepcName");
            return (Criteria) this;
        }

        public Criteria andSepcNameGreaterThanOrEqualTo(Date value) {
            addCriterion("sepc_name >=", value, "sepcName");
            return (Criteria) this;
        }

        public Criteria andSepcNameLessThan(Date value) {
            addCriterion("sepc_name <", value, "sepcName");
            return (Criteria) this;
        }

        public Criteria andSepcNameLessThanOrEqualTo(Date value) {
            addCriterion("sepc_name <=", value, "sepcName");
            return (Criteria) this;
        }

        public Criteria andSepcNameIn(List<Date> values) {
            addCriterion("sepc_name in", values, "sepcName");
            return (Criteria) this;
        }

        public Criteria andSepcNameNotIn(List<Date> values) {
            addCriterion("sepc_name not in", values, "sepcName");
            return (Criteria) this;
        }

        public Criteria andSepcNameBetween(Date value1, Date value2) {
            addCriterion("sepc_name between", value1, value2, "sepcName");
            return (Criteria) this;
        }

        public Criteria andSepcNameNotBetween(Date value1, Date value2) {
            addCriterion("sepc_name not between", value1, value2, "sepcName");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIsNull() {
            addCriterion("reply_status is null");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIsNotNull() {
            addCriterion("reply_status is not null");
            return (Criteria) this;
        }

        public Criteria andReplyStatusEqualTo(Integer value) {
            addCriterion("reply_status =", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotEqualTo(Integer value) {
            addCriterion("reply_status <>", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusGreaterThan(Integer value) {
            addCriterion("reply_status >", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_status >=", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusLessThan(Integer value) {
            addCriterion("reply_status <", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("reply_status <=", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIn(List<Integer> values) {
            addCriterion("reply_status in", values, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotIn(List<Integer> values) {
            addCriterion("reply_status not in", values, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusBetween(Integer value1, Integer value2) {
            addCriterion("reply_status between", value1, value2, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_status not between", value1, value2, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNull() {
            addCriterion("reply_content is null");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNotNull() {
            addCriterion("reply_content is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContentEqualTo(String value) {
            addCriterion("reply_content =", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotEqualTo(String value) {
            addCriterion("reply_content <>", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThan(String value) {
            addCriterion("reply_content >", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("reply_content >=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThan(String value) {
            addCriterion("reply_content <", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThanOrEqualTo(String value) {
            addCriterion("reply_content <=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLike(String value) {
            addCriterion("reply_content like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotLike(String value) {
            addCriterion("reply_content not like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentIn(List<String> values) {
            addCriterion("reply_content in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotIn(List<String> values) {
            addCriterion("reply_content not in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentBetween(String value1, String value2) {
            addCriterion("reply_content between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotBetween(String value1, String value2) {
            addCriterion("reply_content not between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
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