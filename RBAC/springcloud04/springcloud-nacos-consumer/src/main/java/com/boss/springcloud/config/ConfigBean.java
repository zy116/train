package com.boss.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/21 14:08
 */

@Configuration
public class ConfigBean {

    //配置负载均衡实现restTemplate
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
