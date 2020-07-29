package com.boss.springcloud.entity.vo;

import com.boss.springcloud.entity.po.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/28 23:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleVO {
    private String id;

    private String userId;

    private String RoleId;
}
