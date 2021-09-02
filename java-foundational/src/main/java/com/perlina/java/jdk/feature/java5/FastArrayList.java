package com.perlina.java.jdk.feature.java5;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型类使用和定义
 *
 * @author: Perlina
 * @version:2021/8/3011:05 下午
 */
public class FastArrayList<E> extends ArrayList<E> implements FastList<E>{

    public boolean addElement(E e){
        return add(e);
    }

    public <T> List<T> getList(T[] array){
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
