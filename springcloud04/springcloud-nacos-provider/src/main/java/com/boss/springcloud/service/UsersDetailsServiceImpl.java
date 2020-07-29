package com.boss.springcloud.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.List;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/29 10:15
 */

public class UsersDetailsServiceImpl implements UserDetailsService {
    private List<GrantedAuthority> authorities;

    private String username;

    private String password;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
