package com.example.myshopping.service.impl;

import com.example.myshopping.dao.ProductMapper;
import com.example.myshopping.entity.Product;
import com.example.myshopping.service.ProductService;
import com.example.myshopping.util.PageQueryUtil;
import com.example.myshopping.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/23 20:35
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    //自动注入mapper
    @Autowired
    private ProductMapper productMapper;
    @Override
    public PageResult getProductListPage(PageQueryUtil pageUtil) {
        //1.查询商品列表
        List<Product> productList = productMapper.getProductListPage(pageUtil);
        //2.查询商品总数
        int total = productMapper.getTotalProducts(pageUtil);
        //3。构建分页对象
        /**
         * 1.将查询到的商品列表放入分页对象中
         * 2.将查询到的商品总数放入分页对象中
         * 3.将查询到的每页显示的行数放入分页对象中
         * 4.将查询到的当前页码放入分页对象中
         */
        PageResult pageResult = new PageResult(productList, total, pageUtil.getLimit(), pageUtil.getPage());
        return pageResult;
    }

    @Override
    public Product getProductById(Long goodsId) {
        Product product = productMapper.selectByPrimaryKey(goodsId);
        return product;
    }

    @Override
    public Boolean addProduct(Product product) {
        int insert = productMapper.insert(product);
        if(insert>0){
            return true;
        }
        return false;
    }
}
