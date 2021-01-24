package com.atguigu.dao;

import com.atguigu.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/23 11:48
 */
public interface BlogMapper {
    int addBlog(Blog blog);
    List<Blog> queryBlogIF(Map map);
    List<Blog> queryBlogChoose(Map map);
    int updateBlog(Map map);
    List<Blog> queryBlogForEach(Map map);
}
