package com.xhh.onlineMall.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xhh.onlineMall.dao.IndexImgMapper;
import com.xhh.onlineMall.entity.IndexImg;
import com.xhh.onlineMall.entity.ProductImg;
import com.xhh.onlineMall.service.IndexImgService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class IndexImgServiceImpl implements IndexImgService {

    @Autowired
    private IndexImgMapper indexImgMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private Logger logger=LoggerFactory.getLogger(IndexImgServiceImpl.class);
    private ObjectMapper objectMapper=new ObjectMapper();

    @Override
    public ResultVO selectIndexImgs() {
        try {
            logger.info("加载首页轮播图开始+++++++");
            //查询redis中的轮播图shuju
            String imgStr = stringRedisTemplate.opsForValue().get("indexImgs");
            if (imgStr!=null){
                logger.info("加载首页轮播图成功+++++++redis");
                JavaType javaType=objectMapper.getTypeFactory().constructParametricType(ArrayList.class, IndexImg.class);
                List<IndexImg> indexImgs = objectMapper.readValue(imgStr, javaType);

                return new ResultVO(ResStatus.OK,"success",indexImgs);
            }else{
                //redis中或取失败，db查询
                List<IndexImg> indexImgs = indexImgMapper.selectIndexImgs();
                if (indexImgs.size()==0){
                    logger.info("加载首页轮播图成功-------");
                    return new ResultVO(ResStatus.NO,"fail",null);
                }else{
                    //写入redis
                    stringRedisTemplate.boundValueOps("indexImgs").set(objectMapper.writeValueAsString(indexImgs));
                    //设置redis过期时间为1天
                    stringRedisTemplate.boundValueOps("indexImgs").expire(1, TimeUnit.DAYS);
                    logger.info("redis写入轮播图缓存+++++++成功");
                    logger.info("加载首页轮播图成功+++++++DB");
                    return new ResultVO(ResStatus.OK,"success",indexImgs);
                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

            return null;
    }
}
