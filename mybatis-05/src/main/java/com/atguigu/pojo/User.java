package com.atguigu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/21 22:10
 */
/*@Alias("hello")*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String password;
    private String name;
}
