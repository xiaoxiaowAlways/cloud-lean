package com.wolf.cloud.user.service.impl;

import com.wolf.cloud.api.entities.User;
import com.wolf.cloud.user.mapper.UserMapper;
import com.wolf.cloud.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/9 18:05
 */
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
  private UserMapper userMapper;

  @Override
  public User get(Integer userId) {
    return userMapper.selectById(userId);
  }

  @Override
  public int add(String name, Integer userId) {
    return 0;
  }

  @Override
  public List<User> list() {
    return userMapper.selectAll();
  }
}
