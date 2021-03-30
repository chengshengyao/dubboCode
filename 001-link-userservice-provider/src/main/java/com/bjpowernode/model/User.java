package com.bjpowernode.model;

import java.io.Serializable;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.model
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/1/28 21:39
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
