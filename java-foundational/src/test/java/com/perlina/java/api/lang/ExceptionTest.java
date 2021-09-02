package com.perlina.java.api.lang;

import org.testng.annotations.Test;

/**
 * 异常
 *
 * @author: Perlina
 * @version:2021/8/319:49 下午
 */
public class ExceptionTest {

    /**
     * java.lang.ArithmeticException
     * 算数异常
     */
    @Test
    public void testCreateArithmeticException(){
        System.out.println(1/0);
    }
}
