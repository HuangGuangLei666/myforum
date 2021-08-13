package com.hgl.myforum.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TTopic {
    private Integer id;

    private String title;

    private String content;

    private Date createTime;

    private Integer userId;

}