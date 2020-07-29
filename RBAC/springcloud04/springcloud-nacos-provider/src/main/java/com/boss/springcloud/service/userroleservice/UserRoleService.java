package com.boss.springcloud.service.userroleservice;

import com.boss.springcloud.entity.po.UserRole;

import java.util.List;

public interface UserRoleService {
    int addUserRole(UserRole userRole);

    int deleteById(int id);

    int updateUserRole(UserRole userRole);

    List<UserRole> queryAllUserRole();
}
