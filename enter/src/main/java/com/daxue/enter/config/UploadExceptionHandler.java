package com.daxue.enter.config;


import com.daxue.enter.util.ResultData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @ControllerAdvice是一个全局数据处理软件，因此也可以在@ControllerAdvice中配置全局数据，
 * 使用@ModelAttribute注解进行配置。
 */
@ControllerAdvice
public class UploadExceptionHandler {

//    @ExceptionHandler(MaxUploadSizeExceededException.class)
//    public ResultData UploadException(MaxUploadSizeExceededException e,
//                                HttpServletResponse response) throws IOException {
//
//        ResultData resultData = new ResultData();
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
//        out.print("上传文件大小超出限制");
//        out.flush();
//        out.close();

//        resultData.setCode(500);
//        resultData.setStatus(false);
//        resultData.setDesc("上传文件大小超出限制");
//
//        return resultData;
//    }

    @ModelAttribute(value = "userInfo")
    public Map<String, String> userInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "王雪迪");
        map.put("age", "23");

        return map;
    }

}
