package com.winhong.bookstore.entity;

/**
 * 权限
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2014/5/25
 */
public class Privilege {
    /**
     * 主键ID
     */
    private int id;
    /**
     * 权限名
     */
    private String name;

    /**
     * 设置 主键ID.
     *
     * @param id 主键ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 设置 权限名.
     *
     * @param name 权限名.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 权限名.
     *
     * @return 权限名.
     */
    public String getName() {
        return name;
    }

    /**
     * 获取 主键ID.
     *
     * @return 主键ID.
     */
    public int getId() {
        return id;
    }
}
