package com.perlina.java.api.util;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList集合常用方法测试
 *
 * @author: Perlina
 * @version:2021/8/2912:01 上午
 */
public class LinkedListTest {
    LinkedList<String> linkedList;

    @BeforeClass
    public void initLinkedList(){
        linkedList = new LinkedList<>();
        List<String> cityList = Arrays.asList("beijing", "shanghai", "guangzhou", "shenzhen");
        linkedList.addAll(cityList);
        System.out.println("初始化后linkedList集合："+linkedList);
    }

    /**
     * 使用LinkedList的add方法
     * @see LinkedList#add(Object)
     */
    @Test
    public void testLinkedListAdd(){
        linkedList.add("changsha");
        System.out.println("添加changsha后linkedList："+linkedList);
    }

    /**
     * 使用 LinkedList 的addFirst 和addLast
     * @see LinkedList#addFirst(Object)
     * @see LinkedList#addLast(Object)
     */
    @Test
    public void testLinkedListAddFirstAddLast(){
        linkedList.addFirst("first");
        System.out.println(linkedList);

        linkedList.addLast("last");
        System.out.println(linkedList);
    }

    /**
     * 使用 LinkedList 的getFirst 和getLast
     * @see LinkedList#getFirst()
     * @see LinkedList#getLast()
     */
    @Test
    public void testLinkedListGetFirstGetLast(){
        linkedList.addFirst("first");
        linkedList.addLast("last");

        String first = linkedList.getFirst();
        String last = linkedList.getLast();
        System.out.println(first);
        System.out.println(last);
    }

    /**
     * 使用 LinkedList 的removeFirst 和removeLast
     * @see LinkedList#removeFirst()
     * @see LinkedList#removeLast()
     */
    @Test
    public void testLinkedListRemoveFirstRemoveLast(){
        linkedList.addFirst("first");
        linkedList.addLast("last");
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
    }

    /**
     * 使用 LinkedList 的pop 和push 操作首部元素
     * @see LinkedList#push(Object)
     * @see LinkedList#pop()
     */
    @Test
    public void testLinkedListPushPop(){
        linkedList.push("first");
        System.out.println(linkedList);

        String pop = linkedList.pop();
        System.out.println(pop);
        System.out.println(linkedList);
    }

    @AfterClass
    public void destroy(){
        System.out.println("销毁前linkedList："+linkedList);
        linkedList = new LinkedList<>();
    }
}
