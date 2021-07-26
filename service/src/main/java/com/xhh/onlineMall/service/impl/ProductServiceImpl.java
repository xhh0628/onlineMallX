package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.ProductImgMapper;
import com.xhh.onlineMall.dao.ProductMapper;
import com.xhh.onlineMall.dao.ProductParamsMapper;
import com.xhh.onlineMall.dao.ProductSkuMapper;
import com.xhh.onlineMall.entity.*;
import com.xhh.onlineMall.service.ProductService;
import com.xhh.onlineMall.utils.PageHelper;
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
    @Autowired
    private ProductParamsMapper productParamsMapper;



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

    @Override
    public ResultVO getProductParamsById(String productId) {
        Example example = new Example(ProductParams.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("productId",productId);
        List<ProductParams> productParams = productParamsMapper.selectByExample(example);
        if (productParams.size()>0){
            return new ResultVO(ResStatus.OK,"success",productParams.get(0));
        }else {
            return new ResultVO(ResStatus.NO,"暂无商品信息介绍",null);
        }
    }

    @Override
    public ResultVO getProductsByCategoryId(int categoryId, int pageNum, int limit) {
        //查询分页数据
        int start  =(pageNum-1)*limit;
        List<ProductVO> productVOS = productMapper.selectProductByCategoryId(categoryId, start, limit);
        //查询当前类别下的商品总记录数
        Example example = new Example(Product.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("categoryId",categoryId);
        int count = productMapper.selectCountByExample(example);
        //计算总页数
        int pageCount=count%limit ==0?count/limit :count/limit+1;
        //封装返回数据
        PageHelper<ProductVO> pageHelper = new PageHelper<>(count, pageCount, productVOS);
        return new ResultVO(ResStatus.OK,"success",pageHelper);
    }


    @Override
    public ResultVO listBrands(int categoryId) {
        List<String> strings = productMapper.selectBrandByCategoryId(categoryId);
        return new ResultVO(ResStatus.OK,"success",strings);
    }
}
