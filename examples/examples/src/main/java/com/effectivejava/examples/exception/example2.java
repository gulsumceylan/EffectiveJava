package com.effectivejava.examples.exception;
/* Throwable
A)Error     !!Hata fırlatacaksan kesinlikle bu tipte bir hata fırlatma
B)Exception
 1)UnChecked Exceptions
 !Biz kontrol etmek zorunda değiliz
   RunTimeException
   -ArithmeticException
   -ClassCastException
   -NullPointerException
 2)Checked Exceptions   !!Tercih edilmemeli
 !kontrol etmemiz gereken hatalardır.
 !Java bizi zorlar ya try-catch ya da throw fırlatmalısın
   -IOException
   -IllegalAccessEx.
   -ClassNotFoundEx.

 */
public class example2 {

    public static void parse(int value){
        if (value>1000){
            //throw new Error();   // PS : Error tipi hatalar JVM içindir, bu hata tiplerini kullanmayın
            throw  new IllegalArgumentException();

        }
    }

    public static void main(String[] args) {
        example2.parse(10000);
        System.out.println("bitti");

    }
}
