package com.lingfenglong.spring6.annotationaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    @Test
    public void testAOP() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean("calculator", Calculator.class);
        int res = calculator.add(2, 17);
        System.out.println(res);

        System.out.println();

        int res2 = calculator.div(2, 0);
        System.out.println(res2);
    }
}
