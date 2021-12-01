package com.effectivejava.examples.primitive_wrapper;

public class Example2 {

    //static Integer i; // =null;  ---> Bir obje olduğu için primitiv bir tip olmadığı için nullpointerexception hatası alırız.
    //eğer bir nesne tipi kullanıyorsak bunun ilk değerini vermeyi unutmamamız lazım!

     static Integer i =new Integer(22); //ilk değeri verebiliriz. yada primitive tipi kullanmabiliriz.
    //static int i;

    public static void main(String[] args) {
        if (i == 22){
            System.out.println("İnanılmazzz...");
        }
    }
}
