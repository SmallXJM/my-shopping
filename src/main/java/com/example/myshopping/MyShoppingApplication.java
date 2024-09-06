package com.example.myshopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.myshopping.dao")
public class MyShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShoppingApplication.class, args);
    }

}
