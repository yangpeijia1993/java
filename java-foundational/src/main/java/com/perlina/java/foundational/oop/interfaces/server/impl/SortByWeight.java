package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.Cellphone;
import com.perlina.java.foundational.oop.interfaces.server.Comparator;

/**
 * 根据手机重量排序
 *
 * @author: Perlina
 * @version:2021/8/2610:12 上午
 */
public class SortByWeight implements Comparator<Cellphone> {
    @Override
    public int compare(Cellphone source, Cellphone target) {
        return source.getWeight() - target.getWeight();
    }
}
