package com.wolf.cloud.user.controller;

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
  public User getUser(@PathVariable("id") Integer userId) {
    return userService.get(userId);
  }

  @GetMapping("/list")
  public List<User> listUser() {
    return userService.list();
  }

}
