package com.example.myshopping.controller.mall;

import com.example.myshopping.common.Result;
import com.example.myshopping.common.ResultGenerator;
import com.example.myshopping.entity.Carousel;
import com.example.myshopping.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 *
 * @Author chenj
 * @Create 2024/8/21 20:15
 * @Version 1.0
 */
@RestController
@RequestMapping("/mall-api/v1/")
public class MallCarouselController {
    //自动注入Service
    @Autowired
    private CarouselService carouselService;
    /**
     * 完成首页的轮播图的数据
     */
    @RequestMapping("/carouselsForIndex")
    public Result carouselsForIndex() {
        //1.获取轮播图数据
        List<Carousel> productImageList = carouselService.getCarouselLIst(1,5).getList();
        //2.返回这个数据;
        return ResultGenerator.genSuccessResult(productImageList);//统一响应数据；
    }
}
