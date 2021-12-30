package com.cailei.controller;


import com.cailei.pojo.Emp;
import com.cailei.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @ResponseBody
    @RequestMapping("/findAllEmp")
    public List<Emp> findAllEmp(){
        return empService.findAll();
    }


    @ResponseBody
    @RequestMapping("/findByPage/{pageNum}/{pageSize}")
    public List<Emp> findByPage(@PathVariable("pageNum") Integer pageNum,@PathVariable("pageSize") Integer pageSize){
        return  empService.findByPage(pageNum,pageSize);

    }
}
