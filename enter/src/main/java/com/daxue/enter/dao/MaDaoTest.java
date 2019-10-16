package com.daxue.enter.dao;

import com.daxue.enter.model.Ma;
import org.apache.ibatis.annotations.*;

public interface  MaDaoTest {
    @Select("select * from hist.ma where id = ${id}")
    @Results({
            @Result(property = "msgId", column = "msg_id")
    })
    Ma get(@Param("id") long id);

}


