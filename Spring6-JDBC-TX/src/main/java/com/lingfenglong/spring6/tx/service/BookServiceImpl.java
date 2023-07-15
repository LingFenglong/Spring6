package com.lingfenglong.spring6.tx.service;

import com.lingfenglong.spring6.tx.dao.BookDao;
import com.lingfenglong.spring6.tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void buyBook(int bookId, int userId) {
        int bookPrice = bookDao.getBookPriceByBookId(bookId);
        bookDao.decreaseStock(bookId, 1);
        userDao.increaseBalance(userId, bookPrice);
    }
}
