package com.bjpowernode.service;

import com.bjpowernode.model.User;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/28 21:41
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public interface UserService {
    User queryUserById(Integer id);
}
