package com.boss.springcloud.service;

import com.boss.springcloud.entity.po.Role;
import com.boss.springcloud.entity.po.User;
import com.boss.springcloud.entity.vo.UserVO;

import java.util.List;

public interface UserService {
    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    List<User> queryAllUser();

    User getUserByName(String name);

    List<Role> getAllRole(String name);
}
