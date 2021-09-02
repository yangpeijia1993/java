package com.perlina.java.api.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机数工具
 *
 * @author: Perlina
 * @version:2021/8/265:26 下午
 */
public class RandomUtils {
    private static final String SPECIAL_CHARS = "@#$%^&*!";

    private static Random random(){
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        return threadLocalRandom;
    }
    /**
     * 随机生成一个4位或6位的验证码
     * @return 返回这个验证码
     */
    public static String verificationCode(int length){
        char[] verify = new char[length];
        if (length==4 || length ==6){
            for (int i = 0; i < length; i++) {
                //产生0-9的随机字符
                verify[i] = (char)('0'+random().nextInt(10));
            }
        }else{
            throw new RuntimeException("验证码长度不合理");
        }
        return new String(verify);
    }

    /**
     * 生成一个随机6-16的密码，由大小写，数字，特殊字符
     * @param lenght
     * @return
     */
    public static String randomPassword(int lenght){
        char[] password = new char[lenght];

        if (lenght >=6 && lenght<=16){
            for (int i = 0; i <lenght ; i++) {
                password[i] = nextChar(random());
            }
        }else {
            throw new RuntimeException("密码长度不符合6-16位");
        }
        return new String(password);
    }

    /**
     * 随机生成一个指定长度的int类型的 int范围内的数组
     * @param length
     * @return
     */
    public static int[] randomIntArray(int length){
        int[] number = new int[length];
        for (int i = 0; i < length; i++) {
            number[i] = random().nextInt();;
        }
        return number;
    }

    /**
     * 生成一个指定长度，指定随机数范围的整数数组
     * @param length
     * @param bound
     * @return
     */
    public static int[] randomIntArray(int length, int bound){
        int[] number = new int[length];
        for (int i = 0; i < length; i++) {
            number[i] = random().nextInt(bound);;
        }
        return number;
    }

    /**
     * 生成一个随机类型的字符：
     *          大写字母
     *          小写字母
     *          数字
     *          特殊字符
     * @param random
     * @return
     */
    private static char nextChar(Random random){
        switch (random.nextInt(4)){
            case 0:
                return (char)('a'+random.nextInt(26));
            case 1:
                return (char)('A'+random.nextInt(26));
            case 2:
                return (char)('0'+random.nextInt(10));
            default:
                return SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length()));
        }
    }
}
