package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.ZhihuApiApplication;
import com.scs.zhihu.api.entity.RoundTable;
import com.scs.zhihu.api.entity.Special;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Test
    void selectRecent() {
        List<RoundTable> roundTables = roundTableMapper.selectRecent();
        roundTables.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Map> roundTables = roundTableMapper.selectAll();
        roundTables.forEach(System.out::println);
    }
}