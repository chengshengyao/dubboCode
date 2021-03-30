package com.bjpowernode.service.impl;

import com.bjpowernode.model.User;
import com.bjpowernode.service.UserService;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/28 21:44
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("zhangsan");
        user.setAge(20);
        return user;
    }
}
