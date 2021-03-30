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
 * @CreateDate: 2021/1/31 21:26
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserService userService2;
    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model,String username,Integer id) {
        User user = userService.queryUserById(id,username);
        User user1 = userService2.queryUserById(id, username);
        model.addAttribute("user",user);
        model.addAttribute("user1",user1);
        return "userDetail";
    }
}
