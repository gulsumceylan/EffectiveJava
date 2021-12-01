package com.effectivejava.examples.varArgs;

public class Varargs {

    static  int sum(int... args){ //diziye istediğin kadar parametre gönderebilirisin demek. Limit belirlemiyoruz.
        int sum=0;
        for (int arg:args){
            sum+=arg;
        }
        return sum;
    }

    static  int min(int first,int... args){ //Dizi boşsa çalışma anında hata alabilmek için bir ilk değer isteyebiliriz!
        int min=first;
        for (int i=0; i<args.length; i++)
            if (args[i]<min)
                min = args[i];
        return min;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9));
        System.out.println(min(7,2,3,4,5,6,7,8,9));
    }
}
