package com.scs.zhihu.api.mapper;

import com.scs.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @InterfaceName SectionMapper
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/1/15
 **/
public interface SectionMapper {
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId} ")
    List<Section> getSectionsBySpecialId(String sepcialId);
}
