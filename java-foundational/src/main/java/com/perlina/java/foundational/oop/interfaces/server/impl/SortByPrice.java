package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.Cellphone;
import com.perlina.java.foundational.oop.interfaces.server.Comparator;

/**
 * 价格排序
 *
 * @author: Perlina
 * @version:2021/8/2610:07 上午
 */
public class SortByPrice implements Comparator<Cellphone> {
    @Override
    public int compare(Cellphone source, Cellphone target) {
        return source.getPrice()-target.getPrice();
    }
}
