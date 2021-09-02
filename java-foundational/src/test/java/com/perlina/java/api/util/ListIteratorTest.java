package com.perlina.java.api.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator常用方法测试
 *
 * @author: Perlina
 * @version:2021/8/2811:05 下午
 */
public class ListIteratorTest {

    ListIterator<Integer> listIterator;
    List<Integer> list;

    @BeforeClass
    public void initListIterator(){
        list = new ArrayList<>();
        List<Integer> asList = Arrays.asList(0, 1, 2, 3, 4, 5);
        list.addAll(asList);
        System.out.println("初始化的list集合："+list);

        listIterator = list.listIterator();
    }

    /**
     * 正向遍历集合的方法
     */
    public void iterator(){
        System.out.println("正向遍历集合：");
        while (listIterator.hasNext()) {
            Integer next =  listIterator.next();
            System.out.println(next);
        }
    }

    /**
     * 使用ListIterator正向遍历
     * @see ListIterator#hasNext()
     * @see ListIterator#next()
     * @see ListIterator#remove()
     */
    @Test
    public void testListIterator(){
        while (listIterator.hasNext()){
            Integer next = listIterator.next();
            if (next == 4){
                listIterator.remove();
            }
            System.out.println(next);
        }
        System.out.println("删除4后集合："+list);
    }

    /**
     * 使用ListIterator反向遍历
     * 反向遍历前必须先正向遍历
     * @see ListIterator#hasPrevious()
     * @see ListIterator#previous()
     */
    @Test
    public void testListIteratorHasPrevious(){
        iterator();

        //方向遍历前先正向遍历
        System.out.println("反向遍历的结果：");
        while (listIterator.hasPrevious()){
            Integer previous = listIterator.previous();
            System.out.println(previous);
        }
    }

    /**
     * 使用ListIterator获取下一个元素索引
     * @see ListIterator#nextIndex()
     */
    @Test
    public void testListIteratorNextIndex(){
        while (listIterator.hasNext()) {
            Integer next =  listIterator.next();
            int nextIndex = listIterator.nextIndex();
            System.out.println("当前元素"+next+"的下一个索引是："+nextIndex);
        }
    }

    /**
     * 使用ListIterator获取上一个元素索引
     * @see ListIterator#previousIndex()
     */
    @Test
    public void testListIteratorPreviousIndex(){
        iterator();

        while (listIterator.hasPrevious()){
            Integer previous = listIterator.previous();
            int previousIndex = listIterator.previousIndex();
            System.out.println("当前元素"+previous+"的上一个索引是："+previousIndex);
        }
    }

    /**
     * 使用ListIterator添加修改元素
     * @see ListIterator#add(Object)
     * @see ListIterator#set(Object)
     * 不能在添加的同时修改，会报非法异常
     */
    @Test
    public void testListIteratorAddSet(){
        while (listIterator.hasNext()) {
            Integer next =  listIterator.next();
            if (next == 4){
                listIterator.set(44);
            }
            System.out.println(next);
        }
        System.out.println("修改44后list："+list);
        listIterator.add(5);
        System.out.println("添加5后list："+list);
    }
}
