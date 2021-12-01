package com.atguigu.exer;

import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;

/**
 * @author HG
 * @create 2021-10-21-23:54
 */
public class StringTest {
    @Test
    public void test1(){
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
        String str2 = String.valueOf(num);
        System.out.println(str2 == str);
    }
    @Test
    public void test2(){
        String str = "abc123";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        char[] arr = new char[]{'h','e','l','l','o'};
        String s = new String(arr);
        System.out.println(s);
    }
    @Test
    public void test3(){
        String str1 = "abc123";
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));
    }


}
