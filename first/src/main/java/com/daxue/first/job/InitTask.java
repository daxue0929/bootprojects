package com.daxue.first.job;

import com.daxue.first.dao.QuartzMapper;
import com.daxue.first.pojo.Quartz;
import lombok.extern.slf4j.Slf4j;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Slf4j
@Component
public class InitTask implements ApplicationRunner {

    @Autowired
    QuartzMapper quartzMapper;

    @Autowired
    private Scheduler scheduler;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Long count = quartzMapper.getQuartCount();
        if(count==0){
            log.info("初始化测试任务");

            Quartz quartz = new Quartz();
            quartz.setJobGroup("test");
            quartz.setJobName("测试");
            quartz.setDescription("测试任务,每30秒后台打印数据");
            quartz.setJobClassName("com.daxue.first.job.HelloJob");
            quartz.setCronExpression("0/30 * * * * ?");


            Class cls = Class.forName(quartz.getJobClassName()) ;
            cls.newInstance();
            JobDetail job = JobBuilder.newJob(cls).withIdentity(quartz.getJobName(), quartz.getJobGroup()).withDescription(quartz.getDescription()).build();

            //添加JobDataMap数据
            job.getJobDataMap().put("blog", "https://rstyro.github.io/blog/");

            // 触发时间点
            CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(quartz.getCronExpression());

            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger"+quartz.getJobName(), quartz.getJobGroup())
                    .startNow().withSchedule(cronScheduleBuilder).build();


            //交由Scheduler安排触发
            scheduler.scheduleJob(job, trigger);

            TriggerKey triggerKey = TriggerKey.triggerKey(quartz.getJobName(), quartz.getJobGroup());
            Trigger.TriggerState triggerState = scheduler.getTriggerState(triggerKey);


            quartz.setJobStatus(JobStatus.RUN.getStatus());
            quartz.setCreateTime(new Date(new java.util.Date().getTime()));



//            quartzMapper.save(quartz);

        }

    }
}
