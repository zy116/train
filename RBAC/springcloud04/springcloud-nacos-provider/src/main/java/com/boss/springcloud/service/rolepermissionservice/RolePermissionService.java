package com.boss.springcloud.service.rolepermissionservice;

import com.boss.springcloud.entity.po.RolePermission;

import java.util.List;

public interface RolePermissionService {
    int addRolePermission(RolePermission rolePermission);

    int deleteById(int id);

    int updateRolePermission(RolePermission rolePermission);

    List<RolePermission> queryAllRolePermission();
}
