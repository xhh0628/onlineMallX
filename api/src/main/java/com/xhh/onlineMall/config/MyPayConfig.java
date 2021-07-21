package com.xhh.onlineMall.config;

import com.github.wxpay.sdk.WXPayConfig;

import java.io.InputStream;

/**
 * 微信支付类，实现微信支付接口
 * 重新所有方法
 * 设施商户信息
 */
public class MyPayConfig implements WXPayConfig {

    @Override
    public String getAppID() {
        //商户appId
        return "";
    }


    @Override
    public String getMchID() {
        //用户编号
        return "";
    }

    @Override
    public String getKey() {
        //商家密钥
        return "";
    }

    @Override
    public InputStream getCertStream() {
        return null;
    }

    @Override
    public int getHttpConnectTimeoutMs() {
        return 0;
    }

    @Override
    public int getHttpReadTimeoutMs() {
        return 0;
    }
}
