package com.example.myshopping.service;

import com.example.myshopping.entity.Product;
import com.example.myshopping.util.PageQueryUtil;
import com.example.myshopping.util.PageResult;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/23 20:33
 * @Version 1.0
 */
public interface ProductService {

    /**
     * 分页获取商品列表
     */
    PageResult getProductListPage(PageQueryUtil pageUtil);
    /**
     * 根据商品id查询商品详情
     */
    Product getProductById(Long goodsId);

    /**
     * 增加商品功能;
     */
    Boolean addProduct(Product product);
}
