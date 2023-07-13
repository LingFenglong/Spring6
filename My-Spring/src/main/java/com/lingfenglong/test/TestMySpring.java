package com.lingfenglong.test;

import com.lingfenglong.bean.AnnotationApplicationContext;
import com.lingfenglong.bean.ApplicationContext;
import com.lingfenglong.service.UserService;
import org.junit.jupiter.api.Test;


public class TestMySpring {
    @Test
    public void testBean() {
        ApplicationContext context = new AnnotationApplicationContext("com.lingfenglong");
        UserService userService = context.getBean(UserService.class);
        userService.add();
    }
}
