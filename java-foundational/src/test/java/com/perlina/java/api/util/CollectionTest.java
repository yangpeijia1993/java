package com.perlina.java.api.util;

import com.perlina.java.api.utils.StringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口常用方法
 *
 * @author: Perlina
 * @version:2021/8/284:44 下午
 */
public class CollectionTest {

    Collection<String> collection;

    @BeforeClass
    public void initCollection(){
        collection = new ArrayList<>();
        collection.add("北京");
        collection.add("上海");
        collection.add("广州");
        collection.add("深圳");
        System.out.println("原始的集合："+collection);
    }

    /**
     * 向集合中添加元素
     * @see Collection#add(Object) 
     * @see java.util.Collection#addAll(Collection) 
     */
    @Test
    public void testCollectionAddAll(){
        collection.add("长沙");
        System.out.println("添加长沙后集合："+collection);

        Collection<String> subCollection = new ArrayList(Arrays.asList("成都","武汉"));
        collection.addAll(subCollection);
        System.out.println("添加subCollection后的集合"+collection);
    }

    /**
     * 判断是否包含子元素
     * @see Collection#contains(Object)
     * @see java.util.Collection#containsAll(Collection)
     */
    @Test
    public void testCollectionContainsAll(){
        boolean isContains = collection.contains("深圳");
        System.out.println("是否包含深圳："+isContains);

        Collection<String> containsC = new ArrayList(Arrays.asList("北京","上海","广州","深圳"));
        System.out.println(containsC);
        boolean isSame = collection.containsAll(containsC);
        System.out.println(collection.equals(containsC));//true
        System.out.println("是否相同："+isSame);//true
    }

    /**
     * 删除指定元素
     * @see Collection#remove(Object)
     * @see java.util.Collection#removeAll(Collection)
     */
    @Test
    public void testCollectionRemoveAll(){
        collection.remove("北京");
        System.out.println("删除北京后集合："+collection);

        Collection<String> subCollection = new ArrayList<>(Arrays.asList("深圳","广州"));
        collection.removeAll(subCollection);
        System.out.println("删除深圳广州后集合："+collection);
    }

    /**
     * 删除集合中所有元素
     * @see Collection#clear()
     */
    @Test
    public void testCollectionClear(){
        System.out.println("删除前集合："+collection);
        collection.clear();
        System.out.println("删除后集合："+collection);
    }

    /**
     * 集合中元素个数
     * @see Collection#size()
     */
    @Test
    public void testCollectionSize(){
        System.out.println("集合中元素个数："+collection.size());
    }

    /**
     * 集合是否为空
     * @see Collection#isEmpty()
     */
    @Test
    public void testCollectionIsEmpty(){
        System.out.println(collection.isEmpty());
        collection.clear();
        System.out.println(collection.isEmpty());
    }

    /**
     * Collection集合转换为数组
     * 数组转List，asList()
     * @see Collection#toArray()
     */
    @Test
    public void testCollectionToArray(){
        //集合转数组
        Object[] objects = collection.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

        //数组转List，asList()
        List<String> strings = Arrays.asList("深圳", "广州");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    /**
     * Collection业务操作
     */
    @Test
    public void testCollectionUsage(){
        //Cellphone操作
    }





}
