package com.atguigu.dao;

import com.atguigu.pojo.User;
import com.atguigu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;
/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/21 22:18
 */
public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = null;
        try {
            //方法一
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            /*//方法二
            List<User> userList = sqlSession.selectList("com.atguigu.dao.UserDao.getUserList");
            System.out.println(userList);*/
            System.out.println(userList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User userById = mapper.getUserById(1);
            System.out.println(userById);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int result = mapper.addUser(new User(4, "147", "傻瓜"));
            if (result > 0) {
                sqlSession.commit();
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int result = mapper.updateUser(new User(4, "呵呵", "123123"));
            if (result > 0) {
                sqlSession.commit();
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            int i = sqlSession.getMapper(UserMapper.class).deleteUser(4);
            if (i > 0) {
                sqlSession.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
