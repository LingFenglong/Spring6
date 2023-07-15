package com.lingfenglong.spring6.tx;

import com.lingfenglong.spring6.tx.config.SpringConfig;
import com.lingfenglong.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@SpringJUnitConfig(locations = "classpath:beans.xml")
@SpringJUnitConfig(classes = SpringConfig.class)
public class TestTx {
    private BookController bookController;

    @Autowired
    public TestTx(BookController bookController) {
        this.bookController = bookController;
    }

    @Test
    public void testTx() {
        int[] book_ids = { 1, 2 };
        int userId = 1;
        bookController.buyBook(book_ids, userId);
    }
}
