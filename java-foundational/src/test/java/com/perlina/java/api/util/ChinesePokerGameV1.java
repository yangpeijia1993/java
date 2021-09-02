package com.perlina.java.api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 斗地主案例
 *
 * @author: Perlina
 * @version:2021/8/309:12 下午
 */
public class ChinesePokerGameV1 {
    public static void main(String[] args) {
        //造牌
        List<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        System.out.println(poker);

        List<String> colors = Arrays.asList("♠️", "♥️", "♣️", "♦️");
        List<String> numbers = Arrays.asList("2", "A", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");

        for (int i = 0; i < colors.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                String pokerCard = colors.get(i)+numbers.get(j);
                poker.add(pokerCard);
            }
        }
//        System.out.println(poker.size());
//        System.out.println(poker);

        //洗牌
        Collections.shuffle(poker);

        //发牌
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> remain = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51){
                remain.add(poker.get(i));
            }else if(i%3 == 0){
                player1.add(poker.get(i));
            }else if(i%3 == 1){
                player2.add(poker.get(i));
            }else if(i%3 == 2){
                player3.add(poker.get(i));
            }
        }

        System.out.println(player1.size());
        System.out.println(player1);

        System.out.println(player2.size());
        System.out.println(player2);

        System.out.println(player3.size());
        System.out.println(player3);

        System.out.println(remain.size());

        //拿到的牌是无序的，需要升级程序
    }
}
