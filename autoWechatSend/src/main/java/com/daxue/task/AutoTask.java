package com.daxue.task;

import com.daxue.service.SendMsgManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author wangxuedi
 * Date: 2020/4/3 10:51
 * describe:
 */
@Component
@Slf4j
public class AutoTask {

    @Autowired
    SendMsgManager sendMsgManager;

    @Scheduled(cron = "0/30 * * * * ?")
    public void sengMsgToWechat() {
        try {
            sendMsgManager.sengMsg();
        }catch (Exception e) {
            log.error(e.getMessage());
        }
        System.out.println("30秒过去了: " + System.currentTimeMillis());
    }

}
