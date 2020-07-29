package com.boss.springcloud.service.userservice;

import com.boss.springcloud.dao.UserMapper;
import com.boss.springcloud.entity.Do.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/28 11:05
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }
}
