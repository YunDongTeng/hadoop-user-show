package com.zhihu.service;

import com.zhihu.vo.LineVo;
import com.zhihu.vo.PieVo;

import java.util.List;

public interface EmployService {

    LineVo topEmploy();

    List<PieVo> topEmployPie();
}
