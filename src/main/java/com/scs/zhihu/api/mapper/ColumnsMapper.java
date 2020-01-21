package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.entity.Columns;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName Columns
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/21
 **/
public interface ColumnsMapper {
    /**
     * 查询展示前四个专栏
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_columns ORDER BY id LIMIT 0,4")
    List<Columns> selectRecent();

    /**
     * 查询所有收藏内容
     * @return List<Map>
     */
    @Select("SELECT * FROM t_columns")
    List<Map> selectAll();
}
