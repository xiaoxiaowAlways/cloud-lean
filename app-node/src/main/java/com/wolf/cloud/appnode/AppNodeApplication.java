package com.wolf.cloud.appnode;

import com.wolf.cloud.balance.BalancedConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Captain Wolf
 * 2018/9/9 17:10
 */
@SpringBootApplication
@EnableEurekaClient
//自定义负载算法
//@RibbonClient(name = "WOLFCLOUD-USER", configuration = BalancedConfig.class)
public class AppNodeApplication {
  public static void main(String[] args) {
    SpringApplication.run(AppNodeApplication.class, args);
  }
}
