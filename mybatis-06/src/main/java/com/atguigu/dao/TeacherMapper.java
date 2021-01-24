package com.atguigu.dao;

import com.atguigu.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/22 23:22
 */
public interface TeacherMapper {
    Teacher getTeacher(int id);
}
