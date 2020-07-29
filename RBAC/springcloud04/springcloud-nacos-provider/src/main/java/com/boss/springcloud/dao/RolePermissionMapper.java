package com.boss.springcloud.dao;


import com.boss.springcloud.entity.Do.RolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RolePermissionMapper {
    int addRolePermission(RolePermission rolePermission);

    int deleteById(int id);

    int updateRolePermission(RolePermission rolePermission);

    List<RolePermission> queryAllRolePermission();
}
