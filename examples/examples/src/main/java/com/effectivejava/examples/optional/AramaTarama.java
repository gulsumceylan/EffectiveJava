package com.effectivejava.examples.optional;

import java.util.Collections;
import java.util.List;

/*
Try-catch kullanarak hata fırlatabiliriz.
 */

public class AramaTarama {
    //Liste içerisindeki en büyük sayıyı bulunuz

    public static Integer max(List<Integer> collection){
        if (collection == null || collection.size()== 0) {
            throw new IllegalStateException("Liste boş");
        }

        return Collections.max(collection);
    }

    public static void main(String[] args) {
        try {
            List<Integer> liste = null;  //Arrays.asList(10,20,100,30);
            int enBuyuk=max(liste);
            System.out.println("sonuc: " + enBuyuk);
        }catch (Exception ex){
            //....
            System.err.println(""+ex.getMessage());
        }
    }
}
