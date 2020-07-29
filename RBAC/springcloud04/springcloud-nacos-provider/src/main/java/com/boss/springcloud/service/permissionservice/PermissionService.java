package com.boss.springcloud.service.permissionservice;


import com.boss.springcloud.entity.po.Permission;

import java.util.List;

public interface PermissionService {
    int addPermission(Permission permission);

    int deleteById(int id);

    int updatePermission(Permission permission);

    List<Permission> queryAllPermission();
}
