package com.boss.springcloud.service.userservice;

import com.boss.springcloud.entity.Do.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    List<User> queryAllUser();
}
