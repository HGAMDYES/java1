package com.atguigu.java;

import com.sun.tools.javac.Main;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author HG
 * @create 2021-10-27-10:50
 */
public class CompareTest {
    @Test
    public void test1(){
        String[] arr = new String[]{"AA","CC","GG","MM","KK","BB"};
        Arrays.sort(arr,new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));

    }
    @Test
    public void test2(){

    }
}
