package com.daxue.enter.service.impl;

import com.daxue.enter.entity.Today;
import com.daxue.enter.mapper.TodayMapper;
import com.daxue.enter.service.TodayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author daxue0929
 * @since 2019-11-25
 */
@Service
public class TodayServiceImpl extends ServiceImpl<TodayMapper, Today> implements TodayService {

    @Async
    public void test() {
        try {
            Thread.sleep(2000);

            System.out.println("异步方法-------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
