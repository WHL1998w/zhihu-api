package com.scs.zhihu.api.service;

import com.scs.zhihu.api.entity.Favorite;
import com.scs.zhihu.api.entity.RoundTable;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName FavoriteService
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/20
 **/
public interface FavoriteService {
    /**
     * 查询所有"收藏"
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新“收藏”
     * @return List<RoundTable>
     */
    List<Favorite> selectRecent();
}
