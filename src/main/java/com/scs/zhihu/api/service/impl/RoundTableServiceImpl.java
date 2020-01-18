package com.scs.zhihu.api.service.impl;

import com.scs.zhihu.api.entity.RoundTable;
import com.scs.zhihu.api.mapper.RoundTableMapper;
import com.scs.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName RoundTableServiceImpl
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/18
 **/
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;
    @Override
    public List<Map> selectAll() {
        return roundTableMapper.selectAll();
    }

    @Override
    public List<RoundTable> selectRecent() {
        return roundTableMapper.selectRecent();
    }
}