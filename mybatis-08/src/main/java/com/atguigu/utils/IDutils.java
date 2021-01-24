package com.atguigu.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/23 11:54
 */
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
    }
}
