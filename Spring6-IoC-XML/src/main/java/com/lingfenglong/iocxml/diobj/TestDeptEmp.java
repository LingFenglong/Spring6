package com.lingfenglong.iocxml.diobj;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeptEmp {
    @Test
    public void testEmpObj() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-obj.xml");

        Dept dept = context.getBean("dept", Dept.class);
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

        Emp emp2 = context.getBean("emp2", Emp.class);
        System.out.println(emp2);

        Emp emp3 = context.getBean("emp3", Emp.class);
        System.out.println(emp3);
    }

    @Test
    public void testEmpArray() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-array.xml");
        Dept dept = context.getBean("dept", Dept.class);
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void testDeptListEmp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di-list.xml");
        Dept dept = context.getBean("dept", Dept.class);

        System.out.println(dept);
    }
}
