package com.wolf.cloud.api.service;

import com.wolf.cloud.api.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/9 22:23
 */
@FeignClient(value = "WOLFCLOUD-USER",fallbackFactory = UserClientServiceFallbackFactory.class)
public interface UserClientService {
  @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
  User get(@PathVariable("id") Integer userId);

  @RequestMapping(value = "/user/list", method = RequestMethod.GET)
  List<User> list();
}
