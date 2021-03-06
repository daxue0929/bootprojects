package com.daxue.enter.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import com.daxue.enter.Hello;
import com.daxue.enter.config.PassToken;
import com.daxue.enter.entity.User;
import com.daxue.enter.result.Result;
import com.daxue.enter.util.JWTUtil;
import com.daxue.enter.util.ResultData;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@CrossOrigin
@Controller
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    public Hello hello;

    @RequestMapping(value = "/ajax")
    public String test() {
        System.out.println("123");

        return "enter interface is good";
    }

    @GetMapping(value = "/hello")
    public Result go (@RequestParam("name") String name) {
        String a = "爱你啊";


        String token = JWTUtil.getToken(new User("admin", "123"));

//        currentUser.login(token);

        logger.info("爱你");
        logger.error("das");
        logger.warn("today is {}", a);

        return Result.success("hello world");
    }

    /**
     * 测试以@ControllerAdvice 注解 在全局配置一个map 在controller中拿到的方式
     * @param id
     * @param model
     * @return result
     */
    @GetMapping(value = "/test03")
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

    // error
    @GetMapping(value = "/test04")
    public ResultData test04() {
        ResultData result = new ResultData();
        File file = new File("/static/aa.xlsx");
        System.out.println(file);

        TemplateExportParams params = new TemplateExportParams("/static/aa.xlsx");

        Map<String, Object> map = new HashMap<String, Object>();

        List<Map<String, String>> names = new ArrayList<Map<String, String>>();
        HashMap<String, String> itemRow = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            itemRow.put("name", "王雪迪");

            names.add(itemRow);
        }
        map.put("maplist", names);
        Workbook workbook = ExcelExportUtil.exportExcel(params, map);
        File savefile = new File("/static/aa.xlsx");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }
        FileOutputStream fos = null;
        String fileName = System.currentTimeMillis() +  ".xlsx";
        try {
            fos = new FileOutputStream("/static/aa.xlsx");
            workbook.write(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return result;
    }

    @GetMapping(value = "test05")
    @PassToken
    public Result test05() {
        String jerry = hello.sayHello("test05");
        return Result.success(jerry);
    }




}
