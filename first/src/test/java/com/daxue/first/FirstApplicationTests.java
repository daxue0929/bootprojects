package com.daxue.first;

import com.daxue.first.dao.QuartzMapper;
import com.daxue.first.pojo.Quartz;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FirstApplicationTests {

    @Autowired
    QuartzMapper quartzMapper;

    @Test
    void contextLoads() {

        List<Quartz> quartzList = quartzMapper.getQuartzList();

        System.out.println(quartzList.toString());

    }

}
