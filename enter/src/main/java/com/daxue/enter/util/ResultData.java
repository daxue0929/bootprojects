package com.daxue.enter.util;

import lombok.Data;

import org.springframework.stereotype.Component;

@Data
@Component
public class ResultData {

    public static final int SUCCESS = 200;

    /**
     * 接口调用状态
     */
    public boolean status = true;

    /**
     * code 数据状态码
     * 200 : 正常返回
     * 404 : 未找到
     * 500 : 内部错误
     */
    public int code;

    public Object data = null;

    public String desc = "";

}
