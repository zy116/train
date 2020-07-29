package com.boss.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/24 17:09
 */

@RequestMapping("/consumer")
@RestController
public class NacosConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String SERVICE_URL;

    @RequestMapping({"/", "/index"})
    public String index() {
        return restTemplate.getForObject(SERVICE_URL + "/provider/index", String.class);
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return restTemplate.getForObject(SERVICE_URL + "/provider/login", String.class);
    }

    @RequestMapping("/level1/{id}")
    public String level1(@PathVariable("id") int id) {
        return restTemplate.getForObject(SERVICE_URL + "/provider/level1/" + id, String.class);
    }

    @RequestMapping("/level2/{id}")
    public String level2(@PathVariable("id") int id) {
        return restTemplate.getForObject(SERVICE_URL + "/provider/level2/" + id, String.class);
    }

    @RequestMapping("/level3/{id}")
    public String level3(@PathVariable("id") int id) {
        return restTemplate.getForObject(SERVICE_URL + "/provider/level3/" + id, String.class);
    }
}
