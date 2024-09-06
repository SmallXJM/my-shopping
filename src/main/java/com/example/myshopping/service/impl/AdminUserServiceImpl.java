package com.example.myshopping.service.impl;

import com.example.myshopping.dao.AdminUserMapper;
import com.example.myshopping.entity.AdminUser;
import com.example.myshopping.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/19 20:34
 * @Version 1.0
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    //自动注入
    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser adminLogin(String userName, String password) {
        return adminUserMapper.getAdminUser(userName,password);
    }
}
