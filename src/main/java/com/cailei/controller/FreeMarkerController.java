package com.cailei.controller;


import com.cailei.pojo.Emp;
import com.cailei.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/free")
public class FreeMarkerController {

    @Autowired
    EmpService empService;

    @RequestMapping("/freemarker")
    public String FreeMarker(Map<String,Object> map){
         map.put("name","onePiece");
         return "show";
    }


    @RequestMapping("/findAllEmp")
    public ModelAndView findAllEmp(){
        List<Emp> list = empService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("empList",list);
        modelAndView.setViewName("showEmp");
        return modelAndView;

    }
}
