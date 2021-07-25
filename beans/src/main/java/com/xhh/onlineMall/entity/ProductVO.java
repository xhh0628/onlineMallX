package com.xhh.onlineMall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductVO {

    private String productId;
    private String productName;
    private Integer categoryId;
    private Integer rootCategoryId;
    private Integer soldNum;
    private Integer productStatus;
    private Date createTime;
    private Date updateTime;
    private String content;
    private List<ProductImg> productImgs;//查询商品时关联查询商品图片信息

    private List<ProductSku> skus;//在查询商品时，关联查询商品套餐信息

}