package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.dubbo.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/30 0:01
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id,String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        System.out.println("provider over");
        return user;
    }
}
