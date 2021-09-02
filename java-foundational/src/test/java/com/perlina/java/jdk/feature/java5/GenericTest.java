package com.perlina.java.jdk.feature.java5;

import com.perlina.java.foundational.oop.interfaces.server.Cellphone;
import com.perlina.java.foundational.oop.polymorphism.Tiger;
import org.testng.annotations.Test;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的使用
 *
 * @author: Perlina
 * @version:2021/8/3010:57 下午
 */
public class GenericTest {

    /**
     * 不使用泛型带来的问题
     * 类型转换异常
     */
    @Test
    public void testListWithoutGeneric(){
        List list = new ArrayList();
        list.add("java");
        list.add(1);

        for (Object o : list) {
            String str = (String)o;//java.lang.ClassCastException
            System.out.println(str.length());
        }
    }

    /**
     * 使用泛型集合
     */
    @Test
    public void testListWithGeneric(){
        List<String> list = new ArrayList<>();
        list.add("java");
//        list.add(1);
    }

    @Test
    public void testGenericClassUsed(){
        FastArrayList<Cellphone> cellPhones = new FastArrayList<>();
        cellPhones.addElement(new Cellphone("小米",12999));
        System.out.println(cellPhones);

        FastArrayList<Tiger> tigers = new FastArrayList<>();
        tigers.addElement(new Tiger("胖胖"));
        System.out.println(tigers);
    }

    @Test
    public void testGenericInterfaceUsed(){
        FastList<String> list = new FastArrayList<>();

        list.add("hahha");
    }


    /**
     * 泛型方法
     * @param array
     * @param <T>
     * @return
     */
    public <T> List<T> getList(T[] array){
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    @Test
    public void testGenericMethodUsed(){
        String[] language = {"1","2","3"};
        getList(language);

        Integer [] number = {1,4,2};//包装类
        getList(number);
    }

    /**
     * 将数组拷贝到集合中
     * 使用泛型类型T
     */

    /**
     * 泛型通配符
     */
    @Test
    public void testGenericWildcardCharacter(){

    }

    /**
     * 泛型通配符上限
     */
    @Test
    public void testGenericWildcardCharacterUp(){

    }

    /**
     * 泛型通配符下限
     */
    @Test
    public void testGenericWildcardCharacterDown(){

    }
}
