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
public class Statistics extends BaseDomain {
    /**
     * 主键ID
     */
    private long id;
    /**
     * 书籍ID
     */
    private int bookId;
    /**
     * 点击量
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
     * 评分
     */
    private float avgStar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public int getBuy() {
        return buy;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public float getAvgStar() {
        return avgStar;
    }

    public void setAvgStar(float avgStar) {
        this.avgStar = avgStar;
    }
}
