package com.effectivejava.examples.singleton;


/* Singleton’ı şu iki maddede özetleyebiliriz.
1) Bir sınıfın bir örneği olacağını garanti eder.
2) Bu sınıfı global bir erişim noktası yapar.

-Bir ortamda(contexte) ancak ve ancak tek bir obje(instance) olmalı
 */
public class Pencil {



    public void write() {
        System.out.println("Writing!");
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) {
        Pencil pencil = new Pencil();
        pencil = new Pencil();  // always new object is created, not good
        pencil = new Pencil();  // always new object is created, not good
        // iki kere newlememeliyiz! Her bir new anahtar kelimesi bellekte bir yer alınması anlamına gelir.
        pencil.write();
    }
}
