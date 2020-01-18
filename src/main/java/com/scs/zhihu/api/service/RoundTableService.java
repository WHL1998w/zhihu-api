package com.scs.zhihu.api.service;

import com.scs.zhihu.api.entity.RoundTable;
import com.scs.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName RoundTableService
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/18
 **/
public interface RoundTableService {
    /**
     * 查询所有"圆桌讨论"
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新“圆桌讨论”
     * @return List<RoundTable>
     */
    List<RoundTable> selectRecent();
}
