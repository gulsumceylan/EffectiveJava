package com.effectivejava.examples.optional;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/*
Optional
NullPointerException hatası Java geliştiriciler için can sıkıcı olabiliyor.
Sürekli ‘if’ yapıları ile kontrol yapmadan daha okunabilir ve kolay yönetilebilir kodlar yazabiliriz.

Try-catchten kurtuluyoruz.Ve değerleri de istediğimiz gibi yönetme şansına sahip oluyoruz nullsa ya da boşsa şunu dön gibi.(.orElse())

!!! Ancak çok fazla istek alan çağırılan bir methodsa Optional kullanmamalıyız.Az da olsa performans kaybına yol açabilir!
 */

public class OptionalAramaTarama {
    public static Optional<Integer> max(List<Integer> collection){

        if (collection == null || collection.size()== 0) {
            return Optional.empty();
        }

        return Optional.of(Collections.max(collection));
    }

    public static void main(String[] args) {
            List<Integer> liste = null;  //Arrays.asList(10,20,100,30);
            Optional<Integer> enBuyuk=max(liste);
            System.out.println("sonuc: " + enBuyuk.orElse(0));
                                                 //.orElseThrow(RuntimeException::new)
                                                 //.get()
    }
}
