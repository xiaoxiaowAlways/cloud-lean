package com.wolf.cloud.user.mapper;

import com.wolf.cloud.api.entities.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/9 17:36
 */
public interface UserMapper {
  @Select("select * from user where id = #{userId}")
  User selectById(@Param("userId") Integer userId);

  @Update("update user set name = #{name} where id = #{userId}")
  int updateNameById(@Param("name") String name, @Param("userId") Integer userId);

  @Select("select * from user ")
  List<User> selectAll();
}
