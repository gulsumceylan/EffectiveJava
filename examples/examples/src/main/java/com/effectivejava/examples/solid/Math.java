package com.effectivejava.examples.solid;

public class Math {

    public static void main(String[] args) {
        Dikdörtgen dikdörtgen=new Dikdörtgen(20,60);
        System.out.println(dikdörtgen.calculateArea());

        Ucgen ucgen=new Ucgen(60,20);
        System.out.println(ucgen.calculateArea());
    }
}
