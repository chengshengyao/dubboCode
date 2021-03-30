package com.bjpowernode.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.dubbo
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/25 0:40
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class Application {
    public static void main(String[] args) throws IOException {
        //获取spring容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-link-provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
