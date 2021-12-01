package com.effectivejava.examples.nullCont;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//null döndürmeyin!
public class PeynirFabrikasi {
    private static final List<Peynir> stok = new ArrayList<Peynir>();

   // static {stok.add(Peynir.EZINE);}

    public static List<Peynir> peynirleriGetir(){
        if (stok.isEmpty()) {
            //return null;  çift taraflı bir null kontrolü yapmak zorunda kalırız ve kodun okunurluğunu düşürür.[aşağıda if (peynirList != null &&....]
            return Collections.emptyList();
        }
        return stok;
    }


    public static void main(String[] args) {
        List<Peynir> peynirList = PeynirFabrikasi.peynirleriGetir();
        if (peynirList.contains(Peynir.EZINE)){
            System.out.println("Peynir budur");
        }
    }
}
