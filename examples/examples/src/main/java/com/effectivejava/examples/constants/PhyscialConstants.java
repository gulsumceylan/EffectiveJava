package com.effectivejava.examples.constants;

//Sabitleri tanımlamak için en doğru yöntem enumlardır.

public enum PhyscialConstants {
    AVOGADROS_NUMBER(6.02214199e23),
    BOLTZMANN_CONSTANT(1.3806503e-23),
    ELECTRON_MASS(9.10938188e-31);

    double value;

    PhyscialConstants(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(PhyscialConstants.BOLTZMANN_CONSTANT.getValue());
    }
}
