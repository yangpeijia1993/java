package com.perlina.java.foundational.oop;

import com.perlina.java.foundational.oop.encapsulation.CellPhone;

/**
 * get和set方法Test
 *
 * @author: Perlina
 * @version:2021/8/2411:43 PM
 */
public class EncapsulationTest {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();

        phone.setBrand("huawei");
        System.out.println(phone.getBrand());

        phone.setBrand("pingguo");
        System.out.println(phone.getBrand());
    }
}
