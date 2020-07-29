package com.boss.springcloud.service.userroleservice;

import com.boss.springcloud.dao.UserRoleMapper;
import com.boss.springcloud.entity.po.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/28 11:04
 */

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public int addUserRole(UserRole userRole) {
        return userRoleMapper.addUserRole(userRole);
    }

    @Override
    public int deleteById(int id) {
        return userRoleMapper.deleteById(id);
    }

    @Override
    public int updateUserRole(UserRole userRole) {
        return userRoleMapper.updateUserRole(userRole);
    }

    @Override
    public List<UserRole> queryAllUserRole() {
        return userRoleMapper.queryAllUserRole();
    }
}
