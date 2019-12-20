package com.daxue.enter.util;

import lombok.Data;

import org.springframework.stereotype.Component;

@Data
@Component
public class ResultData {

    public static final int SUCCESS = 200;

    /**
     * 标识成功或者失败
     * true/false
     */
    public boolean status = true;


    /**
     * code 返回状态码
     *
     * 200 : 正常返回
     * 404 : 未找到
     * 500 : 内部错误
     */
    public int code;

    public Object data = null; //返回体数据 默认为 null

    public String desc = "";  // 返回信息描述， // 默认为 "" 字符串

}
