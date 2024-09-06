package com.example.myshopping.controller.admin;

import com.example.myshopping.common.Result;
import com.example.myshopping.common.ResultGenerator;
import com.example.myshopping.controller.admin.param.BathchIdParam;
import com.example.myshopping.entity.Carousel;
import com.example.myshopping.service.CarouselService;
import com.example.myshopping.util.PageResult;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "v1", tags = "8-0.网上商城管理员模块接口")
@RequestMapping("/manage-api/v1")
public class CarouselController {
    @Autowired
    private CarouselService carouselService;

    @RequestMapping("/carousels")
    public Result list(@RequestParam(required = false) Integer pageNumber,
                       @RequestParam(required = false) Integer pageSize) {
        if (pageNumber == null || pageNumber < 1 || pageSize == null || pageSize < 5) {
            return ResultGenerator.genFailResult("分页参数异常！");
        }

        PageInfo pageInfo = carouselService.getCarouselLIst(pageNumber, pageSize);
        return ResultGenerator.genSuccessResult(pageInfo);

    }

    @RequestMapping("/addCarousels")
    public Result addCarousels(@RequestBody Carousel carousel){
        Boolean result = carouselService.insertCarsousel(carousel);
        if (result){
            return ResultGenerator.genSuccessResult("添加轮播图成功");
        }
        return ResultGenerator.genFailResult("添加轮播图失败");
    }

    @RequestMapping("/updateCarousels")
    public Result updateCarousels(@RequestBody Carousel carousel){

        Boolean result = carouselService.updateCarsousel(carousel);
        if (result){
            return ResultGenerator.genSuccessResult("更新轮播图成功");
        }
        return ResultGenerator.genFailResult("更新轮播图失败");
    }

    @RequestMapping("/deleteCarousels")
    public Result updateCarousels(@RequestBody BathchIdParam bathchIdParam){
        Boolean result = carouselService.deleteBatch(bathchIdParam.getIds());
        if (result){
            return ResultGenerator.genSuccessResult("删除轮播图成功");
        }
        return ResultGenerator.genFailResult("删除轮播图失败");
    }

    @RequestMapping("/getCarouselDetail/{id}")
    public Result getCarouselDetail(@PathVariable("id") Integer carouselId){
        Carousel carousel = carouselService.getCarouselById(carouselId);
        return ResultGenerator.genSuccessResult(carousel);
    }


}
