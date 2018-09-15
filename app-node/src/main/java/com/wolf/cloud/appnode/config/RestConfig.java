package com.wolf.cloud.appnode.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Captain Wolf
 * 2018/9/9 18:29
 */
@Configuration
public class RestConfig {
  @Bean
  @LoadBalanced //轮循
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @Bean
  public IRule myRule() {
    IRule rule;
//    rule = new RandomRule();//随机
    rule = new RetryRule();//重试
    return rule;
  }
}
