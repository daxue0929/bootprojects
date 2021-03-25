package com.daxue.book.busi;

import lombok.Data;

/**
 * @author daxue0929
 * @date 2021/03/25
 **/
@Data
public class ResponseData {
    public static int SUCCESS = 200;

    private Boolean status = Boolean.TRUE;
    private int code = SUCCESS;
    private String message;
    private Object data;


}
