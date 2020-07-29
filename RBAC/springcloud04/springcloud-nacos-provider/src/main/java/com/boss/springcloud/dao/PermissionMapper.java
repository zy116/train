package com.boss.springcloud.dao;

import com.boss.springcloud.entity.po.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PermissionMapper {
    int addPermission(Permission permission);

    int deleteById(int id);

    int updatePermission(Permission permission);

    List<String>  queryAllPermission();
}
