package com.wang.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

public class GlobalUtil {
    public static String toJson(Object obj) {
        if (obj != null) {
            return JSONObject.toJSONString(obj);
        }else {
            throw new NullPointerException("obj toJson is null");
        }
    }
}
