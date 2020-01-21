package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.ZhihuApiApplication;
import com.scs.zhihu.api.entity.Columns;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

@SpringBootTest(classes = ZhihuApiApplication.class)
class ColumnsMapperTest {
    @Resource ColumnsMapper columnsMapper;

    @Test
    void selectRecent() {
        List<Columns> columnsList = columnsMapper.selectRecent();
        columnsList.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Map> columnsList = columnsMapper.selectAll();
        columnsList.forEach(System.out::println);
    }
}