package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.ZhihuApiApplication;
import com.scs.zhihu.api.entity.Favorite;
import com.scs.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class FavoriteMapperTest {
    @Resource FavoriteMapper favoriteMapper;

    @Test
    void selectRecent() {
        List<Favorite> favoriteList = favoriteMapper.selectRecent();
        favoriteList.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Map> favoriteList = favoriteMapper.selectAll();
        favoriteList.forEach(System.out::println);
    }
}