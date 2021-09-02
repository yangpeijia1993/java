package com.perlina.java.api.util;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Random类测试
 *
 * @author: Perlina
 * @version:2021/8/265:13 下午
 */
public class RandomTest {

    @Test
    public void testRandom(){
        //Int范围内的数
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt() + "\t");
        }
    }

    @Test
    public void testRandomSeed(){
        //指定种子数，无论多少次都是种子数
        Random random = new Random(88);
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt()+"\t");
        }
    }

    @Test
    public void testRandomBound(){
        //指定范围的随机数
        Random random = new Random();
        for (int i = 0; i < 30 ; i++) {
            //[0-30)
            System.out.print(random.nextInt(30) + " ");
        }
    }

    @Test
    public void testThreadLocalRandom(){
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            System.out.print(threadLocalRandom.nextDouble(100.0) + " ");
        }
    }

}
