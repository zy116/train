package com.boss.springcloud.dao;

import com.boss.springcloud.entity.Do.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleMapper {
    int addRole(Role role);

    int deleteById(int id);

    int updateRole(Role role);

    List<Role> queryAllRole();
}
