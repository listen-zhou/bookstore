package com.winhong.bookstore.entity;

import com.winhong.bookstore.entity.base.BaseDomain;

import java.util.Set;

/**
 * 角色
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2014/5/25
 */
public class Role extends BaseDomain {
    /**
     * 主键ID
     */
    private int id;
    /**
     * 角色名
     */
    private String name;
    /**
     * 角色对应的权限列表
     */
    private Set<Privilege> privileges;

    /**
     * 获取 角色对应的权限列表.
     *
     * @return 角色对应的权限列表.
     */
    public Set<Privilege> getPrivileges() {
        return privileges;
    }

    /**
     * 设置 角色对应的权限列表.
     *
     * @param privileges 角色对应的权限列表.
     */
    public void setPrivileges(Set<Privilege> privileges) {
        this.privileges = privileges;
    }

    /**
     * 设置 角色名.
     *
     * @param name 角色名.
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取 角色名.
     *
     * @return 角色名.
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
