package com.perlina.java.api.util;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * List和Map集合的嵌套使用方法
 *
 * @author: Perlina
 * @version:2021/8/308:36 下午
 */
public class ListNestedMap {

    /**
     * List嵌套List
     */
    @Test
    public void testListNestedList(){
        List<String> asia = new ArrayList<>();
        asia.add("中国");
        asia.add("日本");
        asia.add("韩国");

        List<String> europe = new ArrayList<>();
        europe.add("德国");
        europe.add("意大利");

        List<List<String>> allCountry = new ArrayList<>();
        allCountry.add(asia);
        allCountry.add(europe);

        for (List<String> stringList : allCountry) {
            System.out.println(stringList);

            for (String country : stringList) {
                System.out.println(country);
            }
        }
    }

    /**
     * List嵌套Map
     */
    @Test
    public void testListNestedMap(){
        Map<String,String> asia = new HashMap<>();
        asia.put("China","beijing");
        asia.put("Japan","tokyo");
        asia.put("Korea","shoEr");
        Map<String,String> europe = new HashMap<>();
        europe.put("deGuo","boLin");
        europe.put("Italy","hah");

        List<Map<String,String>> allCountry = new ArrayList<>();
        allCountry.add(asia);
        allCountry.add(europe);

        for (Map<String, String> map : allCountry) {
            System.out.println(map);

            for (Map.Entry<String, String> country : map.entrySet()) {
                System.out.println(country);
                System.out.println(country.getKey()+":"+country.getValue());
            }
        }
    }

    /**
     * Map嵌套List
     */
    @Test
    public void testMapNestedList(){
        List<String> asia = new ArrayList<>();
        asia.add("中国");
        asia.add("日本");
        asia.add("韩国");

        List<String> europe = new ArrayList<>();
        europe.add("德国");
        europe.add("意大利");

        Map<String,List<String>> map = new HashMap<>();
        map.put("yaZhou",asia);
        map.put("ouZhou",europe);

        for (Map.Entry<String, List<String>> zhouEntry : map.entrySet()) {
            System.out.println(zhouEntry);
            System.out.println(zhouEntry.getKey()+":"+zhouEntry.getValue());
        }

    }

    /**
     * Map嵌套Map
     */
    @Test
    public void testMapNestedMap(){
        Map<String,String> asia = new HashMap<>();
        asia.put("China","beijing");
        asia.put("Japan","tokyo");
        asia.put("Korea","shoEr");

        Map<String,String> europe = new HashMap<>();
        europe.put("deGuo","boLin");
        europe.put("Italy","hah");

        Map<String,Map<String,String>> all = new HashMap<>();
        all.put("asia",asia);
        all.put("europe",europe);

        for (Map.Entry<String, Map<String, String>> zhouEntry : all.entrySet()) {
            System.out.println(zhouEntry);

            for (Map.Entry<String, String> countyEntry : zhouEntry.getValue().entrySet()) {
                System.out.println(countyEntry);
                System.out.println(zhouEntry.getKey()+":"+ countyEntry.getKey()+"-"+countyEntry.getValue());

            }
        }
    }
}
