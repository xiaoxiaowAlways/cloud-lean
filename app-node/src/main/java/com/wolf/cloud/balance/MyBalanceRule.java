package com.wolf.cloud.balance;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;

/**
 * @author Captain Wolf
 * 2018/9/9 21:50
 */
public class MyBalanceRule extends AbstractLoadBalancerRule {

  @Override
  public void initWithNiwsConfig(IClientConfig iClientConfig) {

  }

  @Override
  public Server choose(Object key) {
    return null;
  }
}
