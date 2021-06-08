package com.xhh.onlineMall.controller;

import com.xhh.onlineMall.utils.Base64Utils;
import com.xhh.onlineMall.vo.ResStatus;
import com.xhh.onlineMall.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopcart")
@CrossOrigin
@Api(value ="购物车接口",tags = "购物车管理")
public class ShopcartController {

    @GetMapping("/list")
    public ResultVO listcarts(String token){
        //获取参数token
        if(token==null){
            return new ResultVO(ResStatus.NO,"未登录",null);
        }else{
            //校验token
            String decode = Base64Utils.decode(token);
            if (decode.endsWith("123456")){
                //token校验通过
                return new ResultVO(ResStatus.OK,"sucess",null);
            }else {
                return new ResultVO(ResStatus.NO,"token验证失败",null);
            }
        }


    }

}
