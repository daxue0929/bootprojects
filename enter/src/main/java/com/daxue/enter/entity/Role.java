package com.daxue.enter.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author daxue0929
 * @since 2020-01-21
 */
@Data
//@EqualsAndHashCode(callSuper = false)
//@Accessors(chain = true)
@TableName(value = "base.role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;
}
