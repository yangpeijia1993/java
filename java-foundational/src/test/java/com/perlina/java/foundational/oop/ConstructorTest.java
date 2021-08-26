package com.perlina.java.foundational.oop;

/**
 * 构造方法测试
 *
 * @author: Perlina
 * @version:2021/8/2411:15 PM
 */
public class ConstructorTest {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        System.out.println(phone.model+"\t"+phone.brand+"\t"+phone.color+"\t"+phone.price);

        CellPhone phone1 = new CellPhone("iphone12");
        System.out.println(phone1.model+"\t"+phone1.brand+"\t"+phone1.color+"\t"+phone1.price);

        CellPhone phone2 = new CellPhone("华为","mate40",6999,"黑色");
        System.out.println(phone2.model+"\t"+phone2.brand+"\t"+phone2.color+"\t"+phone2.price);
    }
}
