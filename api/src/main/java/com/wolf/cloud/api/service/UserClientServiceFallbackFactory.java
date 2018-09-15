package com.wolf.cloud.api.service;

import com.wolf.cloud.api.entities.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/9 23:42
 */
@Component
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {

  @Override
  public UserClientService create(Throwable throwable) {
    return new UserClientService() {
      @Override
      public User get(Integer userId) {
        return new User()
          .setId(userId)
          .setName("该ID" + userId + "没有对应信息，客户端提供降级信息，此时服务端已经关闭")
          .setDbSource("no dbSource in mysql");
      }

      @Override
      public List<User> list() {
        return null;
      }
    };
  }
}
