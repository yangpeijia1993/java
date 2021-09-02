package com.perlina.java.api.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

/**
 * Objects类测试
 *
 * @author: Perlina
 * @version:2021/8/264:10 下午
 */
public class ObjectsTest {

    /**
     * 测试普通的equals方法，会出现空指针报错
     * @see String#equals(Object)
     */
    @Test
    public void testStringEquals(){
        String str1 = null;
        String str2 = "123";
        System.out.println(str1.equals(str2));
    }

    /**
     * 测试Objects类的equals()方法，体会空指针时如何操作
     * @see java.util.Objects#equals(Object, Object)
     */
    @Test
    public void testObjectsEquals(){
        String str1 = null;
        String str2 = "123";
        boolean equals = Objects.equals(str1, str2);
        Assert.assertEquals(equals,false);

    }

    /**
     * 测试Objects类的nonNull方法
     * @see java.util.Objects#nonNull(Object)
     */
    @Test
    public void testNotNull(){
        String str = "";
        Assert.assertEquals(Objects.nonNull(str),true);

        String stra = null;
        Assert.assertEquals(Objects.nonNull(stra),false);
    }

    /**
     * 测试Objects类的requireNonNull方法
     * @see java.util.Objects#requireNonNull(Object)
     */
    @Test
    public void testRequireNonNull(){
        String str = "123";
        //传递的值存在，返回这个值
        String result = Objects.requireNonNull(str);
        System.out.println(result);

        str = null;
        //当传递的值为null时，会抛空指针异常
        Objects.requireNonNull(str);
    }
}
