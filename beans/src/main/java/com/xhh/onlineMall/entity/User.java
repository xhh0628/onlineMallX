package com.xhh.onlineMall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int user_id;
    private String user_name;
    private String user_pwd;
    private String user_real_name;
}
