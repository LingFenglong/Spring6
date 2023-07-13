package com.lingfenglong.iocxml.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrders {
    @Test
    public void testOrderSingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");

        System.out.println(context.getBean("orders", Orders.class));
        System.out.println(context.getBean("orders", Orders.class));
        System.out.println(context.getBean("orders", Orders.class));
    }

}
