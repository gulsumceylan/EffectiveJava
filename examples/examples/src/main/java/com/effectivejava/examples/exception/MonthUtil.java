package com.effectivejava.examples.exception;

import java.text.DateFormatSymbols;
import java.util.Locale;

//Try-Catch her yerde kullanılmaz hatayı görmemizi engelleyebilir ve uygulamamızı yavaşlatır!
//Çalışma anında hata fırlatmamaya çalışın hatayı derleme anına çekmek için farklı yöntemler deneyin.
public class MonthUtil {
/*
    public static String monthName(int monthNo){
        if (monthNo>12)
            throw new IllegalArgumentException("12den büyük olamaz!!");
        Locale locale=new Locale("tr","TR");
        DateFormatSymbols symbols=new DateFormatSymbols(locale);
        String[] months=symbols.getMonths();
        return months[monthNo+1];
    }

    public static void main(String[] args) {
        String ayIsmi=monthName(2);
        System.out.println(ayIsmi);
    }
 */

    public static String monthName(AyNo monthNo){
        Locale locale=new Locale("tr","TR");
        DateFormatSymbols symbols=new DateFormatSymbols(locale);
        String[] months=symbols.getMonths();
        return  months[monthNo.getAyNumarasi()-1];
    }

    public static void main(String[] args) {
        String ayIsmi=monthName(AyNo.MART);
        System.out.println(ayIsmi);
    }
}

    enum AyNo{
        OCAK(1),SUBAK(2),MART(3);

        private int ayNumarasi;

        AyNo(int ayNumarasi){
            this.ayNumarasi=ayNumarasi;
        }

        public int getAyNumarasi() {
            return ayNumarasi;
        }

        public void setAyNumarasi(int ayNumarasi) {
            this.ayNumarasi = ayNumarasi;
        }
    }


