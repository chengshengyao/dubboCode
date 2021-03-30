package com.bjpowernode.dubbo.model;

import java.io.Serializable;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.dubbo.model
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/29 23:50
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class User implements Serializable {
    private Integer id;
    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
