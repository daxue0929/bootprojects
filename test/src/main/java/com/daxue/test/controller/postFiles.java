package com.daxue.test.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.daxue.test.entity.FrameEntity;
import com.daxue.test.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.codec.Hex;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.commons.io.FileUtils;

/**
 * @author wangxuedi
 * Date: 2020/3/30 10:43
 * describe:
 */
@RestController
@Slf4j
public class postFiles {
    @PostMapping(value = "fileTest")
    public void test(HttpServletRequest request) {
        try {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            ServletInputStream inputStream1 = multipartRequest.getInputStream();
            Map parameterMap = multipartRequest.getParameterMap();
            Object path = parameterMap.get("path");
            String s = JSONObject.toJSONString(path); log.info(s);

            JSONArray objects = JSONObject.parseArray(s);
            log.info(objects.toJSONString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 辅助测请求接口
     * @return
     */
    @GetMapping(value = "genZip")
    public String test1() {
        try {
            File file = new File("/usr/local/backmgr/upload/test.zip");
            String s = Hex.encodeToString(FileUtils.readFileToByteArray(file));
            Map<String, Object> jsonObject = new HashMap();
            jsonObject.put("time", 2);
            jsonObject.put("frameIndex", 1);
            jsonObject.put("text", "自己测试第一帧的内容");
            jsonObject.put("textSize", 20);
            jsonObject.put("image", "357.jpg");
            jsonObject.put("video", "416.mp4");
            jsonObject.put("audio", "382.mp3");
            jsonObject.put("imageSize", 85196);
            jsonObject.put("videoSize", 975872);
            jsonObject.put("audioSize", 0);
            JSONObject map = new JSONObject();
            map.put("type", 0);
            map.put("title", "自己测试彩信的标题");
            map.put("accId", 140026);
            JSONArray jsonArray = new JSONArray();
            jsonArray.add(jsonObject);
            map.put("frames", jsonArray);
            map.put("zipFile", s);
            log.info("我是客户我封装的请求是：{}", map.toString());
            String post = HttpUtil.postJson("http://backclient.yzt.com/smsclient/ajax/mmsupload/template.do", map);
            log.info("我是一个客户返回的是：{}", post);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return "ok";
    }

    /**
     * 问题函数，未解决
     * @param image
     * @param files
     * @return
     */
    private File getFileFromName(final String image, List<File> files) {
        AtomicReference<File> itemImage = null;
		files.forEach(temp -> {
			if (temp.getName().equals(image)) {
				itemImage.set(temp);
			}
		});
		return itemImage.get();
    }

}
