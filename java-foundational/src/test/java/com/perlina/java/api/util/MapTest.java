package com.perlina.java.api.util;

import com.perlina.java.foundational.oop.interfaces.server.Cellphone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Map集合常用方法测试
 *
 * @author: Perlina
 * @version:2021/8/303:43 下午
 */
public class MapTest {

    Map<String,String> map;

    @BeforeClass
    public void initLinkedHashMap(){
        map = new LinkedHashMap<>();
        map.put("湖南","长沙");
        map.put("湖北","武汉");
        map.put("广东","广州");
        map.put("四川","成都");
        System.out.println(map);
    }

    /**
     * Map集合添加元素
     */
    @Test
    public void testMapPut(){
        Map<String,String> map = new HashMap<>();
        map.put("湖南","长沙");
        map.put("湖北","武汉");
        map.put("广东","广州");
        map.put("四川","成都");
        System.out.println(map);

        Map<String,String> map1 = new HashMap<>();
        map1.put("湖南1","怀化");
        map1.put("湖北1","宜昌");
        map1.put("广东1","深圳");

        map.putAll(map1);
        System.out.println(map);
    }

    /**
     * Map集合删除指定元素
     */
    @Test
    public void testMapRemove(){
        String 湖南 = map.remove("湖南");
        System.out.println(map);
        System.out.println(湖南);
    }

    /**
     * Map集合替换指定元素
     */
    @Test
    public void testMapReplace(){
        map.replace("湖南","怀化");
        System.out.println(map);

        map.replace("湖南","怀化","湘潭");
        System.out.println(map);
    }

    /**
     * Map集合中是否包含指定的Key或Value
     */
    @Test
    public void testMapContainsKeyValue() {
        System.out.println(map.containsKey("湖南"));
        System.out.println(map.containsValue("怀化"));
    }

    /**
     * 获取Map集合所有的Key和Value
     */
    @Test
    public void testMapGetKeySetValue(){
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }

    /**
     * 获取Map集合所有的entrySet
     */
    @Test
    public void testMapEntrySet(){
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    /**
     * Map集合的遍历
     */
    @Test
    public void testMapTraversal(){
        //1.通过键获取值
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key+":"+map.get(key));
        }

        //2.entry遍历
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry);
        }
    }

    /**
     * 键唯一，由哈希表保证，根据业务场景重写equals和hashCode方法
     * 存取无序
     */
    @Test
    public void testHashMapFeature(){
        Map<Cellphone,String> cellphones = new HashMap<>();
        cellphones.put(new Cellphone("小米",10999,208),"xiaomi");
        cellphones.put(new Cellphone("oppo",6966,180),"oppo");
        cellphones.put(new Cellphone("apple",12999,300),"oppo");
        cellphones.put(new Cellphone("小米",10999,208),"xiaomi");

        for (Map.Entry<Cellphone, String> entry : cellphones.entrySet()) {
            System.out.println(entry);
        }
    }

    /**
     * 键唯一，由哈希表保证，根据业务场景重写equals和hashCode方法
     * 存取无序
     */
    @Test
    public void testLinkedHashMapFeature(){
        Map<Cellphone,String> cellphones = new LinkedHashMap<>();
        cellphones.put(new Cellphone("小米",10999,208),"xiaomi");
        cellphones.put(new Cellphone("oppo",6966,180),"oppo");
        cellphones.put(new Cellphone("apple",12999,300),"oppo");
        cellphones.put(new Cellphone("小米",10999,208),"xiaomi");

        for (Map.Entry<Cellphone, String> entry : cellphones.entrySet()) {
            System.out.println(entry);
        }
    }

    /**
     * 键唯一，由哈希表保证，根据业务场景重写equals和hashCode方法
     * 按默认规则排序
     */
    @Test
    public void testTreeMapFeature(){

    }

    /**
     * 键唯一，由哈希表保证，根据业务场景重写equals和hashCode方法
     * 按自定义方法规则排序
     */
    @Test
    public void testTreeMapCustomSort(){
        Map<Cellphone,String> cellphones = new TreeMap<>();
        cellphones.put(new Cellphone("小米",10999,208),"xiaomi");
        cellphones.put(new Cellphone("oppo",6966,180),"oppo");
        cellphones.put(new Cellphone("apple",12999,300),"oppo");
        cellphones.put(new Cellphone("小米",10999,208),"xiaomi");

        for (Map.Entry<Cellphone, String> entry : cellphones.entrySet()) {
            System.out.println(entry);
        }
    }
}
