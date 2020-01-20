package com.scs.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName RoundTable
 * @Description “圆桌讨论”实体类
 * @Author wanghuanle
 * @Date 2020/1/18
 **/
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String tinyBanner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}