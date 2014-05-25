package com.winhong.bookstore.service;

import com.winhong.bookstore.common.RankType;
import com.winhong.bookstore.dao.BookDao;
import com.winhong.bookstore.entity.Book;
import org.apache.ibatis.session.RowBounds;
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

    /**
     * 排行榜
     * @param count
     * @return
     */
    public List<Book> rankBooks(int count, RankType rankType) {
        return bookDao.rankBooks(count, rankType);
    }

}
