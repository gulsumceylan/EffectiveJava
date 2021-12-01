package com.effectivejava.examples.tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
                                                                    //IOException , akışlar, dosyalar ve dizinler kullanılarak bilgilere erişirken oluşturulan özel durumlar için temel sınıftır.
    static String firstLineOfFile(String path) throws IOException{  //IOExceptions kullanarak bağlantının kopabileceği bir durumla başa çıkmak zorundasınız. Eğer bunu silersek try-catch koymamız gerekir

        BufferedReader br = new BufferedReader(new FileReader(path));   //Decorator Pattern--Runtime zamanında bir nesneye yeni özellikler eklemek istiyorsak kullanabiliriz.

        try {
            return br.readLine();
        } finally {
            br.close();    //açılan dosyaların kapatılması gerekir ama unutulabilir.Yeni gelen try with resource özelliği ile otamatik kapanır. (implements Closeable)
        }
    }

/*     try - resource kullanılmış şekli

    //AutoCloseable , Closeable

    static String firstLineOfFile(String path) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            return br.readLine();

        }
    }
 */

}
