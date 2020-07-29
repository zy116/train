package com.boss.springcloud.entity.Do;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/27 19:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;

    private String usercode;

    private String username;

    private String password;

    private int locked;

    private Date createTime;

    private Date updateTime;
}
