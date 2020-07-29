package com.boss.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 过滤器功能，开启这个过滤器之后，之前的url都没有用，只有在达到这个过滤器要求之后才会出结果
 * @author 12964
 * @version 1.0
 * @date 2020/7/23 15:59
 */

@Component
@Slf4j
public class LogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (uname==null){
            log.info("用户名为null，非法用户");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    //数字越小加载顺序越高
    public int getOrder() {
        return 0;
    }
}
