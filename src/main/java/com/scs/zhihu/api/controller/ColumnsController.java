package com.scs.zhihu.api.controller;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.service.ColumnsService;
import com.scs.zhihu.api.service.FavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ColumnsController
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/21
 **/
@RestController
@RequestMapping(value = "/api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;

    @GetMapping
    public Result getRecent(){
        return Result.success(columnsService.selectRecent());
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(columnsService.selectAll());
    }
}