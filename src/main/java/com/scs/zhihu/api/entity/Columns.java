package com.scs.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Columns
 * @Description "专栏实体类"
 * @Author wanghuanle
 * @Date 2020/1/21
 **/
@Data
@Builder
public class Columns {
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer aritclesCount;
}