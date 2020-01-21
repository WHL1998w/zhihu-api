package com.scs.zhihu.api.service;

import com.scs.zhihu.api.entity.Columns;
import com.scs.zhihu.api.entity.Favorite;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName ColumnsService
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/21
 **/
public interface ColumnsService {
    /**
     * 查询所有"专栏"
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新“收藏”
     * @return List<Columns>
     */
    List<Columns> selectRecent();
}
