package com.example.myshopping.service;

import com.example.myshopping.entity.Carousel;
import com.example.myshopping.util.PageResult;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

public interface CarouselService {
    PageInfo getCarouselLIst(Integer pageNum, Integer pageSize);
    Boolean insertCarsousel(Carousel carousel);
    Boolean deleteCarsousel(Integer carouselId);
    Boolean updateCarsousel(Carousel carousel);
    Carousel getCarouselById(Integer carouselId);
    Boolean deleteBatch(long[] ids);

}
