package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.service.UserService;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.dubbo.service.impl
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/24 23:41
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class UserServiceImpl implements UserService {
    @Override
    public String say() {
        return "sayHello";
    }
}
