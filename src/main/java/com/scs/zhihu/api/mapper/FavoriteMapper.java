package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.entity.Favorite;
import com.scs.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName FavoriteMapper
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/20
 **/
public interface FavoriteMapper {
    /**
     * 查询展示前四个收藏卡片
     * @return List<Favorite>
     */
    @Select("SELECT * FROM t_favorite ORDER BY id DESC LIMIT 0,4")
    List<Favorite> selectRecent();

    /**
     * 查询所有收藏内容
     * @return List<Map>
     */
    @Select("SELECT * FROM t_favorite")
    List<Map> selectAll();
}
