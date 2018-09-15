package com.wolf.cloud.user.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wolf.cloud.api.entities.User;
import com.wolf.cloud.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/9 18:09
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
  private UserService userService;

  @GetMapping("/get/{id}")
  @HystrixCommand(fallbackMethod = "processHystrix")
  public User getUser(@PathVariable("id") Integer userId) {
    User user = userService.get(userId);
    if (user == null) {
      throw new RuntimeException("该ID" + userId + "没有对应信息");
    }
    return user;
  }

  public User processHystrix(@PathVariable("id") Integer userId) {
    User user = new User();
    user.setId(userId);
    user.setName("该ID" + userId + "没有对应信息");
    user.setDbSource("no dbSource in mysql");
    return user;
  }

  @GetMapping("/list")
  public List<User> listUser() {
    return userService.list();
  }

}
