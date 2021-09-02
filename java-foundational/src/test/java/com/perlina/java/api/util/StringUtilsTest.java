package com.perlina.java.api.util;

import com.perlina.java.api.utils.StringUtils;
import org.testng.annotations.Test;

/**
 * 字符串工具类测试
 *
 * @author: Perlina
 * @version:2021/8/274:55 下午
 */
public class StringUtilsTest {

    /**
     * 字符串翻转测试
     */
    @Test
    public void testStringUtilsReverse(){
        String str = "shjsald";
        String reverse = StringUtils.reverse(str);
        System.out.println(str);
        System.out.println(reverse);
    }

    /**
     * 数组转字符串测试
     */
    @Test
    public void testArrayToString(){
        int[] number = {1,28,24,56,64};
        String string = StringUtils.arrayToString(number);
        System.out.println(string);
    }
}
