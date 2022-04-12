package com.example.springbootcomparer.domain;

import lombok.Data;

import java.util.Date;
import java.util.Objects;

/**
 * 书扩展
 *
 * @author hongcunlin
 */
@Data
public class BookExt {
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建类型
     */
    private Integer type;

    /**
     * 内容
     */
    private String value;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 1.1.重写equals
     *
     * @param o 对象
     * @return 是否相等
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BookExt ext = (BookExt) o;
        return Objects.equals(id, ext.id) && Objects.equals(type, ext.type) && Objects.equals(value, ext.value) && Objects.equals(createTime, ext.createTime) && Objects.equals(updateTime, ext.updateTime);
    }

    /**
     * 1.2.重写hashCode
     *
     * @return hash值
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, type, value, createTime, updateTime);
    }
}
