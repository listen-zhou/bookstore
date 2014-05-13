package com.winhong.bookstore.entity;

import com.winhong.bookstore.entity.base.BaseDomain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 书籍实体类
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2014/4/23
 */
public class Book extends BaseDomain {
    /**
     * 书籍主键ID
     */
    private long id;
    /**
     * 书名
     */
    private String name;
    /**
     * 原价
     */
    private BigDecimal originalPrice;
    /**
     * 折后价
     */
    private BigDecimal discountPrice;
    /**
     * VIP价
     */
    private BigDecimal vipPrice;
    /**
     * 作者
     */
    private String author;
    /**
     * 译者
     */
    private String translator;
    /**
     * 页码
     */
    private int pages;
    /**
     * ISBN
     */
    private String isbn;
    /**
     * 出版社
     */
    private String publisher;
    /**
     * 出版日期
     */
    private Date publishTime;
    /**
     * 上架时间
     */
    private Date addedTime;
    /**
     * 版本号
     */
    private String version;
    /**
     * 所属分类
     */
    private Category category;
    /**
     * 库存量
     */
    private int available;
    /**
     * 缩略图片
     */
    private String picSmall;
    /**
     * 普通图片
     */
    private String picNormal;
    /**
     * 大图片
     */
    private String picBig;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(BigDecimal vipPrice) {
        this.vipPrice = vipPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getPicSmall() {
        return picSmall;
    }

    public void setPicSmall(String picSmall) {
        this.picSmall = picSmall;
    }

    public String getPicNormal() {
        return picNormal;
    }

    public void setPicNormal(String picNormal) {
        this.picNormal = picNormal;
    }

    public String getPicBig() {
        return picBig;
    }

    public void setPicBig(String picBig) {
        this.picBig = picBig;
    }
}
