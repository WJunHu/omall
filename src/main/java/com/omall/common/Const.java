package com.omall.common;

/**
 * description: Const
 * author: MonoJun
 */
public class Const {
    //当前用户
    public static final String CURRENT_USER = "currentUser";

    //用户邮箱
    public static final String EMAIL = "email";

    //用户名
    public static final String USERNAME = "username";

    public interface Role {
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
