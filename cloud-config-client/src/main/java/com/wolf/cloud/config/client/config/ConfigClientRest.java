package com.wolf.cloud.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Captain Wolf
 * 2018/9/15 19:40
 */
@RestController
public class ConfigClientRest {
  @Value("${spring.application.name}")
  private String applicationName;

  @Value("${eureka.client.service-url.defaultZone}")
  private String eurekaServer;

  @Value("${server.port}")
  private String port;

  @RequestMapping("/config")
  public String getConfig() {
    String config = "applicationName: " + applicationName
      + "\t eurekaServer:" + eurekaServer
      + "\t port:" + port;
    System.out.println(config);
    return config;
  }
}
