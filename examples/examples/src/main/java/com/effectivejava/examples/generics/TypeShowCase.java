package com.effectivejava.examples.generics;

/*
Genericsin çıkış amaçlarından en önemlisi hatayı çalışma anından derleme anına çekmektir!
 */

import java.util.ArrayList;
import java.util.List;

class Arac{}
class Araba extends Arac{}
class SporAraba extends Araba{}
class AileArabasi extends Araba{}

public class TypeShowCase {

    List<? extends Arac> aracListesi;   //aractan türeyen her şeyi kapsar
    List<? super Araba> arabaListesi;   //arabanın atalarını kapsar

    {
        aracListesi = new ArrayList<Araba>();
        aracListesi = new ArrayList<SporAraba>();
        aracListesi = new ArrayList<AileArabasi>();

        arabaListesi = new ArrayList<Arac>();
        arabaListesi = new ArrayList<Araba>();
        //arabaListesi = new ArrayList<AileArabasi>();
    }

    public void someMethod(List<? extends Araba> lb){
        Araba araba=lb.get(0);
      //  lb.add(new Araba()); //daha spesifik bir şey atanabilir bu yüzden tutarsızlık oluşur ve hata verir.

        //SporAraba sporAraba=new Araba(); //Daha gelişmiş bir obje daha ilkel bir objeye bağlanamaz(Liskov Substitution)
    }

    public void otherMethod(List<? super Araba> lb){
       // Araba araba=lb.get(0); //Araçta gelebilir araba da gelebilir.
       //Araba araba1= new Arac();

        lb.add(new Araba());
       // lb.add(new Arac());
    }
}
