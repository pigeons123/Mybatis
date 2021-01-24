package com.atguigu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/23 11:46
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
