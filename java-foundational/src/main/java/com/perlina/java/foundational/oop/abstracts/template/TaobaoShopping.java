package com.perlina.java.foundational.oop.abstracts.template;

/**
 * 淘宝购物
 *
 * @author: Perlina
 * @version:2021/8/253:37 PM
 */
public class TaobaoShopping extends ShoppingTemplate {

    @Override
    protected void register() {
        System.out.println("注册淘宝账号");
        super.realName();
    }

    @Override
    protected void login() {
        System.out.println("登陆淘宝账户");
    }

    @Override
    protected void search() {
        System.out.println("淘宝页面搜索商品");
    }

    @Override
    protected void addCart() {
        System.out.println("添加到淘宝购物车");
    }

    @Override
    protected void pay() {
        System.out.println("使用支付宝进行结算");
    }

    @Override
    protected void commitOrder() {
        System.out.println("提交淘宝订单");
    }
}
