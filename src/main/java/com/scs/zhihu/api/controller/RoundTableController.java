package com.scs.zhihu.api.controller;

import com.scs.zhihu.api.common.Result;
import com.scs.zhihu.api.service.RoundTableService;
import com.scs.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName RoundTableController
 * @Description "圆桌讨论"
 * @Author wanghuanle
 * @Date 2020/1/18
 **/
@RestController
@RequestMapping(value = "/api/round/table")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping
    public Result getRecent(){
        return Result.success(roundTableService.selectRecent());
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(roundTableService.selectAll());
    }
}