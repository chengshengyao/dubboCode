package com.bjpowernode.dubbo.service;

import com.bjpowernode.dubbo.model.User;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.dubbo.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/29 23:53
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public interface UserService {
    /**
     * 根据用户标识获取用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id,String username);
}
