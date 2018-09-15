package com.wolf.cloud.user.service;

import com.wolf.cloud.api.entities.User;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/9 18:04
 */
public interface UserService {
  User get(Integer userId);

  int add(String name, Integer userId);

  List<User> list();
}
