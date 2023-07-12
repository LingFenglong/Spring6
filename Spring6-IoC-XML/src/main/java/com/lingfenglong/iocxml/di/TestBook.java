package com.lingfenglong.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testSetter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        System.out.println(context.getBean("book1"));
        System.out.println(context.getBean("book2"));
        System.out.println(context.getBean("book3"));
        System.out.println(context.getBean("book4"));
    }
}