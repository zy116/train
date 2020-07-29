package com.boss.springcloud.service.impl;

import com.boss.springcloud.dao.PermissionMapper;
import com.boss.springcloud.entity.po.Permission;
import com.boss.springcloud.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/28 11:09
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public int addPermission(Permission permission) {
        return permissionMapper.addPermission(permission);
    }

    @Override
    public int deleteById(int id) {
        return permissionMapper.deleteById(id);
    }

    @Override
    public int updatePermission(Permission permission) {
        return permissionMapper.updatePermission(permission);
    }

    @Override
    public List<String>  queryAllPermission() {
        return permissionMapper.queryAllPermission();
    }
}
