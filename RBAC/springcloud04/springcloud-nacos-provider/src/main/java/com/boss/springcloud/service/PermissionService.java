package com.boss.springcloud.service;


import com.boss.springcloud.entity.po.Permission;

import java.util.List;

public interface PermissionService {
    int addPermission(Permission permission);

    int deleteById(int id);

    int updatePermission(Permission permission);

    List<String> queryAllPermission(String Name);
}
