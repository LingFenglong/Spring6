package com.lingfenglong.iocxml.lifecircle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCircle {
    @Test
    public void testLifeCircle() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecircle.xml");

        User user = context.getBean("user", User.class);

        System.out.println("6. Bean object created");
        System.out.print(user);

        context.close();    // singleton才会自动销毁bean
        System.out.println("7. Bean object destroy");
        System.out.println("8. IoC closed");
    }
}
