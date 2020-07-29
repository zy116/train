package com.boss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/24 14:30
 */

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumer6002 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer6002.class,args);
    }
}
