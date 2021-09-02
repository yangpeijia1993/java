package com.perlina.java.api.util;

import com.perlina.java.api.utils.RandomUtils;
import org.testng.annotations.Test;

/**
 * Random工具类的测试用了
 * @author: Perlina
 * @version:2021/8/265:34 下午
 */
public class RandomUtilsTest {

    @Test
    public void testVerificationCodeTest(){
        for (int i = 0; i < 10; i++) {
            System.out.println(RandomUtils.verificationCode(6));
        }
    }

    @Test
    public void testRandomPasswordTest(){
        for (int i = 6; i <= 16 ; i++) {
            System.out.println(RandomUtils.randomPassword(i));
        }
    }
}
