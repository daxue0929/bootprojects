package com.daxue.gateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static com.daxue.gateway.config.RestApiConfig.*;

/**
 * @author daxue0929
 * @date 2021/02/05
 **/
@Slf4j
@RestController
@RequestMapping(V1 + TEST)
public class TestController {

    @GetMapping
    public void test() {
        log.info("first GetMapping");
    }

    @GetMapping(ID)
    public void test1(
            @PathVariable(ID_PARAM) String id
    ) {
        log.info("second GetMapping : {}", id);
    }

    @PutMapping(ID)
    public void putTest() {
        log.info("更新了");
    }
}
