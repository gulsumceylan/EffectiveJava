package com.effectivejava.examples.utilty;

/*
Utility sınıfı birden fazla sınıfın kullanabileceği ortak metotlar tanımlayan sınıftır.
Bunun en güzel örneği java.lang.math sınıfıdır. Bu sınıf içinde her sınıfın kullanabileceği ortak matematiksel metotlar tanımlanmıştır.
Sadece utility metotları barındıran sınıfların nesnesini yaratmak bir anlam ifade etmez.
Bu sınıfların state’i yoktur, yani sınıfta tanımlı değişkenler yoktur, sadece metotlar vardır.
Bu metotlarda utility sınıfı altında gruplanmış işlemlerdir ve ait oldukları sınıfın nesnesi için değil,
kendini çağıran sınıfın nesnesi için bir görevi yerine getirirler.

 */
public class KitapUtilty {

    //Eğer bir utility sınıfı yazarsak bu sınıfın bir nesnesinin yaratılmasını engellemek için sınıfın içinde boş bir private kurucu metot yazabiliriz.
    //Bu sayede sınıfın kurucu metodu dışarıdan görülemez, böylece sınıfın bir nesnesi yaratılamaz.
    private KitapUtilty(){
     throw new IllegalStateException("Yapılandırıcı çağırılamaz");
    }

    public static int sayfaSayisiOgren(String kitapAdı){
        return 300;
    }

    public static String yazarIsmıOgren(String kitapAdı){
        return "Deneme";
    }

    //Class içinden çağırılmasını engellmemiz gerekir
    public static void main(String[] args) {
        // KitapUtilty utilty=new KitapUtilty();   // throw exceptionla hata gönderdik.Bu şekilde kullanım yasak.
        KitapUtilty.yazarIsmıOgren("Abc");
    }
}
