package com.boss.springcloud.dao;

import com.boss.springcloud.entity.po.Role;
import com.boss.springcloud.entity.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
//    int addUser(User user);
//
//    int deleteUserById(int id);
//
//    int updateUser(User user);
//
//    List<User> queryAllUser();

    User getUserByName(String name);


    List<Role> getAllRole(String name);
}
