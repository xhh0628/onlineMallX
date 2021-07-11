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

import java.text.SimpleDateFormat;
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

}
