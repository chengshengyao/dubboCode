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
 * @CreateDate: 2021/1/29 18:31
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userDetail")
    public String userDetail(Model model, Integer id) {
//    根据用户标识获取用户详情
        User user = userService.queryUserById(id);
//     获取用户总人数
        Integer allUserCount = userService.queryAllUserCount();
        model.addAttribute("user",user);
        model.addAttribute("allUserCount",allUserCount);
        return "userDetail";
    }
}
