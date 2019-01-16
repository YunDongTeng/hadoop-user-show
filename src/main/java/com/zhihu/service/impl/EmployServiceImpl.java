package com.zhihu.service.impl;

import com.zhihu.dao.UserDao;
import com.zhihu.entity.UserEmployEntity;
import com.zhihu.service.EmployService;
import com.zhihu.vo.LineVo;
import com.zhihu.vo.PieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class EmployServiceImpl implements EmployService {

    @Autowired
    private UserDao userDao;

    @Override
    public LineVo topEmploy() {

        List<UserEmployEntity> list = userDao.topTenEmploy();

       // Collections.sort(list);

        LineVo lineVo = new LineVo();

        List<String> xData = new LinkedList<>();
        List<Integer> yData = new LinkedList<>();
        list.stream().forEach(e->{
            xData.add(e.getEmploy());
            yData.add(e.getCount());
        });
        lineVo.setxData(xData);
        lineVo.setyData(yData);

        return lineVo;
    }

    @Override
    public List<PieVo> topEmployPie() {
        List<UserEmployEntity> list = userDao.topTenEmploy();
        List<PieVo> pieVos = new ArrayList<>();
        list.stream().forEach(e->{
            pieVos.add(new PieVo(e.getEmploy(),e.getCount()));
        });
        return pieVos;
    }
}
