package com.boss.springcloud.dao;

import com.boss.springcloud.entity.Do.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    List<User> queryAllUser();

    String getUserCode();

    String getUserPwd();
}
