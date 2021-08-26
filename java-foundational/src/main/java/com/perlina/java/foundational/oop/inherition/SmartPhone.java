package com.perlina.java.foundational.oop.inherition;


import java.util.Objects;

/**
 * 智能机 继承
 *
 * @author: Perlina
 * @version:2021/8/2511:17 AM
 */
public class SmartPhone extends CellPhone {
    /**
     * 无限充电
     */
    private boolean charging;

    public boolean isCharging() {
        return charging;
    }

    public void setCharging(boolean charging) {
        this.charging = charging;
    }

    public SmartPhone(){

    }

    public SmartPhone(String model){
        super(model);
    }

    /**
     * 自己的刷抖音方法
     * @param model
     */
    public void getVedio(String model){
        System.out.println(model+"正在刷抖音");
    }

    /**
     * 子类完全重写发微信方法
     * @param number
     * @param content
     */
    @Override
    public void sendMessage(long number, String content) {
        System.out.println("给"+number+"发微信："+content);
    }

    /**
     * 重写call方法，新增部分方法
     * @param number
     */
    @Override
    public void call(long number) {
        super.call(number);
        System.out.println("打完电话在等5分钟");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
            "手机型号"+super.getModel()+
            "是否支持无线充电=" + charging +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        //判断对象的地址是否一致
        if (this == o) return true;
        //非空 || 判断是否同类型
        if (o == null || getClass() != o.getClass()) return false;
        //内容
        SmartPhone phone = (SmartPhone) o;//向下转型
        return charging == phone.charging && this.getModel().equals(phone.getModel());

    }

    @Override
    public int hashCode() {

        return Objects.hash(charging);
    }
}
