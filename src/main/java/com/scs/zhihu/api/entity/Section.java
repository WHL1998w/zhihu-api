package com.scs.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Section
 * @Description 标签实体类
 * @Author wanghuanle
 * @Date 2020/1/15
 **/
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}