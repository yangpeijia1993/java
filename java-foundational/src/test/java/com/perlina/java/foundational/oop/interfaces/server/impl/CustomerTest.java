package com.perlina.java.foundational.oop.interfaces.server.impl;

import com.perlina.java.foundational.oop.interfaces.server.Customer;

/**
 * 客户测试
 *
 * @author: Perlina
 * @version:2021/8/2611:01 上午
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(new InstallCallback());
        customer.downloadData("IDEA.exe");

        customer = new Customer(new OpenCallback());
        customer.downloadData("123.txt");
    }
}
