package com.daxue.first.pojo;

import lombok.Data;

import java.sql.Date;

@Data
public class Quartz {
    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 任务分组
     */
    private String jobGroup;

    /**
     * 任务名
     */
    private String jobName;

    /**
     * 任务描述
     */
    private String description;

    /**
     * cron表达式
     */
    private String cronExpression;

    /**
     * 任务执行时调用哪个类的方法 包名+类名
     */
    private String jobClassName;

    /**
     * 任务状态
     */
    private String jobStatus;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String modifyBy;

    /**
     * 更新时间
     */
    private Date modifyTime;

    private String oldJobName;//任务名称 用于修改

    private String oldJobGroup;//任务分组 用于修改
}
