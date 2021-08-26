package com.perlina.java.foundational.oop.abstracts.template.shopping;

import com.perlina.java.foundational.oop.abstracts.template.JDShopping;
import com.perlina.java.foundational.oop.abstracts.template.ShoppingTemplate;
import com.perlina.java.foundational.oop.abstracts.template.TaobaoShopping;

/**
 * 模版方法测试
 *
 * @author: Perlina
 * @version:2021/8/253:43 PM
 */
public class ShoppingTemplateTest {
    public static void main(String[] args) {
        ShoppingTemplate taobao = new TaobaoShopping();
        taobao.shopping();

        ShoppingTemplate jd = new JDShopping();
        jd.shopping();
    }
}
