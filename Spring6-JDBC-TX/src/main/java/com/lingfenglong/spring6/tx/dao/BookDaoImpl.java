package com.lingfenglong.spring6.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void decreaseStock(int bookId, int count) {
        jdbcTemplate.update("update t_book set stock = stock - ? where book_id = ?", count, bookId);
    }

    @Override
    public int getBookPriceByBookId(int bookId) {
        return jdbcTemplate.queryForObject("select price from t_book where book_id = ?", int.class, bookId);
    }
}
