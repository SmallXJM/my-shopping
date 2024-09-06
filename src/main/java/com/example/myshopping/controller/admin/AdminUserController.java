package com.example.myshopping.controller.admin;

import com.example.myshopping.common.ResultGenerator;
import com.example.myshopping.entity.AdminUser;
import com.example.myshopping.service.AdminUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.myshopping.common.Result;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/19 20:41
 * @Version 1.0
 */
@RestController
@Api(value = "v1", tags = "8-0.网上商城管理员模块接口")
@RequestMapping("/manage-api/v1")
public class AdminUserController {

    //自动注入
    @Autowired
    private AdminUserService adminUserService;
    /**
     * 管理员登录
     */
    @RequestMapping("/adminUser/login")
    public Result adminLogin(@RequestBody AdminUser adminUser){
        //1.调用业务逻辑层
        AdminUser loginUser = adminUserService.adminLogin(adminUser.getLoginUserName(), adminUser.getLoginPassword());
        //2.判断管理员登录是否成功
        if (loginUser != null) {
            //登录成功
            return ResultGenerator.genSuccessResult(loginUser);
        } else {
            //登录失败
            return ResultGenerator.genFailResult("用户名或密码错误");
        }
    }

}
