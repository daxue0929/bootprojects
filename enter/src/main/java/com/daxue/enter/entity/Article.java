package com.daxue.enter.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author daxue0929
 * @since 2019-12-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String intro;

    private Date time;

    private String content;

    /**
     * 所属用户
     */
    private Integer userId;

    /**
     * 评论人数组
     */
    private Integer discussantId;

    /**
     * 评论内容数组
     */
    private String discussantContent;


}
