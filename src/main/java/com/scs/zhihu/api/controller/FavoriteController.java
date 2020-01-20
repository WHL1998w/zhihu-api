package com.scs.zhihu.api.controller;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.service.FavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName FavoriteController
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/20
 **/
@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteService favoriteService;

    @GetMapping
    public Result getRecent(){
        return Result.success(favoriteService.selectRecent());
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(favoriteService.selectAll());
    }
}