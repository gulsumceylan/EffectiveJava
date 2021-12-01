package com.effectivejava.examples.solid;

public class Ucgen extends Sekil{
    double taban;
    double yükseklik;

    public Ucgen(double taban, double yükseklik) {
        this.taban = taban;
        this.yükseklik = yükseklik;
    }

    @Override
    double calculateArea() {
        return (taban * yükseklik) / 2;
    }
}
