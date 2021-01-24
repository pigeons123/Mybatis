package com.atguigu.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/22 23:21
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
