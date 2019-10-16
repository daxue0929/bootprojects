package com.daxue.enter.controller;

import com.daxue.enter.dao.MaDaoTest;
import com.daxue.enter.model.Ma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MaDaoTest maDaoTest;

    @GetMapping(value = "/")
    public void test() {

        System.out.println("dasd");
        Ma ma = maDaoTest.get(11);

        System.out.println(ma);
    }
}
