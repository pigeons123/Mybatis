package com.atguigu.dao;

import com.atguigu.pojo.User;
import com.atguigu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/24 16:04
 */
/*
    一级缓存自动开启，只在SqlSession局部有效
 */

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper1 = sqlSession2.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
//        mapper.updateUser(new User(2,"aaaa","cccccccc"));
        //手动清理缓存
        User user2=mapper1.getUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);
        sqlSession2.close();
    }
}
