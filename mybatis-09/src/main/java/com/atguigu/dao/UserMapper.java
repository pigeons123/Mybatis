package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/24 15:57
 */
public interface UserMapper {
    User getUserById(@Param("id") int id);
    int updateUser(User user);
}
