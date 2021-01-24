package com.atguigu.dao;

import com.atguigu.pojo.User;
import com.atguigu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/21 22:18
 */
public class UserDaoTest {

    @Test
    public void test1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User userById = mapper.getUserById(2);
            System.out.println(userById);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
