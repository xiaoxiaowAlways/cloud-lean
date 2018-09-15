package com.wolf.cloud.appnode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Captain Wolf
 * 2018/9/9 17:10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.wolf.cloud"})
@ComponentScan("com.wolf.cloud")
public class AppNodeFeignApplication {
  public static void main(String[] args) {
    SpringApplication.run(AppNodeFeignApplication.class, args);
  }
}
