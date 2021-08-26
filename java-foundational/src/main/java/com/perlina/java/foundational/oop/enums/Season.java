package com.perlina.java.foundational.oop.enums;

/**
 * 季节的枚举
 *
 * @author: Perlina
 * @version:2021/8/262:48 下午
 */
public enum Season {
    SPRING("春天"),SUMMER("夏天"),AUTUMN("秋天"),WINTER("冬天");

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //    Season() {
//        System.out.println("枚举的实例被初始化类");
//    }
    Season(String discription){
        this.description = discription;
    }

    public static Season getSeasonDiscription(String discription){
        for (Season value : Season.values()) {
            if (discription.equals(value.getDescription())){
                return value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "季节{" +
            "季节描述='" + description + '\'' +
            '}';
    }
}
