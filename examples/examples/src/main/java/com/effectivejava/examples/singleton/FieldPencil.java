package com.effectivejava.examples.singleton;

public class FieldPencil {
    public static final FieldPencil INSTANCE = new FieldPencil(); //arada bir getInstance metodu yok direkt public yaptık

    private FieldPencil() {
    }

    public static void main(String[] args){
        FieldPencil pencil=FieldPencil.INSTANCE;
        FieldPencil pencil2=FieldPencil.INSTANCE;

        System.out.println(pencil.hashCode());
        System.out.println(pencil2.hashCode());
    }
}
