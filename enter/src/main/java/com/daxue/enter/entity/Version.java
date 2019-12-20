package com.daxue.enter.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@Component
@TableName(value = "base.version")
public class Version {
    Integer id;
    String versionId;
    String description;
    Date time;
    String status;
    String detail;
    Date startTime;
}
