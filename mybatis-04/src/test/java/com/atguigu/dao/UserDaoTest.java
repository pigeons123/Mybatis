package com.atguigu.dao;

import com.atguigu.pojo.User;
import com.atguigu.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/21 22:18
 */
public class UserDaoTest {
    static Logger logger=Logger.getLogger(UserDaoTest.class);
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
    @Test
    public void testLog4j(){
       logger.info("info:进入了testLog4j方法");
       logger.debug("debug:进入了testLog4j");
       logger.debug("error:进入了testLog4j");
    }
    @Test
    public void  getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("start",0);
        map.put("size",4);
        List<User> list = mapper.getUserByLimit(map);
        System.out.println(list);
    }
    @Test
    public void getUserByRowBounds(){
        RowBounds rowBounds = new RowBounds(1, 2);
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        List<User> list = sqlSession.selectList("com.atguigu.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        System.out.println(list);
    }
}
