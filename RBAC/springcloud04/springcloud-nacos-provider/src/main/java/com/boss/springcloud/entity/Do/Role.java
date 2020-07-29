package com.boss.springcloud.entity.Do;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/27 19:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private String id;

    private String name;

    private int available;

    private Date createTime;

    private Date updateTime;
}
