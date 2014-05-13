package com.winhong.bookstore.entity;

import com.winhong.bookstore.common.Constants;
import com.winhong.bookstore.entity.base.BaseDomain;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class User extends BaseDomain {
    /**
     * 用户ID
     */
    private long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 锁定状态
     */
    private int locked;
    /**
     * 用户类型
     */
    private int userType;
    /**
     * 最后登录ip
     */
    private String lastIp;
    /**
     * 最后访问时间
     */
    private Date lastVisit;
    /**
     * 用户等级
     */
    private String rank;
    /**
     * 评论员等级
     */
    private String commentRank;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 性别
     */
    private String gender;
    /**
     * 出生年月
     */
    private Date birthday;
    /**
     * 职业
     */
    private String occupation;
    /**
     * 喜欢图书分类
     */
    private List<Integer> preferred;
    /**
     * 擅长的图书分类
     */
    private List<Integer> skilled;
    /**
     * 标签
     */
    private Set<String> tags;
    /**
     * 个人简介
     */
    private String introduction;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCommentRank() {
        return commentRank;
    }

    public void setCommentRank(String commentRank) {
        this.commentRank = commentRank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public List<Integer> getPreferred() {
        return preferred;
    }

    public void setPreferred(List<Integer> preferred) {
        this.preferred = preferred;
    }

    public List<Integer> getSkilled() {
        return skilled;
    }

    public void setSkilled(List<Integer> skilled) {
        this.skilled = skilled;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
