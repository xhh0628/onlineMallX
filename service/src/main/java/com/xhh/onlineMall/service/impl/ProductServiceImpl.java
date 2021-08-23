package com.xhh.onlineMall.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
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
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private ObjectMapper objectMapper=new ObjectMapper();

    @Override
    public ResultVO selectRecommendProductsList() {
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        ResultVO vo = new ResultVO(ResStatus.OK, "sucess", productVOS);
        return vo;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVO getProductBasicInfo(String productId)  {
        try {
            //1商品基本信息
            //根据商品id查询redis是否有数据
            String productInfo = (String) stringRedisTemplate.boundHashOps("products").get(productId);
            //判断redis中是否有id对应的产品hash
            if(productInfo!=null){
                //返回redis中查询的数据
                Product product = objectMapper.readValue(productInfo, Product.class);
                //获取redis中商品对应的图片信息
                String imgStr = (String) stringRedisTemplate.boundHashOps("productImgs").get(productId);
                //获取redis中商品对应的套餐信息
                String skuStr = (String) stringRedisTemplate.boundHashOps("productSkus").get(productId);

                //redis获取的字符串转换为对应对象的集合
                JavaType javaType=objectMapper.getTypeFactory().constructParametricType(ArrayList.class,ProductImg.class);
                List<ProductImg> productImg = objectMapper.readValue(imgStr, javaType);

                JavaType javaType2=objectMapper.getTypeFactory().constructParametricType(ArrayList.class,ProductSku.class);
                List<ProductSku> productSku = objectMapper.readValue(skuStr,javaType2);

                //封装商品的所有信息返回
                HashMap<String, Object> basicInfo = new HashMap<>();
                basicInfo.put("product",product);
                basicInfo.put("productImgs",productImg);
                basicInfo.put("productSkus",productSku);
                return new ResultVO(ResStatus.OK,"success",basicInfo);

            }else{
                //redis中没有查询到该商品id，查询数据库
                //查询数据库信息
                Example example = new Example(Product.class);
                Example.Criteria criteria = example.createCriteria();
                criteria.andEqualTo("productId",productId)
                        .andEqualTo("productStatus",1);//状态为1则为有效商品
                List<Product> products = productMapper.selectByExample(example);
                if (products.size()>0){
                    Product product=products.get(0);
                    //商品基本信息写入redis
                    stringRedisTemplate.boundHashOps("products").put(productId,objectMapper.writeValueAsString(product));

                    //2商品图片
                    Example example1 = new Example(ProductImg.class);
                    Example.Criteria criteria1 = example1.createCriteria();
                    criteria1.andEqualTo("itemId",productId);
                    List<ProductImg> productImgs = productImgMapper.selectByExample(example1);
                    //商品图片信息写入redis
                    stringRedisTemplate.boundHashOps("productImgs").put(productId,objectMapper.writeValueAsString(productImgs));

                    //3商品套餐信息
                    Example example2 = new Example(ProductSku.class);
                    Example.Criteria criteria2 = example2.createCriteria();
                    criteria2.andEqualTo("productId",productId)
                            .andEqualTo("status",1);
                    List<ProductSku> productSkus = productSkuMapper.selectByExample(example2);
                    //商品套餐信息写入redis
                    stringRedisTemplate.boundHashOps("productSkus").put(productId,objectMapper.writeValueAsString(productSkus));

                    //封装商品的所有信息返回
                    HashMap<String, Object> basicInfo = new HashMap<>();
                    basicInfo.put("product",products.get(0));
                    basicInfo.put("productImgs",productImgs);
                    basicInfo.put("productSkus",productSkus);


                    return new ResultVO(ResStatus.OK,"success",basicInfo);
                }else {
                    return new ResultVO(ResStatus.NO,"商品不存在",null);
                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
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
