package com.omall.service;

import com.omall.common.ServerResponse;
import com.omall.pojo.User;

/**
 * description: IUserService
 * author: MonoJun
 */
public interface IUserService {

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 注册
     *
     * @param user 用户
     */
    ServerResponse<String> register(User user);

    /**
     * 校验登录
     *
     * @param str  数据
     * @param type 数据类型
     */
    ServerResponse<String> checkValid(String str, String type);

    /**
     * 找回密码的问题
     *
     * @param username 用户名
     */
    ServerResponse<String> selectQuestion(String username);

    /**
     * 校验问题答案
     *
     * @param username 用户名
     * @param question 问题
     * @param answer   答案
     */
    ServerResponse<String> checkAnswer(String username, String question, String answer);

    /**
     * 重设密码
     *
     * @param username    用户名
     * @param passwordNew 新密码
     * @param forgetToken forgetToken
     */
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    /**
     * 登录状态下重置密码
     *
     * @param passwordOld  旧密码
     * @param passwordNew 新密码
     * @param user         用户
     */
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    /**
     * 更新个人信息
     *
     * @param user 用户
     */
    ServerResponse<User> updateInformation(User user);

    /**
     * 获取个人信息
     *
     * @param userId
     * @return
     */
    ServerResponse<User> getInformation(Integer userId);

    /**
     * 校验是否是管理员
     *
     * @param user 用户
     */
    ServerResponse<User> checkAdminRole(User user);
}
