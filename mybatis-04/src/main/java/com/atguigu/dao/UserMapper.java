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
    User getUserById(int id);
    List<User> getUserByLimit(Map<String,Object> map);
    List<User> getUserByRowBounds();
}
