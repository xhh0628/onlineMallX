package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.ProductImgMapper;
import com.xhh.onlineMall.dao.ProductMapper;
import com.xhh.onlineMall.dao.ProductSkuMapper;
import com.xhh.onlineMall.entity.Product;
import com.xhh.onlineMall.entity.ProductImg;
import com.xhh.onlineMall.entity.ProductSku;
import com.xhh.onlineMall.entity.ProductVO;
import com.xhh.onlineMall.service.ProductService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductImgMapper productImgMapper;
    @Autowired
    private ProductSkuMapper productSkuMapper;


    @Override
    public ResultVO selectRecommendProductsList() {
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        ResultVO vo = new ResultVO(ResStatus.OK, "sucess", productVOS);
        return vo;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVO getProductBasicInfo(String productId) {
        //1商品基本信息
        Example example = new Example(Product.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("productId",productId)
                .andEqualTo("productStatus",1);//状态为1则为有效商品
        List<Product> products = productMapper.selectByExample(example);
        if (products.size()>0){
            //2商品图片
            Example example1 = new Example(ProductImg.class);
            Example.Criteria criteria1 = example1.createCriteria();
            criteria1.andEqualTo("itemId",productId);
            List<ProductImg> productImgs = productImgMapper.selectByExample(example1);
            //3商品套餐信息
            Example example2 = new Example(ProductSku.class);
            Example.Criteria criteria2 = example2.createCriteria();
            criteria2.andEqualTo("productId",productId)
                    .andEqualTo("status",1);
            List<ProductSku> productSkus = productSkuMapper.selectByExample(example2);
            HashMap<String, Object> basicInfo = new HashMap<>();
            basicInfo.put("product",products.get(0));
            basicInfo.put("productImgs",productImgs);
            basicInfo.put("productSkus",productSkus);
            return new ResultVO(ResStatus.OK,"success",basicInfo);
        }else {
            return new ResultVO(ResStatus.NO,"商品不存在",null);
        }

    }
}
