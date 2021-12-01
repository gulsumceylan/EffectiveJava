package com.effectivejava.examples.generics;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
Generic kullanımıyla hataları derleme anında yakalayabiliriz.

 */
public class CoffeeShop {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        //tehlikeliEkleme(strings,new Integer(22)); //derleme anında hata almadık!
        //ekleme(strings,new Integer(22)); *derleme anında hata alınır!!
        genericEkleme(strings,"Ceylan");

        String s=strings.get(0);

    }

    private static void tehlikeliEkleme(List list,Object o){
        list.add(o);
    }

    private static void ekleme(List<String> list,String o){
        list.add(o);
    }

    private static<T> void genericEkleme(List<T> list,T o){ //listenin tipi neyse içine eklenecek nesnenin tipi de aynı olsunn
        list.add(o);
    }


    // Unbounded wildcard type - tip güvenligi var ve esnek
    //? herhangi bir nesne atamana izin vermez koruma kalkanıdır.ReadOnly hale getirir.Null atılabilir.
    static int sayWildCard(Set<?> s1,Set<?> s2){
        int result=0;
        for (Object o1:s1)
            if (s2.contains(o1))
                result++;
            return result;
    }
}
