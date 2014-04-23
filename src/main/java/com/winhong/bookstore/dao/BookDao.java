package com.winhong.bookstore.dao;

import com.winhong.bookstore.entity.Book;
import com.winhong.bookstore.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User对象Dao
 */
@Repository
public interface BookDao extends BaseDao<Book> {
    /**
     * 列出畅销书
     * @param count
     * @return
     */
    public List<Book> listMostBuyBook(int count);
}
