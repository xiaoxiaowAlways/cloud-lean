package com.wolf.cloud.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Captain Wolf
 * 2018/9/9 17:35
 */
@Configuration
@MapperScan(basePackages = {"com.wolf.cloud.user.mapper"})
public class MybatisConfig {
  @Bean
  public ConfigurationCustomizer configurationCustomizer() {

    return (configuration) ->
    {
      //开启驼峰转换
      configuration.setMapUnderscoreToCamelCase(true);
      //开启二级缓存
      configuration.setCacheEnabled(true);
    };
  }
}
