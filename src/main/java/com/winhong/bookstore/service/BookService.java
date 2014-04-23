package com.winhong.bookstore.service;

import com.winhong.bookstore.dao.BookDao;
import com.winhong.bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 书籍相关的核心业务逻辑
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public List<Book> listPopularBooks(int count) {
        return bookDao.listMostBuyBook(count);
    }

}
