package com.boss.springcloud.service.impl;

import com.boss.springcloud.dao.RolePermissionMapper;
import com.boss.springcloud.entity.po.RolePermission;
import com.boss.springcloud.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/28 11:03
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public int addRolePermission(RolePermission rolePermission) {
        return rolePermissionMapper.addRolePermission(rolePermission);
    }

    @Override
    public int deleteById(int id) {
        return rolePermissionMapper.deleteById(id);
    }

    @Override
    public int updateRolePermission(RolePermission rolePermission) {
        return rolePermissionMapper.updateRolePermission(rolePermission);
    }

    @Override
    public List<RolePermission> queryAllRolePermission() {
        return rolePermissionMapper.queryAllRolePermission();
    }
}
