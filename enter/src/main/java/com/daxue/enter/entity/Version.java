package com.daxue.enter.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@Component
public class Version {
    Integer id;
    String versionId;
    String description;
    Date time;
    String status;
    String detail;
    Date startTime;
}
