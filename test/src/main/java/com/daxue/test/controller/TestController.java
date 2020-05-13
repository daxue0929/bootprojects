package com.daxue.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Admin
 * @date 2020/03/12
 **/
@RestController
@Slf4j
public class TestController {

    @GetMapping("/tttttt")
    public String test() {

        return "";
    }

    @PostMapping(value = "/testArr")
    public String testArr(@RequestBody ArrayList<Integer> arrayList) {

        if (arrayList instanceof ArrayList) {
            log.info("是数组");
        }
        log.info(arrayList.toString());
        return "ok";
    }


}
