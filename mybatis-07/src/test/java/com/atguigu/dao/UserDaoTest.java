package com.atguigu.dao;

import com.atguigu.pojo.Student;
import com.atguigu.pojo.Teacher;
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
    public void getTeacher1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void getTeacher2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2);
        sqlSession.close();
    }
}
