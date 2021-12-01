package com.effectivejava.examples.singleton;

public class MethodPencil {
    private static final MethodPencil INSTANCE =new MethodPencil(); // static final olduğu için ilk değerini bir defa alıyor

    //bu objeyi dışardan çağırıp üretmezler, üretilen objenin birden fazla kopyasını alıp kullanabilirler bu metod ile.
    public static MethodPencil  getInstance() { // possible multi thread attaks
        return INSTANCE;
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) {
        MethodPencil pencil = MethodPencil.getInstance();
        MethodPencil pencil2 = MethodPencil.getInstance();

        System.out.println(pencil.hashCode());
        System.out.println(pencil2.hashCode());
        // method advantage : you can use it in lambda exp
        //Pencil::getInstance
    }
}
