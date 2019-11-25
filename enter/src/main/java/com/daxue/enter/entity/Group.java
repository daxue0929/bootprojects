package com.daxue.enter.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author daxue0929
 * @since 2019-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户组唯一标书
     */
    private Integer id;

    /**
     * 用户组名字
     */
    private String name;

    /**
     * 函数数组(这个用户组包含哪些函数(id))
     */
    private Integer functions;

    /**
     * 用户组的状态
     */
    private Boolean status;

    /**
     * 描述
     */
    private String description;


}
