package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/21 22:11
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);
    @Insert("insert into user (id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);
    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);
    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);
}
