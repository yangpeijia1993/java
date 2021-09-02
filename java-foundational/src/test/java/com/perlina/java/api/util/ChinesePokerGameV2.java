package com.perlina.java.api.util;

import java.util.*;

/**
 * 斗地主案例
 * 需要将牌从大到小排序
 *
 * @author: Perlina
 * @version:2021/8/309:12 下午
 */
public class ChinesePokerGameV2 {
    public static void main(String[] args) {
        Map<Integer,String> pokerMap = new HashMap<>();

        int pokerId = 0;
        pokerMap.put(pokerId++,"大王");
        pokerMap.put(pokerId++,"小王");

        List<String> colors = Arrays.asList("♠️", "♥️", "♣️", "♦️");
        List<String> numbers = Arrays.asList("2", "A", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
        for (String color : colors) {
            for (String number : numbers) {
                String card = color+number;
                pokerMap.put(pokerId++,card);
            }
        }

        //洗牌
        Set<Integer> pokerIndex = pokerMap.keySet();
        List<Integer> listId = new ArrayList<>(pokerIndex);
        Collections.shuffle(listId);
        List<Integer> player1Id =new ArrayList<>();
        List<Integer> player2Id =new ArrayList<>();
        List<Integer> player3Id =new ArrayList<>();
        List<Integer> remainId =new ArrayList<>();
        for (int i = 0; i < listId.size(); i++) {
            if (i>=51){
                remainId.add(listId.get(i));
            }else if (i%3 == 0){
                player1Id.add(listId.get(i));
            }
            else if (i%3 == 1){
                player2Id.add(listId.get(i));
            }
            else if (i%3 == 2){
                player3Id.add(listId.get(i));
            }
        }


        //发牌
        List<String> player1 =new ArrayList<>();
        List<String> player2 =new ArrayList<>();
        List<String> player3 =new ArrayList<>();
        List<String> remain =new ArrayList<>();
        for (Map.Entry<Integer, String> mapEntry : pokerMap.entrySet()) {
            if(player1Id.contains(mapEntry.getKey())){
                player1.add(mapEntry.getValue());
            }else if (player2Id.contains(mapEntry.getKey())){
                player2.add(mapEntry.getValue());
            }
            else if (player3Id.contains(mapEntry.getKey())){
                player3.add(mapEntry.getValue());
            }else if (remainId.contains(mapEntry.getKey())){
                remain.add(mapEntry.getValue());
            }
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(remain);
    }
}
