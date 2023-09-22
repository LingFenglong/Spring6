package com.lingfenglong.springel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.ArrayList;

public class ELTest {
    @Test
    void EL1() {
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("'Hello World'.concat('!')");

        String value = (String) expression.getValue();
        System.out.println("value = " + value);
    }

    @Test
    void EL2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Computer computer = context.getBean(Computer.class);
        Memory memory = context.getBean(Memory.class);

        System.out.println("memory = " + memory);
        System.out.println("computer = " + computer);
    }

    @Test
    void EL3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Item item = context.getBean(Item.class);

        System.out.println("item.getUpName() = " + item.getUpName());
        System.out.println("item.getItemLength() = " + item.getItemLength());
        System.out.println("item.getArea() = " + item.getArea());
    }

    @Test
    void EL4() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DataItem dataItem = context.getBean(DataItem.class);
        dataItem.getStudents().forEach(System.out::println);
    }

    @Value("#{dataItem.students}")
    private ArrayList<Student> ss;

    @Value("#{dataItem.students[2]}")
    private Student s1;

    @Test
    void EL5() {
        ss.forEach(System.out::println);
        System.out.println("s1 = " + s1);
    }


}
