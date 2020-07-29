package com.boss.springcloud.service;

import com.boss.springcloud.entity.po.Role;
import com.boss.springcloud.entity.po.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    User getUserByName(String name);

    List<Role> getAllRole(String name);
}
