package com.daxue.service;

import com.alibaba.fastjson.JSONObject;
import com.daxue.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangxuedi
 * Date: 2020/4/3 11:02
 * describe:
 */
@Service
@Slf4j
public class SendMsgManager {

    /**
     * 绑定通知
     * url: https://u.ifeige.cn/api/message/send
     */
    public void sengMsg() {
        String url = "https://u.ifeige.cn/api/message/send";
        Map<String, Object> sendMsgEntity = new HashMap<>();
        sendMsgEntity.put("secret", "d3d101feed321f2bb4cb7b9fdb2fb4cd");
        sendMsgEntity.put("app_key" ,"713cdb1038ec521abe890e78a34071fb");//指定对应的模板app_key

        JSONObject data = new JSONObject();

        JSONObject first = new JSONObject();
        first.put("value","{{来自你的好朋友}}");
        first.put("color","#173177");
        data.put("first", first);

        JSONObject keyword1 = new JSONObject();
        keyword1.put("value","{{亲爱的你}}");
        keyword1.put("color","#173177");
        data.put("keyword1", keyword1);

        JSONObject keyword2 = new JSONObject();
        keyword2.put("value","{{对亲爱的你一声问候}}");
        keyword2.put("color","#173177");
        data.put("keyword2", keyword2);

        JSONObject remark = new JSONObject();
        remark.put("value","{{正文：今天是开心的一天希望你开心如意，万事顺利！}}");
        remark.put("color","#173177");
        data.put("remark", remark);

        sendMsgEntity.put("data" ,data);
        sendMsgEntity.put("template_id" ,"pk1bKxgoXSZR4UPyjXVU8u9XCP_VaembO_SjUUhpZ5M");


        String s = HttpUtil.postJson(url, sendMsgEntity);

    }

}
