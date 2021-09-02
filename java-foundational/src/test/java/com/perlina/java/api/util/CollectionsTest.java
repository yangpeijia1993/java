package com.perlina.java.api.util;

import com.perlina.java.foundational.oop.interfaces.server.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections类常用方法测试用例
 *
 * @author: Perlina
 * @version:2021/8/301:48 下午
 */
public class CollectionsTest {
    List<Integer> list = new ArrayList<>();
    List<Cellphone> cellphones = new ArrayList<>();

    @BeforeClass
    public void initCollectionsList(){
        list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,0);
        System.out.println(list);
    }

    @BeforeClass
    public void initCellphone(){
        cellphones.add(new Cellphone("xiaomi","M1",12999,"black",100));
        cellphones.add(new Cellphone("huawei","p8",12999,"black",103));
        cellphones.add(new Cellphone("oppo","x6",6966,"black",110));
        cellphones.add(new Cellphone("vivo","reno",9899,"black",85));
        printCellphoneList(cellphones);
    }

    /**
     * 打印Cellphone对象
     */
    public void printCellphoneList(List<Cellphone> cellphones){
        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }
    }

    /**
     * 向集合中添加多个元素
     */
    @Test
    public void testCollectionsAddAll(){
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6);
        System.out.println(list);
    }

    /**
     * 打乱集合元素顺序
     */
    @Test
    public void testCollectionsShuffle(){
        System.out.println("打乱之前list："+list);

        Collections.shuffle(list);
        System.out.println("打乱之后list："+list);
    }

    /**
     * 对集合的元素排序
     * 默认是升序，由集合元素所属的类实现类Comparator接口的compareTo方法
     * 可以使用重载方法，自己实现Compare方法
     */
    @Test
    public void testCollectionsSort(){
        System.out.println("打乱之前list："+list);

        Collections.shuffle(list);
        System.out.println("打乱之后list："+list);
        //默认升序
        Collections.sort(list);
        System.out.println("默认排序后："+list);

        //降序排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        //Lambda表达式
        Collections.sort(list,(o1, o2) -> o2-o1);
        System.out.println("降序排序后："+list);
    }

    /**
     * Cellphone多个条件排序
     * 1、按照价格降序排序
     * 2、按照价格升序排序，价格相同就按照重量排序
     */
    @Test
    public void testCollectionsSortCellphone(){
        //1、按照价格降序排序，在Cellphone中重写compareTo()
        Collections.sort(cellphones);
        System.out.println("降序排序后：");
        printCellphoneList(cellphones);

        //2、按照价格升序排序，价格相同就按照重量排序
        Collections.sort(cellphones, new Comparator<Cellphone>() {
            @Override
            public int compare(Cellphone o1, Cellphone o2) {
                if (o1.getPrice().equals(o2.getPrice())){
                    return o2.getWeight()-o1.getWeight();
                }
                return o1.getPrice()-o2.getPrice();
            }
        });
        System.out.println("价格相同，重量不同时：");
        printCellphoneList(cellphones);
    }

    /**
     * 查找集合中元素
     */
    @Test
    public void testCollectionsBinarySearch(){
        Collections.addAll(list,30,15,22,45,32,12,56,78,65,56,98,24,13);
        Collections.sort(list);
        System.out.println("list集合中的元素："+list);

        int target = 65;
        int targetIndex = Collections.binarySearch(list, target);
        System.out.println(targetIndex);
        if (targetIndex>=0){
            System.out.println(target+"元素的索引是："+targetIndex);
        }else {
            System.out.println("没有这个元素");
        }
    }
}
