package com.xhh.onlineMall.service.impl;

import com.xhh.onlineMall.dao.ShoppingCartMapper;
import com.xhh.onlineMall.entity.ShoppingCart;
import com.xhh.onlineMall.service.ShoppingCartService;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public ResultVO addShoppingCart(ShoppingCart shoppingCart) {
        int i=shoppingCartMapper.insert(shoppingCart);
        if (i>0){
            return new ResultVO(ResStatus.OK,"success",null);
        }else {
            return new ResultVO(ResStatus.NO,"fail",null);
        }

    }
}
