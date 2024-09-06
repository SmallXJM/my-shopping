package com.example.myshopping.controller.admin;

import com.example.myshopping.common.Result;
import com.example.myshopping.common.ResultGenerator;
import com.example.myshopping.entity.Product;
import com.example.myshopping.service.ProductService;
import com.example.myshopping.util.PageQueryUtil;
import com.example.myshopping.util.PageResult;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/23 20:45
 * @Version 1.0
 */
@RestController
@RequestMapping("/manage-api/v1")
public class ProductController {
    //自动注入Service
    @Autowired
    private ProductService productService;

    /**
     * 分页查询商品列表
     *
     * @param pageNumber 当前页码
     * @param pageSize   每页显示多少条数据
     * @return
     */
    @RequestMapping("/product/list")
    public Result getProductListPage(
            @RequestParam(required = false) Integer pageNumber,
            @RequestParam(required = false) Integer pageSize,
            @RequestParam(required = false) String goodsName,
            @RequestParam(required = false) Integer goodsSellStatus,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate
    ) {
        //1.做参数校验
        if (pageNumber == null || pageNumber < 1) {
            pageNumber = 1;
        }
        if (pageSize == null || pageSize < 10) {
            pageSize = 10;
        }
        //2.封装参数
        Map<String, Object> params = new HashMap<>();
        params.put("page", pageNumber);//当前页码
        params.put("limit", pageSize);//每页显示多少条数据
        if (StringUtils.hasText(goodsName)) {
            params.put("goodsName", goodsName);
        }
        if (goodsSellStatus != null) {
            params.put("goodsSellStatus", goodsSellStatus);
        }
        if (startDate != null) {
            params.put("startDate", startDate);
        }
        if (endDate != null) {
            params.put("endDate", endDate);
        }
        System.out.println("params:" + params);
        PageQueryUtil pageUtil = new PageQueryUtil(params);
        //3.查询商品列表
        PageResult productListPage = productService.getProductListPage(pageUtil);
        //4.返回结果
        return ResultGenerator.genSuccessResult(productListPage);
    }

    /**
     * 根据商品ID查询商品详情
     */
    @RequestMapping("/product/{id}")
    public Result getProductDetail(@PathVariable("id") Long id) {
        //1.调用业务逻辑层查询商品详情;
        Product product = productService.getProductById(id);
        return ResultGenerator.genSuccessResult(product);
    }

    /**
     * 添加商品功能
     *
     * @param product
     * @return
     */
    @RequestMapping("/product/addProduct")
    public Result addProduct(@RequestBody Product product) {
        //设置一些默认的字段
        product.setCreateTime(new java.util.Date());//创建时间
        product.setUpdateTime(new java.util.Date());//更新时间；
//        product.setGoodsCarousel("/admin/dist/img/no-img.png");//默认的录轮播图路径;
//        product.setGoodsCoverImg("http://localhost:8088/upload/20240809_14391564.jpg");//默认的商品主图;
        product.setGoodsCarousel(product.getGoodsCoverImg());

        //1.调用业务逻辑层添加商品;
        Boolean result = productService.addProduct(product);
        if (result) {
            return ResultGenerator.genSuccessResult("添加商品成功");
        }
        return ResultGenerator.genFailResult("添加商品失败");
    }

}
