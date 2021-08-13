package com.hgl.myforum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TUser {
    private Integer id;

    private String username;

    private String password;

    private Date createTime;

}