package com.effectivejava.examples.methods;

import java.util.Date;

public class Period {
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) throws IllegalAccessException {  //defansif kopyalama yapmalıyız dışardan gelen nesne üzerinde oynama yapılabilir örneğin set ile
        this.start = new Date(start.getTime()); //Bu şekilde dışarıyla irtibatını kesmiş oluruz kendi nesnelerimizin
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end)>0){
            throw new IllegalAccessException(start + " after " + end);
        }
    }

    public Date start() { return start; }

    public Date end() { return new Date(end.getTime()); }

    @Override
    public String toString() {
        return start + " - " + end;
    }

}
