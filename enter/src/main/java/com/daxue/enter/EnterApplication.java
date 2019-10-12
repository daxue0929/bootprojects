package com.daxue.enter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.daxue.util.HttpUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@SpringBootApplication
public class EnterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterApplication.class, args);
    }

    @GetMapping(value = "/")
    public String test() {

//        return createSign("7894645412222" + "45613215edsd" + "123");

        HashMap<String, Object> params = new HashMap<>();
        params.put("ak", "ak00123");
        params.put("callId", "4567e8qwdasdfa"); //呼叫唯一标识，必填，必须唯一。
        params.put("caller", "17344615861"); //主叫号码
        params.put("callee", "15938618052"); //被叫号码
        params.put("sign", createSign("ak00123" + "callId" + "sk"));
        String response = HttpUtil.post("http://www.bsats.cn/forbid.php", params);
        System.out.println(response instanceof String);
        JSONObject parse = (JSONObject) JSON.parse(response);
        System.out.println(parse);
        System.out.println(parse.get("code"));

        ArrayList arrayList = new ArrayList();
        arrayList.add("4");
        arrayList.add("13");

        System.out.println(arrayList.size());
        System.out.println(response);


        return createSign("" + "" + "");

    }

    public String createSign(String s) {
        return DigestUtils.md5DigestAsHex(s.toLowerCase().getBytes());
    }



}
