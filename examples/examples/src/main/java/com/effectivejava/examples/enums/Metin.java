package com.effectivejava.examples.enums;


import java.util.EnumSet;
import java.util.Set;


//EnumSet!!

public class Metin {
    /* enum yapısına dönüştür
    public static final int BOLD = 1 ;
    public static final int ITALIC = 2 ;
    public static final int UNDERLINE = 3;
    public static final int STRIKETHROUGH = 4;
    */

    public enum Stiller{
        BOLD,ITALIC,UNDERLINE,STRIKETHROUGH
    }

    public void secilenStiliUygula(Set<Stiller> stiller) { //birden fazla still gönderebilmek istiyoruz ama aynı ifadeyi iki kere göndermek istemiyoruz
        // Body goes here
    }


    public static void main(String[] args) {
        Metin metin = new Metin();
       // metin.secilenStiliUygula(BOLD);

        metin.secilenStiliUygula((EnumSet.of(Stiller.BOLD,Stiller.BOLD,Stiller.ITALIC))); //yanlışlıkla iki kere göndersek bile hata vermez
    }
}
