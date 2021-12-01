package com.effectivejava.examples.singleton;

//en iyi singleton yapma yöntemi enumlardır!

public enum EnumorationPencil {
    INSTANCE; // guarantee against multiple instantiation and thread safe for free

    public static void main(String[] args) {
        EnumorationPencil pencil = EnumorationPencil.INSTANCE;
        EnumorationPencil pencil2 = EnumorationPencil.INSTANCE;

        System.out.println(pencil.hashCode());
        System.out.println(pencil2.hashCode());
    }
}
