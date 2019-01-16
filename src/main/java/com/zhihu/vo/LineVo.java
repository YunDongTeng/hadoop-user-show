package com.zhihu.vo;

import java.util.ArrayList;
import java.util.List;

public class LineVo {

    private List<String> xData = new ArrayList<>();

    private List<Integer> yData = new ArrayList<>();


    public List<String> getxData() {
        return xData;
    }

    public void setxData(List<String> xData) {
        this.xData = xData;
    }

    public List<Integer> getyData() {
        return yData;
    }

    public void setyData(List<Integer> yData) {
        this.yData = yData;
    }
}
