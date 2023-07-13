package com.lingfenglong.iocxml.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStuTea {
    @Test
    public void testStu() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-map.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }

    @Test
    public void testRefP() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-ref.xml");
        Stu stu = context.getBean("stu", Stu.class);
        Stu stu2 = context.getBean("stu2", Stu.class);
        System.out.println(stu);
        System.out.println(stu2);
    }
}
