package com.wolf.cloud.balance;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Captain Wolf
 * 2018/9/9 21:51
 */
//@Configuration
public class BalancedConfig {
  @Bean
  public IRule iRule() {
//    return new MyBalanceRule();
    return new RetryRule();
  }
}
