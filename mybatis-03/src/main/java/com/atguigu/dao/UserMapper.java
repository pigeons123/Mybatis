package com.atguigu.dao;

import com.atguigu.pojo.User;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/21 22:11
 */
public interface UserMapper {
    User getUserById(int id);
}
