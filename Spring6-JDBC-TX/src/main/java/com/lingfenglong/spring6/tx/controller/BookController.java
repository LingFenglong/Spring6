package com.lingfenglong.spring6.tx.controller;

import com.lingfenglong.spring6.tx.service.BookService;
import com.lingfenglong.spring6.tx.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    private CheckoutService checkoutService;
    private BookService bookService;

    @Autowired
    public BookController(CheckoutService checkoutService, BookService bookService) {
        this.checkoutService = checkoutService;
        this.bookService = bookService;
    }

    public void buyBook(int[] bookIds, int userId) {
        checkoutService.buyBook(bookIds, userId);
    }

    public void buyBook(int bookId, int userId) {
        bookService.buyBook(bookId, userId);
    }
}
