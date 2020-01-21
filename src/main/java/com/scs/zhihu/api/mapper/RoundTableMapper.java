package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.entity.RoundTable;
import com.scs.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @InterfaceName RoundTableMapper
 * @Description "圆桌讨论"的mapper
 * @Author wanghuanle
 * @Date 2020/1/18
 **/
public interface RoundTableMapper {
    /**
     * 查询展示前四个圆桌讨论
     * @return List<RoundTable>
     */
    @Select("SELECT * FROM t_round_table ORDER BY id LIMIT 0,4")
    List<RoundTable> selectRecent();

    /**
     * 查询所有圆桌讨论
     * @return List<Map>
     */
    @Select("SELECT * FROM t_round_table ")
    List<Map> selectAll();
}
