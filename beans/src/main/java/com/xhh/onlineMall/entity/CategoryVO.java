package com.xhh.onlineMall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryVO {

    private Integer categoryId;
    private String categoryName;
    private Integer categoryLevel;
    private Integer parentId;
    private String categoryIcon;
    private String categorySlogan;
    private String categoryPic;
    private String categoryBgColor;
    //可封装子类别
    private List<CategoryVO> categories;
    //首页推荐商品类别
    private List<ProductVO> products;

    @Override
    public String toString() {
        return "CategoryVO{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryLevel=" + categoryLevel +
                ", parentId=" + parentId +
                ", categoryIcon='" + categoryIcon + '\'' +
                ", categorySlogan='" + categorySlogan + '\'' +
                ", categoryPic='" + categoryPic + '\'' +
                ", categoryBgColor='" + categoryBgColor + '\'' +
                ", categories=" + categories +
                ", products=" + products +
                '}';
    }
}
