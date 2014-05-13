package com.winhong.bookstore.common;

/**
 * 整个应用通用的常量
 * <br><b>类描述:</b>
 * <pre>|</pre>
 *
 * @see
 */
public class Constants {
    /**
     * 用户对象放到Session中的键名称
     */
    public static final String USER_CONTEXT = "USER_CONTEXT";

    /**
     * 将登录前的URL放到Session中的键名称
     */
    public static final String LOGIN_TO_URL = "toUrl";

    /**
     * 每页的记录数
     */
    public static final int PAGE_SIZE = 10;

    /**
     * 用户解锁对应的状态值
     */
    public static final int USER_UNLOCK = 0;
    /**
     * 锁定用户对应的状态值
     */
    public static final int USER_LOCK = 1;

    /**
     * 普通用户类型
     */
    public static final int USER_NORMAL = 0;
    /**
     * 管理员类型
     */
    public static final int USER_ADMIN = 1;
}
