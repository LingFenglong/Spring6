package com.lingfenglong.spring6.xmltx.controller;

import com.lingfenglong.spring6.xmltx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void buyBook(int bookId, int userId) {
        bookService.buyBook(bookId, userId);
    }
}
