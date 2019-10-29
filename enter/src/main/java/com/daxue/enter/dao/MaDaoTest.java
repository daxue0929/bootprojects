package com.daxue.enter.dao;

import com.daxue.enter.model.Ma;
import org.apache.ibatis.annotations.*;

public interface  MaDaoTest {
    @Select("select * from hist.ma where id = ${id}")
    @Results({
            @Result(property = "id" ,column = "id"),
            @Result(property = "usrId", column = "usr_id"),
            @Result(property = "msgIds", column = "msg_ids"),
            @Result(property = "usrCnt", column = "usr_cnt"),

    })
    Ma get(@Param("id") long id);

}


