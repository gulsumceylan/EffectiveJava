package com.effectivejava.examples.erisimKısıtlayıcı;

public class Point {
    private final double x;   //final ile x ve y ye sadece yapılandırıcı içinde değer verilebilir.Kontrolümüzün dışında değiştirilemez.Bir kere değer atanır.
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Private yapmamızın nedeni dışardan erişilmesini engellemek ama setter koyarsak kendimizle çelişiriz.

}
