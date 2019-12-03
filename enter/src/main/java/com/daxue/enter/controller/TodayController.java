package com.daxue.enter.controller;


import com.daxue.enter.service.TodayService;
import com.daxue.enter.util.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author daxue0929
 * @since 2019-11-25
 */
@CrossOrigin
@RestController
@RequestMapping("/ajax/today")
public class TodayController {

    Logger logger = LoggerFactory.getLogger(TodayController.class);


    @Autowired
    private TodayService todayService;

    /**
     * 异步注解测试接口
     * @return
     */
    @GetMapping(value = "test001")
    public ResultData test() {
        ResultData resultData = new ResultData();
        try {

            todayService.test(); //异步方法
            System.out.println("同步方法===");

            resultData.setDesc("同步方法 or 异步方法");
            resultData.setStatus(true);
            resultData.setCode(200);
        }catch (Exception e) {
            logger.error(e.getMessage());
        }



        return resultData;
    }
}
