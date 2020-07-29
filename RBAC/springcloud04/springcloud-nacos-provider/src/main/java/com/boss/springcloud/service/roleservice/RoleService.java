package com.boss.springcloud.service.roleservice;

import com.boss.springcloud.entity.Do.Role;

import java.util.List;

public interface RoleService {
    int addRole(Role role);

    int deleteById(int id);

    int updateRole(Role role);

    List<Role> queryAllRole();
}
