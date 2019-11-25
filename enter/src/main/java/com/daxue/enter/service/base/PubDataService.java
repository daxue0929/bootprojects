package com.daxue.enter.service.base;

import com.daxue.enter.mapper.PubDataMapper;
import com.daxue.enter.entity.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PubDataService {

    @Autowired
    private PubDataMapper<Version> pubDao;

    public List<Version> listVersion() {
        return pubDao.list();
    }
}
