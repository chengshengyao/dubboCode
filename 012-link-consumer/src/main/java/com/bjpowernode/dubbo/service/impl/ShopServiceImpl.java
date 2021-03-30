package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.service.ShopService;
import com.bjpowernode.dubbo.service.UserService;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.dubbo.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/25 0:57
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class ShopServiceImpl implements ShopService {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String hello() {
        String say = userService.say();
        return say;
    }
}
