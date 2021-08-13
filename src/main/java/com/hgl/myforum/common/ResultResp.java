package com.hgl.myforum.common;

import lombok.Data;
import lombok.extern.java.Log;

/**
 * @author HGL
 * @Date 2020/9/6
 */
@Data
public class ResultResp {
    /*SUCCESS(0,"成功"),
    FAIL(1,"失败"),;

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    ResultResp(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    *//**
     * 自己定义一个静态方法,通过code返回枚举常量对象
     * @param code
     * @return
     *//*
    public static String getValue(Integer code) {
        if (null == code) {
            return null;
        }
        for (ResultResp resultResp : ResultResp.values()) {
            if (resultResp.getCode() == code) {
                return resultResp.getDesc();
            }
        }
        return null;
    }*/
    private int code;
    private String desc;

}
