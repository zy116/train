package com.boss.springcloud.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/29 16:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionVO {
    private String name;

    private String url;

    private int available;

    private Date createTime;

    private Date updateTime;
}
