package com.perlina.java.foundational.oop;

/**
 * 对象的创建和使用
 *
 * @author: Perlina
 * @version:2021/8/249:44 PM
 */
public class CellPhoneTest {
    public static void main(String[] args) {
        CellPhone iPhone12 = new CellPhone();
        System.out.println(iPhone12.brand);//默认值null

        //给对象的成员变量赋值
        iPhone12.brand = "苹果";
        iPhone12.model = "iphone12";
        iPhone12.price = 6899;
        iPhone12.color = "银色";
        System.out.println("iPhone12的品牌是："+iPhone12.brand+
            "，iphone12的型号是："+iPhone12.model);

        iPhone12.call(13632991397L);
        iPhone12.sendMessage(13632991397L,"是个小宝宝");


    }
}
