package com.perlina.java.foundational.oop.inherition;

/**
 * 手机
 *
 * @author: Perlina
 * @version:2021/8/249:37 PM
 */
public class CellPhone extends Product{
    /**
     * 手机品牌
     */
    private String brand;

    /**
     * 获得手机品牌
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置手机品牌
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 手机型号
     */
    private String model;

    /**
     * 获得手机型号
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置手机型号
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 手机价格
     */
    private Integer price;

    /**
     * 获得手机的价格
     * @return
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置手机的价格
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 手机颜色
     */
    private String color;

    /**
     * 获得手机的颜色
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置颜色
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 手机质量
     */
    private Integer weight;

    /**
     * 获得手机的重量
     * @return
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置重量
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 无参构造器
     */
    public CellPhone(){
        System.out.println("Cellphone的无参构造器"+this);
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
        System.out.println(this.model+"正在给"+number+"打电话");
    }

    public void sendMessage(long number,String content){
        System.out.println("正在给"+number+"发送短信，内容是："+content);
    }
}
