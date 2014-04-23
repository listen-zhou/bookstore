package com.winhong.bookstore.entity;

/**
 * 书籍类别
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2014/4/23
 */
public class Category {
    /**
     * 主键ID
     */
    private int id;
    /**
     * 父类别ID
     */
    private int parentId;
    /**
     * 类别名
     */
    private String name;

    /**
     * 设置 父类别ID.
     *
     * @param parentId 父类别ID.
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 父类别ID.
     *
     * @return 父类别ID.
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * 设置 类别名.
     *
     * @param name 类别名.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 主键ID.
     *
     * @return 主键ID.
     */
    public int getId() {
        return id;
    }

    /**
     * 获取 类别名.
     *
     * @return 类别名.
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 主键ID.
     *
     * @param id 主键ID.
     */
    public void setId(int id) {
        this.id = id;
    }
}
