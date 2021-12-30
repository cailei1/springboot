package com.cailei.controller;

import com.cailei.pojo.User;
import com.cailei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/findAllUser")
    public List<User> findAll(){


        List<User> allUser = userService.findAllUser();


        return allUser;
    }
}
