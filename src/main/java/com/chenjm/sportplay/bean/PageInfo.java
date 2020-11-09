package com.chenjm.sportplay.bean;

public class PageInfo<T> {
    private T bean;  //查询条件，使用bean装在
    private Integer pageNum;//查询第几页
    private int pageSize;//查询每页多少条

    private int total;//总条数

    public int getPageStart(){//获取分页开始行数
        return (this.pageNum - 1) * this.pageSize;
    }

    public int getPageMax(){//获取总页数
        return (total / pageSize) % 2 == 0 ? total / pageSize : ( (total / pageSize) + 1);
    }

    public PageInfo() {
    }

    public PageInfo(T bean, int pageNum, int pageSize) {
        this.bean = bean;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public T getBean() {
        return bean;
    }

    public void setBean(T bean) {
        this.bean = bean;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "bean=" + bean +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
