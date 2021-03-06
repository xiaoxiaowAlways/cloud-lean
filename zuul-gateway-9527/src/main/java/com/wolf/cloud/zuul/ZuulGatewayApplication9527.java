package com.wolf.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Captain Wolf
 * 2018/9/9 17:10
 */
@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient //服务发现
//@EnableCircuitBreaker//对hystrixR熔断机制的支持
@EnableZuulProxy
public class ZuulGatewayApplication9527 {
  public static void main(String[] args) {
    SpringApplication.run(ZuulGatewayApplication9527.class, args);
  }
}
