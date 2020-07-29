package com.boss.springcloud.service;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/29 12:58
 */

@Service
public class AuthenticationProviderImpl implements AuthenticationProvider {
    UsersDetailsServiceImpl usersDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        UserDetails userDetails = usersDetailsService.loadUserByUsername(username);

        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
