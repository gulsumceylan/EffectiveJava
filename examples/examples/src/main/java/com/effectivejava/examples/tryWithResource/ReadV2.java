package com.effectivejava.examples.tryWithResource;

import java.io.*;

public class ReadV2 {
    private final static int BUFFER_SIZE = 1000;

    static void copy(String src, String dst) throws IOException {

        InputStream in = new FileInputStream(src);

        try {

            OutputStream out = new FileOutputStream(dst);

            try {

                byte[] buf = new byte[BUFFER_SIZE];

                int n;

                while ((n = in.read(buf)) >= 0)

                    out.write(buf, 0, n);

            } finally {

                out.close();  //artık kapatmak zorunda değiliz!

            }

        } finally {

            in.close(); //artık kapatmak zorunda değiliz!

        }

    }

    /*     try - resource kullanılmış şekli

     private final static int BUFFER_SIZE = 1000;

    // try-with-resources on multiple resources - short and sweet

    static void copy(String src, String dst) throws IOException {

        try (InputStream   in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {

            byte[] buf = new byte[BUFFER_SIZE];

            int n;

            while ((n = in.read(buf)) >= 0)

                out.write(buf, 0, n);

        }
    }

     */
}
