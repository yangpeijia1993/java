package com.perlina.java.foundational.oop.inherition;

/**
 * Object类测试
 *
 * @author: Perlina
 * @version:2021/8/2512:08 PM
 */
public class ObjectTest {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.setCharging(true);
        System.out.println(phone.toString());

        SmartPhone phone1 = new SmartPhone("huawei");
        System.out.println(phone1.toString());
    }
}
