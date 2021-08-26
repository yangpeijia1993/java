package com.perlina.java.foundational.oop.abstracts.template;

/**
 * 购物通用模版
 * @author: Perlina
 * @version:2021/8/253:31 PM
 */
public abstract class ShoppingTemplate {
    /**
     * 买东西
     */
    public void shopping(){
        register();
        login();
        search();
        addCart();
        commitOrder();
        pay();
    }

    /**
     * 注册
     */
    protected abstract void register();

    /**
     * 使命认证
     */
    protected void realName(){
        System.out.println("使命认证完成");
    }

    /**
     * 登陆
     */
    protected abstract void login();

    /**
     * 搜索商品
     */
    protected abstract void search();

    /**
     * 添加购物车
     */
    protected abstract void addCart();

    /**
     * 支付
     */
    protected abstract void pay();

    /**
     * 提交订单
     */
    protected abstract void commitOrder();



}
