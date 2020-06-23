//package com.daxue.test.job;
//
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.springframework.scheduling.quartz.QuartzJobBean;
//
///**
// * @author wangxuedi
// * Date: 2020/6/19 12:04
// * describe:
// */
//public class SampleJob extends QuartzJobBean {
//
//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        System.out.println("Quartz ---->  Hello, " + this.name);
//    }
//}
