package com.effectivejava.examples.generics;

import java.util.HashSet;
import java.util.Set;

public class ParkInn {
                                       //Set<E> s1, Set<E> s2
    public static <E> Set<E> birlestir(Set<? extends E> s1, Set<? extends E> s2) { //E'den türeyen herhangi bir şey anlamına gelir.
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    // Simple program to exercise flexible generic method
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<Integer>();
        integers.add(1);
        integers.add(3);
        integers.add(5);

        Set<Double> doubles = new HashSet<Double>();
        doubles.add(2.0);
        doubles.add(4.0);
        doubles.add(6.0);

        Set<Number> numbers = ParkInn.<Number>birlestir(integers, doubles); //double da integer da Numberdan türediği için hata vermez
        System.out.println(numbers);
    }
}
