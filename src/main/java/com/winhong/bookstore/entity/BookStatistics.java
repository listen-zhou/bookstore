package com.winhong.bookstore.entity;

import com.winhong.bookstore.entity.base.BaseDomain;

import java.util.Date;

/**
 * 书籍统计
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2014/4/23
 */
public class BookStatistics extends BaseDomain {
    /**
     * 主键ID
     */
    private int id;
    /**
     * 书籍ID
     */
    private int bookId;
    /**
     * 点击率
     */
    private int click;
    /**
     * 购买数
     */
    private int buy;
    /**
     * 收藏数
     */
    private int favorite;
    /**
     * 评论数
     */
    private int comment;

    /**
     * 获取 主键ID.
     *
     * @return 主键ID.
     */
    public int getId() {
        return id;
    }

    /**
     * 获取 购买数.
     *
     * @return 购买数.
     */
    public int getBuy() {
        return buy;
    }

    /**
     * 获取 评论数.
     *
     * @return 评论数.
     */
    public int getComment() {
        return comment;
    }

    /**
     * 获取 点击率.
     *
     * @return 点击率.
     */
    public int getClick() {
        return click;
    }

    /**
     * 设置 主键ID.
     *
     * @param id 主键ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 设置 购买数.
     *
     * @param buy 购买数.
     */
    public void setBuy(int buy) {
        this.buy = buy;
    }

    /**
     * 获取 书籍ID.
     *
     * @return 书籍ID.
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * 获取 收藏数.
     *
     * @return 收藏数.
     */
    public int getFavorite() {
        return favorite;
    }

    /**
     * 设置 评论数.
     *
     * @param comment 评论数.
     */
    public void setComment(int comment) {
        this.comment = comment;
    }

    /**
     * 设置 点击率.
     *
     * @param click 点击率.
     */
    public void setClick(int click) {
        this.click = click;
    }

    /**
     * 设置 书籍ID.
     *
     * @param bookId 书籍ID.
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    /**
     * 设置 收藏数.
     *
     * @param favorite 收藏数.
     */
    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }
}
