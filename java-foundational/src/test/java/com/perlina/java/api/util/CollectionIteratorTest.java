package com.perlina.java.api.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator测试方法
 *
 * @author: Perlina
 * @version:2021/8/285:49 下午
 */
public class CollectionIteratorTest {

    Collection<String> collection;

    @BeforeClass
    public void initCollection(){
        collection = new ArrayList<>(Arrays.asList("广州","深圳","上海","北京"));
    }

    /**
     * 迭代器的常用方法
     * @see Iterator#hasNext()
     * @see Iterator#next()
     */
    @Test
    public void testCollectionIterator(){
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }

    /**
     * 迭代器的常用方法
     * @see Iterator#remove()
     */
    @Test
    public void testCollectionIteratorRemove(){
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if ("深圳".equals(next)){
                iterator.remove();
            }else {
                System.out.println(next);
            }
        }
    }

    @Test
    public void testCollectionIteratorNoSuchElementException(){
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        //已经取完了，会报错
        System.out.println(iterator.next());
    }

    @Test
    public void testCollectionIteratorConcurrentModificationException(){
        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            collection.remove("深圳");
            System.out.println(next);
        }
    }

    /**
     * 增强for循环变量集合和数组
     */
    @Test
    public void testForEachCollectionArray(){
        for (String city : collection) {
            System.out.println(city);
        }

        System.out.println();
        Object[] objects = collection.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }


}
