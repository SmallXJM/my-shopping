/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本软件已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2021 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package com.example.myshopping.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableOpenApi
public class Swagger3Config {

    /**
     * 通过重写Swagger的Docket 方法实现 ApiInfo信息的自定义
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)// 指定swagger版本为 3.0
                .apiInfo(apiInfo())// 重写Swagger的ApiInfo 实现自定义信息
                //.ignoredParameterTypes(MallUser.class, AdminUserToken.class)
                .select() // 开始自定义配置
                .apis(RequestHandlerSelectors.basePackage("com.example.myshopping.controller"))// 指定扫描的包(最小单位为包而不是某个类)，常用方式为basePackages ...
                .paths(PathSelectors.any()) // 匹配指定api请求径，生成接口文档
                .build()// 完成配置
                .globalRequestParameters(getGlobalRequestParameters());
    }

    //生成全局通用参数
    private List<RequestParameter> getGlobalRequestParameters() {
        List<RequestParameter> parameters = new ArrayList<>();
        parameters.add(new RequestParameterBuilder()
                .name("token")
                .description("登录认证token")
                .required(false) // 非必传
                .in(ParameterType.HEADER) //请求头中的参数，其它类型可以点进ParameterType类中查看
                .query(q -> q.model(m -> m.scalarModel(ScalarType.STRING)))
                .build());
        return parameters;
    }

    /**
     * 包含API的标题、描述、版本、服务条款URL、联系信息、许可信息等。
     **/
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("网上商城接口文档")
                .description("swagger接口文档")
                .version("3.0")
                .build();
    }
}