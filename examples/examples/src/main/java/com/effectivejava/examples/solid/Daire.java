package com.effectivejava.examples.solid;

public class Daire extends Sekil{
    double radius;

    Daire(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return java.lang.Math.PI * (radius * radius);
    }
}
