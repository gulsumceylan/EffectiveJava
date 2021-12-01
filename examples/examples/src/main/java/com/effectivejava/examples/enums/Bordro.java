package com.effectivejava.examples.enums;


enum Bordro {
    PAZARTESİ(OdemeTipi.HAFTA_ICI),SALI(OdemeTipi.HAFTA_ICI),CARSAMBA(OdemeTipi.HAFTA_ICI),
    PERSEMEBE(OdemeTipi.HAFTA_ICI),CUMA(OdemeTipi.HAFTA_ICI),CUMARTESİ(OdemeTipi.HAFTA_SONU),PAZAR(OdemeTipi.HAFTA_SONU),
    ;

    private final OdemeTipi odemeTipi;

    Bordro(OdemeTipi odemeTipi) {
        this.odemeTipi = odemeTipi;
    }

    double tutarHesapla(double calistigiSaat,double oran){
        return odemeTipi.odemeYap(calistigiSaat,oran);
    }

    private enum OdemeTipi {
        HAFTA_ICI{
            double tutarHesapla(double saat,double oran){return saat * oran * 2;}
        },
        HAFTA_SONU{
            double tutarHesapla(double saat,double oran){return saat * oran / 2;}
        };

        abstract double tutarHesapla(double saat,double oran);

        double odemeYap(double calistigiSaat,double oran){
            double bazTutar = calistigiSaat * oran;
            return bazTutar + tutarHesapla(calistigiSaat,oran);
        }
    }
}
