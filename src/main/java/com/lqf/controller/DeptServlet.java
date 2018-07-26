package com.lqf.controller;

import com.lqf.bean.Dept;
import com.lqf.dao.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeptServlet {
    @Autowired
    private DeptMapper deptMapper;

    @ResponseBody
    @RequestMapping("/dept/selectByPK")
    private Dept find(){
        return deptMapper.selectByPrimaryKey(20);
    }
}
