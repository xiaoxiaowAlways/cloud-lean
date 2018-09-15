package com.wolf.cloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Captain Wolf
 * 2018/9/9 17:10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //服务发现
public class ConfigUserApplication8001 {
  public static void main(String[] args) {
    SpringApplication.run(ConfigUserApplication8001.class, args);
  }
}
