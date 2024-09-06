package com.example.myshopping.service;

import com.example.myshopping.entity.MallUser;

import java.util.List;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/6 18:11
 * @Version 1.0
 */
public  interface MallUserService {
    /**
     * 查询所有的用户
     */
    List<MallUser> getAllUsers();
}
