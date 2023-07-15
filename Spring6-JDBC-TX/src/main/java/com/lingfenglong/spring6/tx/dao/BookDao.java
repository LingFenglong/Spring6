package com.lingfenglong.spring6.tx.dao;

public interface BookDao {
    void decreaseStock(int bookId, int i);

    int getBookPriceByBookId(int bookId);
}
