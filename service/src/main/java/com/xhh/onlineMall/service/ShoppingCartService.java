package com.xhh.onlineMall.service;

import com.xhh.onlineMall.entity.ShoppingCart;
import com.xhh.onlineMall.vo.ResultVO;

import java.util.List;

public interface ShoppingCartService {

    ResultVO addShoppingCart(ShoppingCart shoppingCart);

    //根据用户id查询购物车列表
    ResultVO listShopcartByUserId(int userId);

    ResultVO updateCartNum(int cartId,int cartNum);

    ResultVO listShopCartsByCids(String cids);
}
