package com.effectivejava.examples.utilty;

/*
AssertionError zorunlu değildir ancak kötü niyetli bir yazlım reflection kullanarak
private metotlara erişmek isterse yada kurucu metot sınıfın içinden yanlışlıkla
çağrılırsa AssertionError nesne yaratılmasına engel olur.

 */
public class UtilityClass {

    private UtilityClass() {
        throw new AssertionError();
    }
}
