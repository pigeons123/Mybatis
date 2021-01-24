package com.atguigu.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/21 22:10
 */
/*@Alias("hello")*/
public class User {
    private int id;
    private String pwd;
    private String name;

    public User(int id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
