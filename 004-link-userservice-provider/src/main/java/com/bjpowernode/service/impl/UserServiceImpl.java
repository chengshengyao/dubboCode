package com.bjpowernode.service.impl;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/29 16:11
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
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 52;
    }
}
