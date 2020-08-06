package com.daxue.first.job;

import com.alibaba.fastjson.JSONObject;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Date;

@DisallowConcurrentExecution
public class HelloJob implements Job, Serializable {

    private static Logger logger = LoggerFactory.getLogger(HelloJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        try {

            JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
            logger.info("JobDataMap json: {}", JSONObject.toJSONString(jobDataMap));
            logger.info("Hello Job执行时间: " + new Date()+"  Blog:"+context.getJobDetail().getJobDataMap().get("blog"));
            Thread.sleep(1000 * 5);
            System.out.println("================执行完成========================");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
