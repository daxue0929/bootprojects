package com.daxue.enter.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author daxue0929
 * @since 2020-01-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "base.permission")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String url;

    private String name;

    private String description;

    private Long pid;


}
