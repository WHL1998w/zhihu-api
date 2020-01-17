package com.scs.zhihu.api.service;

import com.scs.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName SpecialService
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/15
 **/
public interface SpecialService {
    /**
     * 查询所有专题
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     * @return List<Special>
     */
    List<Special> selectRecent();
}
