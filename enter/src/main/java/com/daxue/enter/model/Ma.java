package com.daxue.enter.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by gencode on Mar 6, 2018 11:51:07 AM.
 */
public class Ma implements Serializable,Comparable<Ma> {
    private static final long serialVersionUID = 5454155825314635342L;

    /**
     * db_column: msg_id
     */
    @JsonIgnore              //忽略不返回到前端
    public long msgId;
    /**
     * db_column: acc_id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)   //如果为空则不返回到前端
    public int accId;
    /**
     * db_column: time
     */
    public int time;
    /**
     * db_column: submit_time
     */
    public int submitTime;
    /**
     * db_column: timeout
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")   //时间日期格式化处理
    public int timeout;
    /**
     * db_column: flags
     */
    public int flags;
    /**
     * db_column: ip
     */
    public Object ip;
    /**
     * db_column: gw_id
     */
    public int gwId;
    /**
     * db_column: ch_id
     */
    public int chId;
    /**
     * db_column: usr_cnt
     */
    public short usrCnt;
    /**
     * db_column: blk_cnt
     */
    public short blkCnt;
    /**
     * db_column: nil_cnt
     */
    public short nilCnt;
    /**
     * db_column: white
     */
    public short white;
    /**
     * db_column: black
     */
    public short black;
    /**
     * db_column: source
     */
    public short source;
    /**
     * db_column: status
     */
    public short status;
    /**
     * db_column: tc_id
     */
    public short tcId;
    /**
     * db_column: priority
     */
    public short priority;
    /**
     * db_column: pk_total
     */
    public short pkTotal;
    /**
     * db_column: msg_fmt
     */
    public short msgFmt;
    /**
     * db_column: tp_pid
     */
    public short tpPid;
    /**
     * db_column: tp_udhi
     */
    public short tpUdhi;
    /**
     * db_column: sign
     */
    public String sign;
    /**
     * db_column: msg
     */
    public String msg;
    /**
     * db_column: ext_id
     */
    public String extId;
    /**
     * db_column: usr_id
     */
    public String[] usrId;
    /**
     * db_column: msg_ids
     */
    public Long[] msgIds;
    /**
     * db_column: audit
     */
    public int audit;
    /**
     * db_column: audit_time
     */
    public int auditTime;
    /**
     * db_column: ts
     */
    public Timestamp ts;

    public int area;
    public int signRecv;
    /**
     * db_column: id
     * db remark:标识
     */
    public long id;

    public String info;
    public Ma() {
    }

    @Override
    public String toString() {
        return "Ma{" +
                "msgId=" + msgId +
                ", accId=" + accId +
                ", time=" + time +
                ", submitTime=" + submitTime +
                ", timeout=" + timeout +
                ", flags=" + flags +
                ", ip=" + ip +
                ", gwId=" + gwId +
                ", chId=" + chId +
                ", usrCnt=" + usrCnt +
                ", blkCnt=" + blkCnt +
                ", nilCnt=" + nilCnt +
                ", white=" + white +
                ", black=" + black +
                ", source=" + source +
                ", status=" + status +
                ", tcId=" + tcId +
                ", priority=" + priority +
                ", pkTotal=" + pkTotal +
                ", msgFmt=" + msgFmt +
                ", tpPid=" + tpPid +
                ", tpUdhi=" + tpUdhi +
                ", sign='" + sign + '\'' +
                ", msg='" + msg + '\'' +
                ", extId='" + extId + '\'' +
                ", usrId=" + Arrays.toString(usrId) +
                ", msgIds=" + Arrays.toString(msgIds) +
                ", audit=" + audit +
                ", auditTime=" + auditTime +
                ", ts=" + ts +
                ", area=" + area +
                ", signRecv=" + signRecv +
                ", id=" + id +
                ", info='" + info + '\'' +
                '}';
    }

    public Ma(
            Long id
    ) {
        this.id = id;
    }







    @Override
    public int compareTo(Ma another) {
        if (another == null) {
            return -1;
        }
        return (int)(this.id - another.id);
    }

    public static final String FN_msgId = "msgId";
    public static final String FN_accId = "accId";
    public static final String FN_time = "time";
    public static final String FN_submitTime = "submitTime";
    public static final String FN_timeout = "timeout";
    public static final String FN_flags = "flags";
    public static final String FN_ip = "ip";
    public static final String FN_gwId = "gwId";
    public static final String FN_chId = "chId";
    public static final String FN_usrCnt = "usrCnt";
    public static final String FN_blkCnt = "blkCnt";
    public static final String FN_nilCnt = "nilCnt";
    public static final String FN_white = "white";
    public static final String FN_black = "black";
    public static final String FN_source = "source";
    public static final String FN_status = "status";
    public static final String FN_tcId = "tcId";
    public static final String FN_priority = "priority";
    public static final String FN_pkTotal = "pkTotal";
    public static final String FN_msgFmt = "msgFmt";
    public static final String FN_tpPid = "tpPid";
    public static final String FN_tpUdhi = "tpUdhi";
    public static final String FN_sign = "sign";
    public static final String FN_msg = "msg";
    public static final String FN_extId = "extId";
    public static final String FN_usrId = "usrId";
    public static final String FN_msgIds = "msgIds";
    public static final String FN_audit = "audit";
    public static final String FN_auditTime = "auditTime";
    public static final String FN_ts = "ts";
    public static final String FN_tsBegin = "tsBegin";
    public static final String FN_tsEnd = "tsEnd";
    public static final String FN_id = "id";
    public static final String FN_idBegin = "idBegin";
    public static final String FN_idEnd = "idEnd";
}
