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
    private long id;

    /**
     * 父类别ID
     */
    private int parentId;

    /**
     * 类别名
     */
    private String name;

    /**
     * 分类层级
     */
    private int level;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}