package com.effectivejava.examples.override;

/*
Metodlara @override anotasyonu koymadan kullanırsan olası hataları görememzsin
mesela burda static metodlar ezilemez ama anatosyon olmadan hata alacağını görememzsin!
 */
class Soda{
    //static vardı hepsinin başında
     String markaBildir(){
        return "soda";
    }
}

class SparklinkSoda extends Soda{
    @Override
     String markaBildir(){
        return "Sparklink soda";
    }
}

class UludagGazoz extends SparklinkSoda{
    @Override
     String markaBildir(){
        return "Gazoz olma efsane ol";
    }
}



public class Overriding {
    public static void main(String[] args) {
        Soda[] sodas= {new Soda(),new SparklinkSoda(),new UludagGazoz()};
        for (Soda soda: sodas){
            System.out.println(soda.markaBildir());
        }
    }
}
