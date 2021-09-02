package com.perlina.java.api.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Set接口常用实现类方法
 *
 * @author: Perlina
 * @version:2021/8/302:50 下午
 */
public class SetTest {

    /**
     * HashSet的特性
     */
    @Test
    public void testHashSetFeature(){
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        set.add("python");
        set.add("go");
        System.out.println(set);
        //[python, java, go]
     }

    /**
     * hashCode
     */
    @Test
     public void testHashSetElementHashCode(){
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        set.add("python");
        set.add("go");

        for (String s : set) {
            System.out.println(s+":"+s.hashCode());
        }
     }

    /**
     * LinkedHashSet的特性
     */
    @Test
    public void testLinkedHashSetFeature(){
        Set<String> set = new LinkedHashSet<>();
        set.add("java");
        set.add("java");
        set.add("python");
        set.add("go");
        System.out.println(set);
    }

    /**
     * TreeSet的特性
     */
    @Test
    public void testTreeSetFeature(){
        Set<String> set = new TreeSet<>();
        set.add("java");
        set.add("java");
        set.add("python");
        set.add("go");
        //字符升序排序a-z
        System.out.println(set);
    }

    /**
     * TreeSet的特性:字符降序
     */
    @Test
    public void testTreeSetStringDesc(){
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        set.add("java");
        set.add("java");
        set.add("python");
        set.add("go");

        //字符降序排序z-a
        System.out.println(set);
    }
}
