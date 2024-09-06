package com.example.myshopping.service;

import com.example.myshopping.entity.AdminUser;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/19 20:33
 * @Version 1.0
 */
public interface AdminUserService {

    /**
     * 管理员登录
     */
    AdminUser adminLogin(String userName, String password);
}
