package com.daxue.enter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.daxue.enter.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
