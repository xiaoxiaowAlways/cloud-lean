package com.wolf.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Captain Wolf
 * 2018/9/9 19:01
 */
@SpringBootApplication
//EurekaServer服务器端启动类,接受其它微服务注册进来
@EnableEurekaServer
public class EurekaServerApplication7002 {
  public static void main(String[] args) {
    SpringApplication.run(EurekaServerApplication7002.class, args);
  }
}
