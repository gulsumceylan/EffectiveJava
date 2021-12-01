package com.effectivejava.examples.finals;

/*
FİNAL
-Final olan bir sınıf değişkenine sadece bir kere değer ataması yapılabilir.(Constructor içinde)
-Parametrenin metot bünyesinde değişikliğe ugrama tehlikesi ortadan kaldırılmış olur.
-Final olan bir sınıf genişletilerek bir alt sınıf oluşturulamaz.(Başka bir sınıf extend edemez!)
 */

public final class Time { //burdaki final bu time nesnesinin türetilemez olmasını sağlar.Javanın kendi String sınıfı da bu şekildedir.
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    //değişmez olması daha az zarar vericidir.
    //public erişim belirliyicisine sahip global alanlar final ile korunabilir.
    public final int hour;
    public final int minute;


    public Time(int hour, int minute) {
        if (hour < 0 || hour >= HOURS_PER_DAY)
            throw new IllegalArgumentException("Hour: " + hour);
        if (minute < 0 || minute >= MINUTES_PER_HOUR)
            throw new IllegalArgumentException("Min: " + minute);
        this.hour = hour;
        this.minute = minute;
    }

}

