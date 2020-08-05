package com.daxue.first.dao;

import com.daxue.first.pojo.Quartz;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface QuartzMapper {
    public long getQuartCount();
    List<Quartz> getQuartzList();
}
