package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.ProductCommentsMapper;
import com.xhh.onlineMall.entity.ProductComments;
import com.xhh.onlineMall.entity.ProductCommentsVO;
import com.xhh.onlineMall.service.ProductCommentsService;
import com.xhh.onlineMall.utils.PageHelper;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductCommentsServiceImpl implements ProductCommentsService {

    @Autowired
    private ProductCommentsMapper productCommentsMapper;
    //分页查询评论信息
    @Override
    public ResultVO listCommentsByProductId(String productId,int pageNum,int limit) {
      //List<ProductCommentsVO> productCommentsVOS = productCommentsMapper.selectCommentsByProductId(productId);
        //根据商品id查询评论总记录数
        Example example = new Example(ProductComments.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("productId",productId);
        int count=productCommentsMapper.selectCountByExample(example);
        //计算总页数（根据每页显示多少条pageSize
        int pageCount=count%limit==0?count/limit:count/limit+1;
        int start=(pageNum-1)*limit;
        //分页查询当前页数据
        List<ProductCommentsVO> list = productCommentsMapper.selectCommentsByProductId(productId, start, limit);
        ResultVO vo = new ResultVO(ResStatus.OK, "success", new PageHelper<ProductCommentsVO>(count,pageCount,list));
        return vo;
    }

    @Override
    public ResultVO gerCommentsCountByProductId(String productId) {
        //查询当前商品评价的总数
        Example example = new Example(ProductComments.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("productId",productId);
        //总数
        int totalCount = productCommentsMapper.selectCountByExample(example);
        //查询好评数
        criteria.andEqualTo("commType",1);
        int goodCount = productCommentsMapper.selectCountByExample(example);
        //查询中评数
        Example example1 = new Example(ProductComments.class);
        Example.Criteria criteria1 = example1.createCriteria();
        criteria1.andEqualTo("productId",productId);
        criteria1.andEqualTo("commType",0);
        int midCount = productCommentsMapper.selectCountByExample(example1);
        //查询差评数
        Example example2 = new Example(ProductComments.class);
        Example.Criteria criteria2 = example2.createCriteria();
        criteria1.andEqualTo("productId",productId);
        criteria2.andEqualTo("commType",-1);
        int badCount = productCommentsMapper.selectCountByExample(example2);
        //计算好评率
        double percent=(Double.parseDouble(goodCount+"")/Double.parseDouble(totalCount+""))*100;
        String percentStr=(percent+"").substring(0,(percent+"").lastIndexOf(".")+3);
        HashMap<String,Object> map=new HashMap<>();
        map.put("totalCount",totalCount);
        map.put("goodCount",goodCount);
        map.put("midCount",midCount);
        map.put("badCount",badCount);
        map.put("percent",percentStr);
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", map);
        return resultVO;
    }
}
