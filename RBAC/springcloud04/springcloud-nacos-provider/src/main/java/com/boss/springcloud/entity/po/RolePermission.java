package com.boss.springcloud.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/27 19:27
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolePermission {

    private String id;

    private String roleId;

    private int permissionId;
}
