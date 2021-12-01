package com.effectivejava.examples.doble;

import java.math.BigDecimal;

//Para işlerinde double yerine BigDecimal kullanmalısın!
//BigDecimal immutabledir(değiştirilemez) Her seferinde yeniden oluşturmalısın
public class Candy {

    public static void main(String[] args) {

        System.out.println(1.8-0.83); //doubleın düzgün çalılmadığını görüyoruz!

        /*
        double para=1.00;
        int alinansekersayisi=0;
        for (double fiyat=0.10; para>=fiyat; fiyat+=0.10){
            para-=fiyat;
            alinansekersayisi++;
        }
         */

        //BigDecimal String tanımlanır ya da valueOf ile tanımlayabilirsin
        BigDecimal para = BigDecimal.valueOf(1.00);
        int alinansekersayisi=0;
        for (BigDecimal fiyat= new BigDecimal("0.10"); para.compareTo(fiyat)>=0; fiyat = fiyat.add(new BigDecimal("0.10"))){
            para=para.subtract(fiyat);
            alinansekersayisi++;
        }

        System.out.println(alinansekersayisi +" seker alındı");
        System.out.println("Para üstü: " + para);

    }
}
