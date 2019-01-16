package com.zhihu.entity;

import java.util.Comparator;

public class UserEmployEntity implements Comparable<UserEmployEntity> {

    private String employ;
    private Integer count;

    public String getEmploy() {
        return employ;
    }

    public void setEmploy(String employ) {
        this.employ = employ;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int compareTo(UserEmployEntity o) {
        return o.count-this.count;
    }
}
