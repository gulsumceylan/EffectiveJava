package com.effectivejava.examples.primitive_wrapper;

/*
İlkel Türler Ne Zaman Kullanılır?
-Çok miktarda hesaplama yaparken, ilkel türler her zaman daha hızlıdır - çok daha az ek yükü vardır.
-Değişkenin ya da varsayılan değerin boş olmasını istemediğinizde.
-Yöntemin bir değer döndürmesi gerekiyorsa

Wrapper Sınıfı Ne Zaman Kullanılır?
-Koleksiyonlar veya Jenerikler kullanırken — bu gereklidir
-Bir türün MIN_SIZE veya MAX_SIZE boyutunu istiyorsanız.
-Değişkenin boş olmasını istediğinizde.
-Varsayılan değerin null olmasını istediğinizde.
-Bazen yöntem boş bir değer döndürebilirse.


!Genel olarak, sarmalayıcı sınıf kullanmak gerekmedikçe sarmalayıcı sınıflar yerine ilkel türleri seçin.
İlkel Türler asla Sarmalayıcı Nesnelerden daha yavaş olmayacaktır, ancak Sarmalayıcı Nesnelerin boş olma avantajı vardır.
 */
public class Toplam {

    public static void main(String[] args) {
        Long sum=0L;  //long yani primitive tip yaparsak daha hızlı çalışır!

        for(long i=0; i < Integer.MAX_VALUE; i++){
            sum+=i;  // new Long(i); Wrapper olduğunda burda Long sınıfı her seferinde gizli bir şekilde oluşturuluyor.Performans kaybı!

        }

        System.out.println(sum);
    }

}
