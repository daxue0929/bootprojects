package com.daxue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.daxue.enter.dao")
public class EnterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterApplication.class, args);
    }

//    @GetMapping(value = "/")
//    public Params test(@RequestParam String ak, @RequestParam String callId, @RequestParam String caller, @RequestParam String callee, @RequestParam String sign) {
//
//        System.out.println("参数为1：" + ak + "---" + "参数为2：" + callId + "---" + "参数为3：" + caller + "---" + "参数为4：" + callee + "---" + "参数为5：" + sign);
//        Params params = new Params();
//        params.setCode("1");
//        params.setCallId("321");
//        if (callee.indexOf("159") != -1){
//            params.setForbid("-1");
//        }else {
//            params.setForbid("1");
//        }
//        params.setMsg("success");
//
//
//
//        return params;
//
////        return createSign("7894645412222" + "45613215edsd" + "123");
//
////        HashMap<String, Object> params = new HashMap<>();
////        params.put("ak", "ak00123");
////        params.put("callId", "4567e8qwdasdfa"); //呼叫唯一标识，必填，必须唯一。
////        params.put("caller", "17344615861"); //主叫号码
////        params.put("callee", "15938618052"); //被叫号码
////        params.put("sign", createSign("ak00123" + "callId" + "sk"));
////        String response = HttpUtil.post("http://www.bsats.cn/forbid.php", params);
////        System.out.println(response instanceof String);
////        JSONObject parse = (JSONObject) JSON.parse(response);
////        System.out.println(parse);
////        System.out.println(parse.get("code"));
////
////        ArrayList arrayList = new ArrayList();
////        arrayList.add("4");
////        arrayList.add("13");
////
////        System.out.println(arrayList.size());
////        System.out.println(response);
//
//
////        return createSign("" + "" + "");
//
//    }

//    public String createSign(String s) {
//        return DigestUtils.md5DigestAsHex(s.toLowerCase().getBytes());
//    }



}

//
//class Params {
//    public String code;
//    public String msg;
//    public String callId;
//    public String forbid;
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//    public String getCallId() {
//        return callId;
//    }
//
//    public void setCallId(String callId) {
//        this.callId = callId;
//    }
//
//    public String getForbid() {
//        return forbid;
//    }
//
//    public void setForbid(String forbid) {
//        this.forbid = forbid;
//    }
//}