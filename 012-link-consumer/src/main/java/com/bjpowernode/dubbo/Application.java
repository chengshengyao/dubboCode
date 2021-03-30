package com.bjpowernode.dubbo;

import com.bjpowernode.dubbo.service.ShopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: dubbo
 * @Package: com.bjpowernode.dubbo
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/25 1:02
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("dubbo-link-consumer.xml");
        ShopService shopService = (ShopService)classPathXmlApplicationContext.getBean("shopService");
        System.out.println(shopService.hello());

    }
}
