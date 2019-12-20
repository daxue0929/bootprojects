package com.daxue.enter.controller;

import com.daxue.enter.util.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@CrossOrigin
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/ajax/")
    public String test() {
        System.out.println("123");

        return "enter interface is good";
    }

    @GetMapping(value = "/hello")
    public String go () {
        String a = "爱你啊";

        logger.info("爱你");
        logger.error("das");
        logger.warn("today is {}", a);

        return "Hello World";
    }

    /**
     * 测试以@ControllerAdvice 注解 在全局配置一个map 在controller中拿到的方式
     * @param id
     * @param model
     * @return result
     */
    @GetMapping(value = "/tes03")
    public ResultData test03(@RequestParam Integer id, Model model) {
        ResultData result = new ResultData();
        Map<String, Object> map = model.asMap();
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        StringBuffer sb = new StringBuffer();
        sb.append("id:" + id + "??  ");

        while (iterator.hasNext()) {
            String key = iterator.next();
            Object value = map.get(key);
            sb.append(key + ">>>" + value + "    ");
        }

        result.setData(sb);

        return result;
    }
}
