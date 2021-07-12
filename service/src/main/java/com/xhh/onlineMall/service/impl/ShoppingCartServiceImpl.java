package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.ShoppingCartMapper;
import com.xhh.onlineMall.entity.ShoppingCart;
import com.xhh.onlineMall.entity.ShoppingCartVO;
import com.xhh.onlineMall.service.ShoppingCartService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.omg.DynamicAny.DynArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    private SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Override
    public ResultVO addShoppingCart(ShoppingCart shoppingCart) {

        shoppingCart.setCartTime(simpleDateFormat.format(new Date()));
        int i=shoppingCartMapper.insert(shoppingCart);
        if (i>0){
            return new ResultVO(ResStatus.OK,"success",null);
        }else {
            return new ResultVO(ResStatus.NO,"fail",null);
        }

    }

    @Transactional(propagation=Propagation.SUPPORTS)
    public ResultVO listShopcartByUserId(int userId) {
        List<ShoppingCartVO> list=shoppingCartMapper.listShopCartByUserId(userId);
        ResultVO vo = new ResultVO(ResStatus.OK, "success", list);
        return vo;
    }

    @Override
    public ResultVO updateCartNum(int cartId, int cartNum) {
        int i=shoppingCartMapper.updateCartNumByCartId(cartId,cartNum);
        if (i >0){
            return new ResultVO(ResStatus.OK, "update success", null);
        }else {
            return new ResultVO(ResStatus.NO, "update fail", null);
        }

    }

    @Override
    public ResultVO listShopCartsByCids(String cids) {
        //处理get请求传递的cids字符串
        String[] arr = cids.split(",");
        List<Integer> cidsList =new ArrayList<>();
        //遍历字符串数组，转为List<Integer>
        for (int i=0;i<arr.length;i++){
            cidsList.add(Integer.parseInt(arr[i]));
        }

        //根据商品id，查询结算列表所用的相关信息
        List<ShoppingCartVO> shoppingCartVOS = shoppingCartMapper.selectShopCartByCids(cidsList);
        ResultVO vo = new ResultVO(ResStatus.OK,"success",shoppingCartVOS);
        return vo;
    }

}
