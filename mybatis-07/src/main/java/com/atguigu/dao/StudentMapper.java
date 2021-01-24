package com.atguigu.dao;

import com.atguigu.pojo.Student;

import java.util.List;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/22 23:22
 */
public interface StudentMapper {
    Student getStudentByTeacherId(int tid);
}
