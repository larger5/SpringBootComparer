package com.example.springbootcomparer.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 书
 *
 * @author hongcunlin
 */
@Data
public class Book {
    /**
     * 主键
     */
    private Long id;

    /**
     * 书类型
     */
    private Integer type;

    /**
     * 书名
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 书扩展字段
     */
    private List<BookExt> bookExtList;
}
