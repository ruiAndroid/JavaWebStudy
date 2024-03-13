package com.ssm2.plugin;

import org.apache.ibatis.session.RowBounds;

/**
 * 自定义mybatis分页插件
 */
public class PageRowBounds extends RowBounds {
    private Long total;

    public PageRowBounds(int offset, int limit) {
        super(offset, limit);
    }

    public PageRowBounds() {
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
