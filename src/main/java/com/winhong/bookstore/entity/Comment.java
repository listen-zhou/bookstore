package com.winhong.bookstore.entity;

import java.util.Date;

/**
 * 书评
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2014/5/13
 */
public class Comment {
    /**
     * 主键ID
     */
    private long id;
    /**
     * 评论者
     */
    private User user;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 星级
     */
    private int star;
    /**
     * 评论的书籍
     */
    private Book book;
    /**
     * 评论日期
     */
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
