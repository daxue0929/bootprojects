package com.daxue.enter.controller;

import com.daxue.enter.service.base.PubDataService;
import com.daxue.enter.util.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/ajax/pubData")
public class PubDataController {
    public Logger logger = LoggerFactory.getLogger(PubDataController.class);

    @Autowired
    public PubDataService pubManager;




    @GetMapping(value = "listVersion")
    public ResultData list() {
        ResultData resultData = new ResultData();
        try {
            resultData.setData(pubManager.listVersion());

            resultData.setStatus(true);
            resultData.setCode(200);
            resultData.setDesc(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        return resultData;
    }
}
