package com.boss.springcloud.dao;


import com.boss.springcloud.entity.Do.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRoleMapper {
    int addUserRole(UserRole userRole);

    int deleteById(int id);

    int updateUserRole(UserRole userRole);

    List<UserRole> queryAllUserRole();
}
