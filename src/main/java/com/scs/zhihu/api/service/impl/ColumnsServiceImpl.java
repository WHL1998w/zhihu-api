package com.scs.zhihu.api.service.impl;

import com.scs.zhihu.api.entity.Columns;
import com.scs.zhihu.api.mapper.ColumnsMapper;
import com.scs.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ColumnsServiceImpl
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/21
 **/
@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;
    @Override
    public List<Map> selectAll() {
        return columnsMapper.selectAll();
    }

    @Override
    public List<Columns> selectRecent() {
        return columnsMapper.selectRecent();
    }
}