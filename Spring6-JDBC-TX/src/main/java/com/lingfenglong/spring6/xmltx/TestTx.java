package com.lingfenglong.spring6.xmltx;

import com.lingfenglong.spring6.xmltx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTx {
    @Test
    public void testTx() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-xml.xml");
        BookController bookController = context.getBean("bookController", BookController.class);

        int book_id = 1;
        int userId = 1;
        bookController.buyBook(book_id, userId);
    }
}
