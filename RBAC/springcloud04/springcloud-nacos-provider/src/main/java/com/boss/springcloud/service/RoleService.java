package com.boss.springcloud.service;

import com.boss.springcloud.entity.po.Role;

import java.util.List;

public interface RoleService {
    int addRole(Role role);

    int deleteById(int id);

    int updateRole(Role role);

    List<Role> queryAllRole();
}
