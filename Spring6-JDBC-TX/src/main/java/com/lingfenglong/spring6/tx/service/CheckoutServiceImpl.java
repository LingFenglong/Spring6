package com.lingfenglong.spring6.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    private BookService bookService;

    @Autowired
    public CheckoutServiceImpl(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void buyBook(int[] bookIds, int userId) {
        Arrays.stream(bookIds)
                .forEach(bookId -> bookService.buyBook(bookId, userId));
    }
}
