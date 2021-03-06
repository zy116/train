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
public class UserVO {
    private String username;

    private int locked;

    private Date createTime;

    private Date updateTime;
}
