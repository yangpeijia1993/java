package com.perlina.java.foundational.oop.interfaces.server;

/**
 * 比较器
 *
 * @author: Perlina
 * @version:2021/8/2610:05 上午
 */
public interface Comparator<T> {

    /**
     * 如果 source > target return 1
     * 如果 source < target return -1
     * 如果 source = target return 0
     * @param source
     * @param target
     * @return
     */
    int compare(T source,T target);
}
