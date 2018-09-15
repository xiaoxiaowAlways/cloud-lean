package com.wolf.cloud.api.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Captain Wolf
 * 2018/9/9 17:27
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class User implements Serializable {
  private Integer id;
  private String name;
  private Integer age;
  private String dbSource;

  public User(String name) {
    this.name = name;
  }
}
