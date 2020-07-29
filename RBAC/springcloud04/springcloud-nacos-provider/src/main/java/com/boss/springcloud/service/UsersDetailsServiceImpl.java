package com.boss.springcloud.service;

import com.boss.springcloud.dao.UserMapper;
import com.boss.springcloud.entity.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/29 10:15
 */
@Service
public class UsersDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.getUserByName(username);
        if (user==null){
            throw new UsernameNotFoundException("用户名不存在");
        }


        return null;
    }
}
