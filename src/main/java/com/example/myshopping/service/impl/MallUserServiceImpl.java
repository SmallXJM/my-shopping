package com.example.myshopping.service.impl;

import com.example.myshopping.dao.MallUserMapper;
import com.example.myshopping.entity.MallUser;
import com.example.myshopping.service.MallUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/6 18:14
 * @Version 1.0
 */
@Service
public class MallUserServiceImpl implements MallUserService {

    //自动注入
    @Autowired //先根据类型查找，再根据名称查找；自动注入这个mapper接口的实现类；
    //@Resource //先根据名称查找，再根据类型查找
    private MallUserMapper mallUserMapper;
    @Override
    public List<MallUser> getAllUsers() {
        return mallUserMapper.selectAll();
    }
}
