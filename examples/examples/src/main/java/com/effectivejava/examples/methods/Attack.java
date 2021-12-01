package com.effectivejava.examples.methods;

import java.util.Date;

public class Attack {

    public static void main(String[] args) throws IllegalAccessException {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);
        System.out.println(p);

        start = new Date();
        end = new Date();
        p = new Period(start, end);
        p.end().setYear(78);
        System.out.println(p);
    }
}
