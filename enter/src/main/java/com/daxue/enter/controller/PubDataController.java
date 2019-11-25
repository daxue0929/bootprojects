package com.daxue.enter.controller;

import com.daxue.enter.pojo.Version;
import com.daxue.enter.service.base.PubDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ajax/pubData")
public class PubDataController {

    @Autowired
    public PubDataService pubManager;

    @GetMapping(value = "listVersion")

    public List<Version> list() {
        return pubManager.listVersion();
    }
}
