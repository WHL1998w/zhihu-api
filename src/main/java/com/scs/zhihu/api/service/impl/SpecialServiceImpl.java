package com.scs.zhihu.api.service.impl;

import com.scs.zhihu.api.entity.Special;
import com.scs.zhihu.api.mapper.SpecialMapper;
import com.scs.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName SpecialServiceImpl
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/15
 **/
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpecialMapper specialMapper;
    @Override
    public List<Map> selectAll() {
        return specialMapper.selectAll();
    }

    @Override
    public List<Special> selectRecent() {
        return specialMapper.selectRecent();
    }
}