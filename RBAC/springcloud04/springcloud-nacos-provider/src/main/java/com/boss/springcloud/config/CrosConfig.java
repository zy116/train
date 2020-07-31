package com.boss.springcloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 允许跨域的配置
 * @author 12964
 * @version 1.0
 * @date 2020/7/31 12:55
 */

@Configuration
public class CrosConfig implements WebMvcConfigurer {
    /*
     * 无论何种请求，都可以允许跨域
     * @param registry
     * @author 12964
     * @return void
     * @date 2020/7/31 12:59
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET","POST","HEAD","PUT","DELETE","OPTIONS")
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*");
    }
}
