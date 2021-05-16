package com.xhh.onlineMall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {

    //返回前端状态码
    private int code;
    //返回前端提示信息
    private String msg;
    //返回前端的数据
    private Object data;
}
