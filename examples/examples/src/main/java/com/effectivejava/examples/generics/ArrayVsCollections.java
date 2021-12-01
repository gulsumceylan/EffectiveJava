package com.effectivejava.examples.generics;

import java.util.ArrayList;
import java.util.List;

/*
Dizilerle generic kullanılamaz!Bu yüzden arrayler yerine collectionları kullanmak daha iyidir.Derleme anında hataları yakalamamızı sağlar.
 */
public class ArrayVsCollections {

    public static void main(String[] args) {
        Object[] objectArray = new Long[1];
        //objectArray[0]="Selam";                //derleme anında hata vermedi!

        List<Long> objectList = new ArrayList<Long>();
        //objectList.add("Selam");                //derlemem anında hatayı gösterir!
    }
}
