package com.atguigu.dao;

import com.atguigu.pojo.Student;
import com.atguigu.pojo.Teacher;
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
    public void getTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1:student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
    @Test
    public void getStudent2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        for (Student student1:student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
}
