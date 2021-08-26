package com.perlina.java.foundational.oop;

/**
 * final关键字测试
 *
 * @author: Perlina
 * @version:2021/8/255:20 PM
 */
public class FinalTest {
    public static void main(String[] args) {
        final int DEFAULT_VALUE =10;

        final Order order = new Order("0122");
        System.out.println(order.getOrderId());

        order.setOrderId("3312");
        System.out.println(order.getOrderId());
    }
}

class Order{

    private String orderId;

    public Order(){

    }

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
