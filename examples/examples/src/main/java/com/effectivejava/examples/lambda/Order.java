package com.effectivejava.examples.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Order {

    static List<String> words = Arrays.asList("Merhaba", "Dünya");

    public static void main(String[] args) {
        //1.Yöntem
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(),s2.length());
            }
        });
        System.out.println(words);

        //2.Yöntem
        Collections.sort(words,(s1,s2) -> Integer.compare(s1.length(),s2.length()));
        System.out.println(words);

        //3.Yöntem
        Collections.sort(words,Comparator.comparingInt(String::length));
        System.out.println(words);

        //4.Yöntem
        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);
    }

}
