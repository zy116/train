package com.boss.springcloud.config;

import com.boss.springcloud.service.impl.AuthenticationProviderImpl;
import com.boss.springcloud.service.impl.UsersDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 这是security的配置类，用于认证授权
 * @author 12964
 * @version 1.0
 * @date 2020/7/16 16:57
 */

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UsersDetailsServiceImpl usersDetailsService;

    /*
     * 设置对应权限
     * @param http
     * @author 12964
     * @return void
     * @date 2020/7/29 20:47
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人都能看到，功能页只有对应权限的人能访问
        //请求授权的规则
        http.authorizeRequests()
                .antMatchers("/").permitAll() //允许所有人看到这页
                .antMatchers("/level1/**").hasAnyRole("ADMIN")
                .antMatchers("/level2/**").hasAnyRole("ADMIN,USER")
                .antMatchers("/level3/**").hasAnyRole("ADMIN");

        //没有权限就默认跳转到登录页面 跳到"/login"
        http.formLogin();

        //注销功能
        http.logout().logoutSuccessUrl("/");

        http.rememberMe();
    }

    @Autowired
    AuthenticationProviderImpl authenticationProvider;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //认证，对应账号才能访问这是使用内存中的账号密码，死数据，不能用于数据库
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("lisi").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2")
//                .and()
//                .withUser("zhangsan").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3");
//        auth.userDetailsService(usersDetailsService).passwordEncoder(new BCryptPasswordEncoder());
        auth.authenticationProvider(authenticationProvider);
    }
}
