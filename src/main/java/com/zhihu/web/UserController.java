package com.zhihu.web;

import com.zhihu.dao.UserDao;
import com.zhihu.entity.UserEmployEntity;
import com.zhihu.service.EmployService;
import com.zhihu.vo.LineVo;
import com.zhihu.vo.PieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private EmployService employService;

    @GetMapping("/index")
    public String users(){
        return "/index";
    }

    @PostMapping("/employ/top")
    @ResponseBody
    public LineVo topTenEmploy(){
        return employService.topEmploy();
    }

    @PostMapping("/employ/pie/top")
    @ResponseBody
    public List<PieVo> topPieTenEmploy(){
        return employService.topEmployPie();
    }
}
