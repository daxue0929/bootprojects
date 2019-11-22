package com.daxue.enter.util;

import lombok.Data;

import org.springframework.stereotype.Component;

@Data
@Component
public class ResultData {

    public static final int SUCCESS = 200;

    /**
     * code 数据状态码
     * 200 : 正常返回
     */
    public int code;

    public Object data;

    public String desc;

}
