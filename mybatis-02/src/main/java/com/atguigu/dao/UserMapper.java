package com.atguigu.dao;

import com.atguigu.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/21 22:11
 */
public interface UserMapper {
    List<User> getUserList();
    User getUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
