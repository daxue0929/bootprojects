package com.daxue.enter.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PubDataMapper<T> {

    List<T> list();

}
