package com.daxue.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wangxuedi
 * Date: 2020/6/2 11:08
 * describe:
 */
@Controller
@Slf4j
public class IoTest {

    @RequestMapping("/io/test")
    @ResponseBody
    public String ioTest(HttpServletRequest request) {

        getStrFromRequest(request);

        return "ok";
    }

    public String getStrFromRequest(HttpServletRequest request) {
        StringBuffer xml = new StringBuffer();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
            String buff = null;
            while ((buff = bufferedReader.readLine()) != null) {
                // 在页面中显示读取到的请求参数
                xml.append(buff);
            }
            log.info("从request中读取的字符串: {}", xml.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xml.toString();
    }



}
