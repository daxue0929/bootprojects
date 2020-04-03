package com.daxue.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @author wangxuedi
 * Date: 2020/4/3 11:07
 * describe:
 */
@Data
public class SendMsgEntity {
    private String secret = "d3d101feed321f2bb4cb7b9fdb2fb4cd";
    private String app_key;
    private String template_id;
    private JSONObject data;
    private String url;
}
