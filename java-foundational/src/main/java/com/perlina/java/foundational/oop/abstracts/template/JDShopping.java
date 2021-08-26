package com.perlina.java.foundational.oop.abstracts.template;

/**
 * 京东购物
 *
 * @author: Perlina
 * @version:2021/8/253:41 PM
 */
public class JDShopping extends ShoppingTemplate {
    @Override
    protected void register() {
        System.out.println("注册京东账号");
        super.realName();
    }

    @Override
    protected void login() {
        System.out.println("欢迎登陆京东");
    }

    @Override
    protected void search() {
        System.out.println("搜索商品");
    }

    @Override
    protected void addCart() {
        System.out.println("添加到购物车");

    }

    @Override
    protected void pay() {
        System.out.println("使用京东支付");
    }

    @Override
    protected void commitOrder() {
        System.out.println("提交订单");
    }
}
