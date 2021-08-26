package com.perlina.java.foundational.oop;

/**
 * 手机
 *
 * @author: Perlina
 * @version:2021/8/249:37 PM
 */
public class CellPhone {
    /**
     * 手机品牌
     */
    String brand;

    /**
     * 手机型号
     */
    String model;

    /**
     * 手机价格
     */
    Integer price;

    /**
     * 手机颜色
     */
    String color;

    /**
     * 手机质量
     */
    private Integer weight;

    /**
     * 获得手机的中量
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 无参构造器
     */
    public CellPhone(){
//        System.out.println("Cellphone的无参构造器");
    }

    /**
     * 一个参数的构造器
     * @param model
     */
    public CellPhone(String model){
        this.model = model;
    }

    /**
     * 全参构造器
     * @param brand
     * @param model
     * @param price
     * @param color
     */
    public CellPhone(String brand, String model, Integer price, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    /**
     * 给指定用户打电话
     * @param number
     */
    public void call(long number){
        System.out.println("正在给"+number+"打电话");
    }

    public void sendMessage(long number,String content){
        System.out.println("正在给"+number+"发送短信，内容是："+content);
    }
}
