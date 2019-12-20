package com.daxue.enter.config;


import com.daxue.enter.util.ResultData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class UploadExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResultData UploadException(MaxUploadSizeExceededException e,
                                HttpServletResponse response) throws IOException {

        ResultData resultData = new ResultData();
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
//        out.print("上传文件大小超出限制");
//        out.flush();
//        out.close();

        resultData.setCode(500);
        resultData.setStatus(false);
        resultData.setDesc("上传文件大小超出限制");

        return resultData;
    }
}
