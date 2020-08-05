package com.daxue.first.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
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
            logger.info("Hello Job执行时间: " + new Date()+"  Blog:"+context.getJobDetail().getJobDataMap().get("blog"));
            Thread.sleep(1000 * 5);
            System.out.println("================执行完成========================");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
