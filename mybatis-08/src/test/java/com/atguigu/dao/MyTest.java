package com.atguigu.dao;

import com.atguigu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/23 19:43
 */
public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog(IDutils.getId(), "Mybatis如此简单", "狂神说", new Date(), 999);
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        sqlSession.close();
    }

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("title", "Java如此简单");
        map.put("author", "狂神说");
        List<Blog> blogs = mapper.queryBlogIF(map);
        System.out.println(blogs);
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("id", "6cc57572872b4cdaaaed6c1019bc5e72");
        map.put("title", "战争论");
        map.put("author", "战争之王");
        mapper.updateBlog(map);
        sqlSession.close();
    }
    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        map.put("ids",list);
        List<Blog> blogs = mapper.queryBlogForEach(map);
        System.out.println(blogs);
    }
}
