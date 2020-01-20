package com.scs.zhihu.api.service.impl;

import com.scs.zhihu.api.entity.Favorite;
import com.scs.zhihu.api.mapper.FavoriteMapper;
import com.scs.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName FavoriteServiceImpl
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/20
 **/
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;
    @Override
    public List<Map> selectAll() {
        return favoriteMapper.selectAll();
    }

    @Override
    public List<Favorite> selectRecent() {
        return favoriteMapper.selectRecent();
    }
}