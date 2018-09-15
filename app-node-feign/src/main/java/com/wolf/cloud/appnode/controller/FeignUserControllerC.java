package com.wolf.cloud.appnode.controller;

import com.wolf.cloud.api.entities.User;
import com.wolf.cloud.api.service.UserClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/9 22:26
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class FeignUserControllerC {
//  @Autowired
  private UserClientService clientService;

  @RequestMapping("/get/{id}")
  public User get(@PathVariable("id") Integer userId) {
    return clientService.get(userId);
  }

  @SuppressWarnings("unchecked")
  @RequestMapping("/list")
  public List<User> listAll() {
    return clientService.list();
  }
}
