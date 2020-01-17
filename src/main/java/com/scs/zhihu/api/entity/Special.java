package com.scs.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName Special
 * @Description 专题实体类
 * @Author wanghuanle
 * @Date 2020/1/15
 **/
@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}