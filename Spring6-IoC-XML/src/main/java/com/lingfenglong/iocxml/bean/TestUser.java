package com.lingfenglong.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser{
    @Test
    public void userTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 通过id获取bean
        System.out.println(context.getBean("user"));

        // 通过类名获取bean
        System.out.println(context.getBean(User.class));

        // 通过id+类名获取bean
        System.out.println(context.getBean("user", User.class));

        // 通过实现类的接口
        System.out.println(context.getBean(Eat.class));
    }
}
