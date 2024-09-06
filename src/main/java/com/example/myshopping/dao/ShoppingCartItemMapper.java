package com.example.myshopping.dao;

import com.example.myshopping.entity.ShoppingCartItem;

public interface ShoppingCartItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_cart_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long cartItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_cart_item
     *
     * @mbggenerated
     */
    int insert(ShoppingCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_cart_item
     *
     * @mbggenerated
     */
    int insertSelective(ShoppingCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_cart_item
     *
     * @mbggenerated
     */
    ShoppingCartItem selectByPrimaryKey(Long cartItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_cart_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ShoppingCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_cart_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ShoppingCartItem record);
}