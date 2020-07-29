package com.boss.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/29 12:58
 */

@Service
public class AuthenticationProviderImpl implements AuthenticationProvider {

    @Autowired
    UsersDetailsServiceImpl usersDetailsService;

    @Autowired
    HttpSession httpSession;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        UserDetails userDetails = usersDetailsService.loadUserByUsername(username);
        if (userDetails.getPassword().equals(password)) {
            httpSession.setAttribute("name",username);
            return new UsernamePasswordAuthenticationToken(userDetails, password,userDetails.getAuthorities());
        }
        httpSession.setAttribute("name",null);
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
