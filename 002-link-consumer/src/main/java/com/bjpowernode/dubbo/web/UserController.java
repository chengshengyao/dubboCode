package com.bjpowernode.dubbo.web;

import com.bjpowernode.model.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.dubbo.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/29 1:41
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public String userDetail(Model model,Integer id){
        User user = userService.queryUserById(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
