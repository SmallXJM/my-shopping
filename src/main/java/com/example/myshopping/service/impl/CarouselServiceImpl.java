package com.example.myshopping.service.impl;

import com.example.myshopping.dao.CarouselMapper;
import com.example.myshopping.entity.Carousel;
import com.example.myshopping.service.CarouselService;
import com.example.myshopping.util.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service

public class CarouselServiceImpl implements CarouselService {
    @Autowired
    private CarouselMapper carouselMapper;

    @Override
    public PageInfo getCarouselLIst(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Carousel> carousels = carouselMapper.getCarouselList();
        PageInfo<Carousel> pageInfo = new PageInfo<>(carousels);
//        PageResult<Carousel> pageResult = new PageResult<>(carousels, (int) pageInfo.getTotal(), pageSize, pageNum);
        return pageInfo;
    }

    @Override
    public Boolean insertCarsousel(Carousel carousel) {
        int i = carouselMapper.insertSelective(carousel);
        return i > 0;
    }

    @Override
    public Boolean deleteCarsousel(Integer carouselId) {
        int i = carouselMapper.deleteByPrimaryKey(carouselId);

        return i > 0;
    }

    @Override
    public Boolean updateCarsousel(Carousel carousel) {
        int i = carouselMapper.updateByPrimaryKeySelective(carousel);
        return i > 0;
    }

    @Override
    public Carousel getCarouselById(Integer carouselId) {
        return carouselMapper.getCarouselById(carouselId);
    }

    @Override
    public Boolean deleteBatch(long[] ids) {
        return carouselMapper.deleteBatch(ids) > 0;
    }

}

