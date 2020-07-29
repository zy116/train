package com.boss.springcloud.service.impl;

import com.boss.springcloud.dao.RoleMapper;
import com.boss.springcloud.entity.po.Role;
import com.boss.springcloud.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/28 11:04
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int addRole(Role role) {
        return roleMapper.addRole(role);
    }

    @Override
    public int deleteById(int id) {
        return roleMapper.deleteById(id);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public List<Role> queryAllRole() {
        return roleMapper.queryAllRole();
    }
}
