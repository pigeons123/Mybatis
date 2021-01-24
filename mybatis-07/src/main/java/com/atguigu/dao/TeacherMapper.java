package com.atguigu.dao;

import com.atguigu.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/22 23:22
 */
public interface TeacherMapper {
//   List<Teacher> getTeacher();
      Teacher getTeacher(int tid);
      Teacher getTeacher2(int tid);
}
