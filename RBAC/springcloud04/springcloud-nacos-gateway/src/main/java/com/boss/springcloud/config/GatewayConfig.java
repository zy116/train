package com.boss.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author 12964
 * @version 1.0
 * @date 2020/7/24 14:12
 */
@Configuration
public class GatewayConfig {
    public static final long DEFAULT_TIMEOUT = 30000;

    public static String NACOS_SERVER_ADDR;

    public static String NACOS_NAMESPACE;

    public static String NACOS_ROUTE_DATA_ID;

    public static String NACOS_ROUTE_GROUP;

    //服务注册地址
    @Value("${spring.cloud.nacos.config.server-addr}")
    public void setNacosServerAddr(String nacosServerAddr){
        NACOS_SERVER_ADDR = nacosServerAddr;
    }

    //命名空间
    @Value("${spring.cloud.nacos.config.namespace}")
    public void setNacosNamespace(String nacosNamespace){
        NACOS_NAMESPACE = nacosNamespace;
    }

    //dataId
    @Value("${nacos.gateway.route.config.data-id}")
    public void setNacosRouteDataId(String nacosRouteDataId){
        NACOS_ROUTE_DATA_ID = nacosRouteDataId;
    }

    //组名
    @Value("${nacos.gateway.route.config.group}")
    public void setNacosRouteGroup(String nacosRouteGroup){
        NACOS_ROUTE_GROUP = nacosRouteGroup;
    }

}
