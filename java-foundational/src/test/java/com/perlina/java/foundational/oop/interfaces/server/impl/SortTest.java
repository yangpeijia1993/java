package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.Cellphone;
import com.perlina.java.foundational.oop.interfaces.server.Comparator;

/**
 * 接口作为方法的形参对象数组排序
 *
 * @author: Perlina
 * @version:2021/8/269:51 上午
 */
public class SortTest {
    public static void main(String[] args) {
        Cellphone[] cellphones = {
            new Cellphone("华为","p40",6999,"黑色",115),
            new Cellphone("oppo","xx",3999,"黑色",220),
            new Cellphone("苹果","12pro",10999,"黑色",300)
        };

        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }

        //根据手机价格排序
        sortByComparator(cellphones,new SortByPrice());
        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }

        //根据手机重量排序
        sortByComparator(cellphones, new SortByWeight());
        for (Cellphone cellphone : cellphones) {
            System.out.println(cellphone);
        }
    }

    public static void sort(Cellphone[] cellphones){
        for (int i=0; i<cellphones.length-1;i++){
            for (int j=0; j< cellphones.length-1-i; j++){
                if (cellphones[j].getPrice() >cellphones[j+1].getPrice()){
                    Cellphone temp = cellphones[j+1];
                    cellphones[j+1] = cellphones[j];
                    cellphones[j] = temp;
                }
            }
        }
    }

    public static void sortByComparator(Cellphone[] cellphones, Comparator comparator){
        for (int i=0; i<cellphones.length-1;i++){
            for (int j=0; j< cellphones.length-1-i; j++){
                if (comparator.compare(cellphones[j],cellphones[j+1]) >0){
                    Cellphone temp = cellphones[j+1];
                    cellphones[j+1] = cellphones[j];
                    cellphones[j] = temp;
                }
            }
        }
    }
}
