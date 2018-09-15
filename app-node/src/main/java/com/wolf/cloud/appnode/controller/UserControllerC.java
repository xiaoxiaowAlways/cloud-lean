package com.wolf.cloud.appnode.controller;

import com.wolf.cloud.api.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/9 18:30
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserControllerC {
//  private static final String REST_USER_URL_PREFIX = "http://localhost:8001/user";
  private static final String REST_USER_URL_PREFIX = "http://WOLFCLOUD-USER/user";
  private RestTemplate restTemplate;

  @GetMapping("/get/{id}")
  public User get(@PathVariable("id") Integer userId) {
    return restTemplate.getForObject(REST_USER_URL_PREFIX + "/get/" + userId, User.class);
  }

  @SuppressWarnings("unchecked")
  @GetMapping("/list")
  public List<User> listAll() {
    return restTemplate.getForObject(REST_USER_URL_PREFIX + "/list", List.class);
  }

}
