package com.xhh.onlineMall.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    public static String md5(String password){

        //生成一个md5加密器
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            return new BigInteger(1,md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }
}
