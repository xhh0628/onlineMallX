package com.xhh.onlineMall.controller;

import com.xhh.onlineMall.entity.ShoppingCart;
import com.xhh.onlineMall.service.ShoppingCartService;
import com.xhh.onlineMall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopcart")
@CrossOrigin
@Api(value ="购物车接口",tags = "购物车管理")
public class ShopcartController {

    @Autowired
    private ShoppingCartService shoppingCartService;


    @PostMapping("/add")
    @ApiOperation("添加购物车接口")
    public ResultVO addShoppingCart(@RequestBody ShoppingCart cart,@RequestHeader("token")String token){

        ResultVO vo = shoppingCartService.addShoppingCart(cart);
        return vo;
    }

    @GetMapping("/list")
    @ApiOperation("获取购物车列表接口")
    public ResultVO list(@RequestParam("userId")Integer userId,@RequestHeader("token")String token){
        ResultVO vo=shoppingCartService.listShopcartByUserId(userId);
        return vo;
    }

    @PutMapping("/update/{cid}/{cnum}")
    @ApiOperation("修改购物车数量接口")
    public ResultVO updateNum(@PathVariable("cid") int cartId,
                              @PathVariable("cnum")int cartNum,
                              @RequestHeader("token")String token){
        ResultVO vo=shoppingCartService.updateCartNum(cartId,cartNum);
        return vo;
    }

    /**
     *
     * @param cids 结算时选择的购物车记录id
     * @param token
     * @return
     */
    @GetMapping("/listbycids")
    @ApiOperation("获取购物车列表接口")
    public ResultVO listbycids(@RequestParam("cids")String cids, @RequestHeader("token")String token){
        ResultVO vo=shoppingCartService.listShopCartsByCids(cids);
        return vo;
    }
}

