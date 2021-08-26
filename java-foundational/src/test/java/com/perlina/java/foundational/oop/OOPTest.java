package com.perlina.java.foundational.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面向对象的概念
 *
 * @author: Perlina
 * @version:2021/8/249:20 PM
 */
public class OOPTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(list);

        //添加
        list.add(4);
        System.out.println(list);

    }
}
