package com.example.myshopping.controller.mall;

import com.example.myshopping.entity.MallUser;
import com.example.myshopping.service.MallUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/6 18:20
 * @Version 1.0
 */
@RestController//相当于@Controller+@ResponseBody
public class MallUserController {
    //自动注入Service
    @Autowired
    private MallUserService mallUserService;

    /**
     * 获取所有的普通用户列表
     */
    @RequestMapping("/allUsers")
    public List<MallUser> getAllUsers(){
        //1.调用业务逻辑层
        List<MallUser> mallUsers = mallUserService.getAllUsers();
        return mallUsers;
    }

    @RequestMapping("/login")
    public String login(String username, String password){
        System.out.println("username:"+username+",password:"+password);
        if(username.equals("admin")&&password.equals("123")){
            return "success";
        }else{
            return "error";
        }
    }
}
