package com.daxue.enter.config;

import com.daxue.enter.util.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 *
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultData defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception{
        logger.error("", e);
        ResultData resultData = new ResultData();

        resultData.setDesc(e.getMessage());

        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            resultData.setCode(404);
        }else {
            resultData.setCode(500);
        }
        resultData.setData(null);
        resultData.setStatus(false);
        return resultData;
    }
}
