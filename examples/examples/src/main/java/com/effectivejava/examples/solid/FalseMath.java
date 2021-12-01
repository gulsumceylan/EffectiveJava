package com.effectivejava.examples.solid;

//Bir sınıf içinde birden fazla iş yapmayın! Dikdörtgen ve çember için alan hesabı yapan sınıfımıza üçgen şeklini de eklemeye çalışıyoruz

public class FalseMath {

    enum Sekil{
        DIKDORTGEN,CEMBER,UCGEN
    };

    // Tag field - the sekil of this figure
    final Sekil sekil;

    // These fields are used only if sekil is DIKDORTGEN
    double length;
    double width;

    // This field is used only if sekil is CEMBER
    double radius;

    // This field is used only if sekil is UCGEN
    float yükseklik;
    float taban;

    // Constructor for circle
    FalseMath(double radius) {
        sekil = Sekil.CEMBER;
        this.radius = radius;
    }

    // Constructor for rectangle
    FalseMath(double length, double width) {
        sekil = Sekil.DIKDORTGEN;
        this.length = length;
        this.width = width;
    }

    // Constructor for üçgen
    FalseMath(float yükseklik, float taban) {
        sekil = Sekil.UCGEN;
        this.yükseklik = yükseklik;
        this.taban = taban;
    }

    double calculateArea() {
        switch (sekil) {
            case DIKDORTGEN:
                return length * width;
            case CEMBER:
                return java.lang.Math.PI * (radius * radius);
            case UCGEN:
                return (taban * yükseklik) / 2;
            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        FalseMath math=new FalseMath(3f,10f);
        System.out.println(math.calculateArea());
    }

}
