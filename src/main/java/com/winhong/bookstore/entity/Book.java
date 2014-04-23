package com.winhong.bookstore.entity;

import com.winhong.bookstore.entity.base.BaseDomain;

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
    private int id;
    /**
     * 书名
     */
    private String name;
    /**
     * 定价
     */
    private float originalPrice;
    /**
     * 折扣
     */
    private float discount;
    /**
     * VIP价
     */
    private float vipPrice;
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
    private int pageCount;
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
    private int category;

    /**
     * 获取 折扣.
     *
     * @return 折扣.
     */
    public float getDiscount() {
        return discount;
    }

    /**
     * 获取 定价.
     *
     * @return 定价.
     */
    public float getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置 定价.
     *
     * @param originalPrice 定价.
     */
    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 获取 译者.
     *
     * @return 译者.
     */
    public String getTranslator() {
        return translator;
    }

    /**
     * 设置 页码.
     *
     * @param pageCount 页码.
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * 获取 ISBN.
     *
     * @return ISBN.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * 设置 出版日期.
     *
     * @param publishTime 出版日期.
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * 设置 作者.
     *
     * @param author 作者.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取 书名.
     *
     * @return 书名.
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 译者.
     *
     * @param translator 译者.
     */
    public void setTranslator(String translator) {
        this.translator = translator;
    }

    /**
     * 获取 出版社.
     *
     * @return 出版社.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 获取 版本号.
     *
     * @return 版本号.
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置 所属分类.
     *
     * @param category 所属分类.
     */
    public void setCategory(int category) {
        this.category = category;
    }

    /**
     * 获取 VIP价.
     *
     * @return VIP价.
     */
    public float getVipPrice() {
        return vipPrice;
    }

    /**
     * 获取 书籍主键ID.
     *
     * @return 书籍主键ID.
     */
    public int getId() {
        return id;
    }

    /**
     * 设置 ISBN.
     *
     * @param isbn ISBN.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * 获取 作者.
     *
     * @return 作者.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置 书籍主键ID.
     *
     * @param id 书籍主键ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 设置 VIP价.
     *
     * @param vipPrice VIP价.
     */
    public void setVipPrice(float vipPrice) {
        this.vipPrice = vipPrice;
    }

    /**
     * 设置 版本号.
     *
     * @param version 版本号.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 设置 出版社.
     *
     * @param publisher 出版社.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * 获取 上架时间.
     *
     * @return 上架时间.
     */
    public Date getAddedTime() {
        return addedTime;
    }

    /**
     * 设置 书名.
     *
     * @param name 书名.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 设置 上架时间.
     *
     * @param addedTime 上架时间.
     */
    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    /**
     * 获取 所属分类.
     *
     * @return 所属分类.
     */
    public int getCategory() {
        return category;
    }

    /**
     * 获取 出版日期.
     *
     * @return 出版日期.
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 设置 折扣.
     *
     * @param discount 折扣.
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    /**
     * 获取 页码.
     *
     * @return 页码.
     */
    public int getPageCount() {
        return pageCount;
    }
}
