package com.daxue.test.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.daxue.test.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.shiro.codec.Hex;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

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


            /**
             *
             *
             *
             * {"content":
             *  {"userId":"140041",
             *  "password":"923c371b1ad5ebf83a890e6c674e8c09",
             *  "title":"视频短信测试",
             *  "frames":[
             *      {"time":50,"text":"","image":"1588923004896.jpg","video":"","audio":""},
             *      {"time":50,"text":"【视频短信测试】尖叫声！9.9元辣堡不限次。经典麦辣鸡腿堡，限时9块9！ 会员专享无限次，仅限小程序点单！退订回T，此条信息免流量","image":"","video":"","audio":""}
         *      ],
             *   "mmsFile":"504b0304140000000800c27ba850a1afce2a16a2000023a3000011000000313538383932333030343839362e6a706794fc63b42541d3360cee63dbb66d5b7d6cdbb6ed3eb66ddbb66dab8fcd3ee6f47d3fcffb7e33b3e6cf54e65abb766656645444e655115591f9b3fef3078028252e290e0002020218fc4b809f2d800800121c1c021c0c120202020a0a121a16150e160606160b190501150f9b001f0f1b179790949e8290989604179792838a96918995959580828b8f9399979e8595f93f4480a0a0a060616031e1e0309989708998ffff3e7e060148904003c06c2040c4006024201024a09f61000e000004f68fd9ffb703081804140c1ce25f2516100004e8ff47e5cf2600160408008c0882f8afe43845c6571415f4bf091300c80f0a8804fcff380200404248e284e584fffb5f48504801510109372028c8010400a4f0af0813902c880a14f09fb6ff91ddff73291000160d00102c67142a11fc7f8aff738afa5fa684c0c0fff50af9bfe5ffb914f8bf6760a0688212846c43f1836a7085dd981be9ca60b884f984e50000714050b42032c00800200440a9a21a0028618100f984f9c401ff5f6c0f088a013471783b67bde0d0a648a090969562656b9a373a6d3be03384399d363041c430c31f2591c687d180c04017140bfe312a07300a32a0fc470a160c5401001414804cdbae533e1a6711af184e0da084a40cc1bd8bd0995751b02695ca8930caa28ea5c3341d04d38ed0056e1c5652c999df8cc55138474c442fb2fecdea0455b409198b6d715a61e2cc48821b4308c7a9c8888aa86091cff84f7eff242808009a8b78d82e3a49070ce7840a27314d910289ca441baf201bdb88c2a169cc2b4e9e482308ab6decbb102e46495770313b56b73247325a2aae968ff178e5b826b42075aa17e69f5309528ec60ab11f6b2ee5f1e48f2bab929a0e021683fe0904ee9fa481c42309a92903c0a183487dec32d1c6b336a153487d764c1392e5dee89dc57958f35794121e966a486a0752b79e687f3f82687173757d3a2af179a26bc89ed1ddf25e57c946cc95ad48141da7f949d5729739aa5da645754e12d05acf7baf58a7663b4949d5be1998c6f05a8ae966c19a293a5885a3c50346fea3e47f1a852c070e4807d0266cc4cbd24e6fc700efb14096adf560bb5eabb587efd176c820598a41b7fc96c1bab7d5da647237b5352c530ba23d6ac8d2b
             *
             *
             *
             *
             *
             *
             *
             *
             *
             *
             *
             */



            File file = new File("/usr/local/backmgr/upload/test.zip");
            String s = Hex.encodeToString(FileUtils.readFileToByteArray(file));

            Map<String, Object> jsonObject = new HashMap();

            JSONObject map = new JSONObject();
            map.put("title", "王一视频短信测试");
//            map.put("userId", 143562);
//            map.put("password", "662119982a8d949c4914daf6224c748f");


            map.put("userId", 140041);
            map.put("password", "923c371b1ad5ebf83a890e6c674e8c09");

            map.put("mmsFile", "");

//            Map<String, Object> one = new HashMap();

            Map<String, Object> two = new HashMap();
            two.put("time", 50);
            two.put("text", "【视频短信测试】尖叫声！9.9元辣堡不限次。经典麦辣鸡腿堡，限时9块9！ 会员专享无限次，仅限小程序点单！退订回T，此条信息免流量");
//            two.put("image", "1588923004896.jpg");
            two.put("image", "");
            two.put("video", "");
            two.put("audio", "");

            JSONArray array = new JSONArray();
//            array.add(one);
            array.add(two);
            map.put("frames", array);

            log.info("我是客户我封装的请求是：{}", map.toString());
            String post = HttpUtil.postJson("http://smstest.izton.com/smsclient/mms/upload.do", map);
//            String post = HttpUtil.postJson("http://backclient.yzt.com/smsclient/mms/upload.do", map);

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
