package com.example.myshopping.dao;

import com.example.myshopping.entity.Carousel;

import java.util.List;

public interface CarouselMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer carouselId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    int insert(Carousel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    int insertSelective(Carousel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    Carousel selectByPrimaryKey(Integer carouselId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Carousel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carousel
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Carousel record);

    List<Carousel> getCarouselList();

    Carousel getCarouselById(Integer carouselId);

    int deleteBatch(long[] ids);
}