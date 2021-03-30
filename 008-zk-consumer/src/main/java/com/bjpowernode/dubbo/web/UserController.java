package com.bjpowernode.dubbo.web;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.dubbo.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/30 1:08
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model, Integer id, String username){
        User user = userService.queryUserById(id, username);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
