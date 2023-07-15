package com.lingfenglong.spring6.xmltx.dao;

public interface BookDao {
    void decreaseStock(int bookId, int i);

    int getBookPriceByBookId(int bookId);
}
