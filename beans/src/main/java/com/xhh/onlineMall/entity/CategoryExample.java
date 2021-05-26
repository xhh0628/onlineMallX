package com.xhh.onlineMall.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelIsNull() {
            addCriterion("category_level is null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelIsNotNull() {
            addCriterion("category_level is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelEqualTo(Integer value) {
            addCriterion("category_level =", value, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelNotEqualTo(Integer value) {
            addCriterion("category_level <>", value, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelGreaterThan(Integer value) {
            addCriterion("category_level >", value, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_level >=", value, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelLessThan(Integer value) {
            addCriterion("category_level <", value, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelLessThanOrEqualTo(Integer value) {
            addCriterion("category_level <=", value, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelIn(List<Integer> values) {
            addCriterion("category_level in", values, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelNotIn(List<Integer> values) {
            addCriterion("category_level not in", values, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelBetween(Integer value1, Integer value2) {
            addCriterion("category_level between", value1, value2, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andCategoryLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("category_level not between", value1, value2, "categoryLevel");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andCategoryIconIsNull() {
            addCriterion("category_icon is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIconIsNotNull() {
            addCriterion("category_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIconEqualTo(String value) {
            addCriterion("category_icon =", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotEqualTo(String value) {
            addCriterion("category_icon <>", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconGreaterThan(String value) {
            addCriterion("category_icon >", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconGreaterThanOrEqualTo(String value) {
            addCriterion("category_icon >=", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconLessThan(String value) {
            addCriterion("category_icon <", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconLessThanOrEqualTo(String value) {
            addCriterion("category_icon <=", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconLike(String value) {
            addCriterion("category_icon like", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotLike(String value) {
            addCriterion("category_icon not like", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconIn(List<String> values) {
            addCriterion("category_icon in", values, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotIn(List<String> values) {
            addCriterion("category_icon not in", values, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconBetween(String value1, String value2) {
            addCriterion("category_icon between", value1, value2, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotBetween(String value1, String value2) {
            addCriterion("category_icon not between", value1, value2, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategorySloganIsNull() {
            addCriterion("category_slogan is null");
            return (Criteria) this;
        }

        public Criteria andCategorySloganIsNotNull() {
            addCriterion("category_slogan is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySloganEqualTo(String value) {
            addCriterion("category_slogan =", value, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganNotEqualTo(String value) {
            addCriterion("category_slogan <>", value, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganGreaterThan(String value) {
            addCriterion("category_slogan >", value, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganGreaterThanOrEqualTo(String value) {
            addCriterion("category_slogan >=", value, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganLessThan(String value) {
            addCriterion("category_slogan <", value, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganLessThanOrEqualTo(String value) {
            addCriterion("category_slogan <=", value, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganLike(String value) {
            addCriterion("category_slogan like", value, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganNotLike(String value) {
            addCriterion("category_slogan not like", value, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganIn(List<String> values) {
            addCriterion("category_slogan in", values, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganNotIn(List<String> values) {
            addCriterion("category_slogan not in", values, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganBetween(String value1, String value2) {
            addCriterion("category_slogan between", value1, value2, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategorySloganNotBetween(String value1, String value2) {
            addCriterion("category_slogan not between", value1, value2, "categorySlogan");
            return (Criteria) this;
        }

        public Criteria andCategoryPicIsNull() {
            addCriterion("category_pic is null");
            return (Criteria) this;
        }

        public Criteria andCategoryPicIsNotNull() {
            addCriterion("category_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryPicEqualTo(String value) {
            addCriterion("category_pic =", value, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicNotEqualTo(String value) {
            addCriterion("category_pic <>", value, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicGreaterThan(String value) {
            addCriterion("category_pic >", value, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicGreaterThanOrEqualTo(String value) {
            addCriterion("category_pic >=", value, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicLessThan(String value) {
            addCriterion("category_pic <", value, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicLessThanOrEqualTo(String value) {
            addCriterion("category_pic <=", value, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicLike(String value) {
            addCriterion("category_pic like", value, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicNotLike(String value) {
            addCriterion("category_pic not like", value, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicIn(List<String> values) {
            addCriterion("category_pic in", values, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicNotIn(List<String> values) {
            addCriterion("category_pic not in", values, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicBetween(String value1, String value2) {
            addCriterion("category_pic between", value1, value2, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryPicNotBetween(String value1, String value2) {
            addCriterion("category_pic not between", value1, value2, "categoryPic");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorIsNull() {
            addCriterion("category_bg_color is null");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorIsNotNull() {
            addCriterion("category_bg_color is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorEqualTo(String value) {
            addCriterion("category_bg_color =", value, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorNotEqualTo(String value) {
            addCriterion("category_bg_color <>", value, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorGreaterThan(String value) {
            addCriterion("category_bg_color >", value, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorGreaterThanOrEqualTo(String value) {
            addCriterion("category_bg_color >=", value, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorLessThan(String value) {
            addCriterion("category_bg_color <", value, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorLessThanOrEqualTo(String value) {
            addCriterion("category_bg_color <=", value, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorLike(String value) {
            addCriterion("category_bg_color like", value, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorNotLike(String value) {
            addCriterion("category_bg_color not like", value, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorIn(List<String> values) {
            addCriterion("category_bg_color in", values, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorNotIn(List<String> values) {
            addCriterion("category_bg_color not in", values, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorBetween(String value1, String value2) {
            addCriterion("category_bg_color between", value1, value2, "categoryBgColor");
            return (Criteria) this;
        }

        public Criteria andCategoryBgColorNotBetween(String value1, String value2) {
            addCriterion("category_bg_color not between", value1, value2, "categoryBgColor");
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