package com.perlina.java.api.util;

import com.perlina.java.api.utils.StringUtils;
import com.perlina.java.foundational.oop.interfaces.server.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

/**
 * List接口常用方法的测试方法
 *
 * @author: Perlina
 * @version:2021/8/289:27 下午
 */
public class ListTest {
    List<String> list;
    List<Cellphone> cellphone;

    @BeforeClass
    public void initList(){
        //此处可以new 任意一个List实现类，不会影响下面的List接口方法
        list = new ArrayList<>();
        List<String> citys = Arrays.asList("北京", "上海", "广州", "深圳", "北京", "上海", "广州", "深圳");
        list.addAll(citys);
        System.out.println("当前集合："+list);
    }

    @BeforeClass
    public void initCellphone(){
        cellphone = new ArrayList<>();
        cellphone.add(new Cellphone("苹果",12999));
        cellphone.add(new Cellphone("华为",16999));
        cellphone.add(new Cellphone("小米",2999));

        for (Cellphone cellphoneStr : cellphone) {
            System.out.println(cellphoneStr);
        }
    }

    /**
     *  一些Collection  的方法
     * @see List#add(Object)
     */
    @Test
    public void testListFeature(){
        //add方法
        List<String> list = new ArrayList<>();
        list.add("北京");
        list.add("上海");
        System.out.println(list);
    }

    /**
     * 指定索引添加元素
     * @see List#add(int, Object)
     * @see List#addAll(int, Collection)
     */
    @Test
    public void testListAddAll(){
        list.add(2,"2号位置添加的城市");
        System.out.println(list);

        List<String> otherCityList = Arrays.asList("添加城市2", "添加城市3");
        list.addAll(3,otherCityList);
        System.out.println(list);
    }

    /**
     * 根据指定索引获取元素
     * @see List#get(int)
     */
    @Test
    public void testListGet(){
        System.out.println("index 0："+list.get(0));
        System.out.println("index size-1："+list.get(list.size()-1));

        /**
         * IndexOutOfBoundsException
         */
        System.out.println("index size："+list.get(list.size()));

    }

    /**
     * 集合元素索引的获取
     * @see java.util.List#indexOf(Object)
     * @see java.util.List#lastIndexOf(Object)
     */
    @Test
    public void testListIndexOfLastIndexOf(){
        int firstShenzhen = list.indexOf("深圳");
        int lastShenzhen = list.lastIndexOf("深圳");

        System.out.println("第一次深圳出现索引："+firstShenzhen);
        System.out.println("最后一次深圳出现索引："+lastShenzhen);
    }

    /**
     * 根据索引删除指定元素
     * 每次删除后索引会更新
     * @see List#remove(int)
     */
    @Test
    public void testListRemove(){
        String removeFirst = list.remove(0);
        System.out.println("第一次删除的0号索引元素："+removeFirst);
        System.out.println(list);

        String removeSecond = list.remove(0);
        System.out.println("第二次删除的0号索引元素："+removeSecond);
        System.out.println(list);
    }

    /**
     * 修改指定索引的元素
     * @see List#set(int, Object)
     */
    @Test
    public void testListSet(){
        String index0Element = list.set(0, "修改0索引");
        System.out.println("被修改的0号元素："+index0Element);
        System.out.println(list);
    }

    /**
     * 根据指定范围索引截取集合元素，包含开头索引，不包含结束索引
     * @see List#subList(int, int)
     */
    @Test
    public void testListSub(){
        List<String> subList = list.subList(2, 5);
        System.out.println(subList);
    }

    /**
     * List的遍历方法：
     * 1、Iterator：快捷键 itit
     * 2、增强for循环
     * 3、for循环：快捷键 .fori
     */
    @Test
    public void  testListIterator(){
        //第一中遍历方法
        System.out.println("第一种方式：");
        Iterator<Cellphone> iterator = cellphone.iterator();
        while (iterator.hasNext()) {
            Cellphone next = iterator.next();
            System.out.println(next);
        }

        System.out.println("第二种方式：");
        for (Cellphone next : cellphone) {
            System.out.println(next);
        }

        System.out.println("第三种方式：");
        for (int i = 0; i < cellphone.size(); i++) {
            System.out.println(cellphone.get(i));
        }
    }

    /**
     * List 排序方法 升序/降序
     * sort() new Comparator
     */
    @Test
    public void testListSortAscDesc(){
        System.out.println("根据价格升序排序:");
        cellphone.sort(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone cellphone1, Cellphone cellphone2) {
                return cellphone1.getPrice() - cellphone2.getPrice();
            }
        });

        for (Cellphone next : cellphone) {
            System.out.println(next);
        }

        System.out.println("根据价格降序排序:");
        cellphone.sort(new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone o1, Cellphone o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        for (Cellphone next : cellphone) {
            System.out.println(next);
        }
    }
}
