package com.effectivejava.examples.builder;

/*
Builder Tasarım Kalıbı
1)Çok fazla parametre alan objeniz varsa --->objeyi oluştururken constructor’ında bir çok “null” parametre geçmeye başladıysanız.
2)Farklı parametre kombinasyonlarına sahip birden çok constructorınız varsa(overloading)
3)Nesnenin oluşturulduktan sonra değişmez (immutable) olmasını istiyorsanız.

  *String, Boolean, Integer gibi bütün wrapper classlar immutable’dır. Immutable classlar bir kere oluşturulur ve değişmezler.
  Immutable nesneler ilk değerlerini constructur üzerinden alırlar ve bu değerde sabit kalırlar ve senkronize çalişmak zorunda kalmazlar.
  Bu da onların thread-safe olmasını sağlar.
  *Thread safe yapısı  :Thread safe birden çok thread’ın aynı metoda eriştiğinde problem çıkmaması anlamına gelir.
  --Aynı anda birden fazla işlem yapmayı sağlayan yapıya thread denir.Bu yapı sayesinde işlemler birbirlerini beklemeden kendi işlemini yapar.
 */
public class Serum {
    private final int water;
    private final int sodiumIon;
    private final int magnesium;
    private final int creatine;
    private final int globulin;
    private final int carbohydrate;

    public static class Builder{
        //Required parameters
        private final int water;
        private final int sodiumIon;

        //Optional parameters - initialized to default values
        private int magnesium = 0;
        private int creatine = 0;
        private int globulin = 0;
        private int carbohydrate = 0;

        public Builder(int water, int sodiumIon) {  //gerekli alanlar constructor içinde verilir.
            this.water = water;
            this.sodiumIon = sodiumIon;
        }

        public Builder magnesium(int val){       //opsiyonel alanlar bu şekilde verilir.
            magnesium=val;
            return this;                         //return this ile diğer parametreleeri peş peşe(. ile) çağırabiliyoruz.
        }

        public Builder creatine(int val){
            creatine=val;
            return this;
        }

        public Builder globulin(int val){
            globulin=val;
            return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate=val;
            return this;
        }

        public Serum build(){
            return new Serum(this);
        }
    }

    public Serum(Builder builder) {
        water = builder.water;sodiumIon = builder.sodiumIon;
        magnesium = builder.magnesium;
        creatine = builder.creatine;
        globulin = builder.globulin;
        carbohydrate = builder.carbohydrate;
        System.out.println("Serum is created");
    }

    public static void main(String[] args) {
        Serum serum = new Builder(300,6).magnesium(9).carbohydrate(60).build();

        System.out.println(serum.sodiumIon);

    }



}
