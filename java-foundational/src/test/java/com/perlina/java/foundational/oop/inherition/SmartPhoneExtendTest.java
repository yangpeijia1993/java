package com.perlina.java.foundational.oop.inherition;

import com.perlina.java.foundational.oop.inherition.SmartPhone;

/**
 * 继承的测试
 *
 * @author: Perlina
 * @version:2021/8/2511:18 AM
 */
public class SmartPhoneExtendTest {
    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone("huawei");

        System.out.println(iphone.getModel());
        iphone.call(13632991397L);
        iphone.getVedio("huawei2");
    }
}
