package com.daxue.enter.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by gencode on Mar 6, 2018 11:51:07 AM.
 */
public class Ma {

    public long id;

    public Integer[] usrId;

    public String[] msgIds;

    public int usrCnt;

    public short pkTotal;

    public String audit;

    public Date auditTime;

    public Date time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer[] getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer[] usrId) {
        this.usrId = usrId;
    }

    public String[] getMsgIds() {
        return msgIds;
    }

    public void setMsgIds(String[] msgIds) {
        this.msgIds = msgIds;
    }

    public int getUsrCnt() {
        return usrCnt;
    }

    public void setUsrCnt(int usrCnt) {
        this.usrCnt = usrCnt;
    }

    public short getPkTotal() {
        return pkTotal;
    }

    public void setPkTotal(short pkTotal) {
        this.pkTotal = pkTotal;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
