package com.effectivejava.examples.solid;

public class Dikdörtgen extends Sekil{
    double length;
    double width;

    Dikdörtgen(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
