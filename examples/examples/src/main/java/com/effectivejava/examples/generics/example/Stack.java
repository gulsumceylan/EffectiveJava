package com.effectivejava.examples.generics.example;

import java.util.Arrays;
/*
İçine bir eleman atıp çekenbildiğimiz bir class
Dışardan parametre alıyor (args) -->dışardan parametre alabilmek için yukarda edit configuration kısmında program argümants'a değer girebilirsin

 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new RuntimeException();
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (String arg : args) {
            stack.push(arg);
            Object ob = stack.pop();
            String pop = (String) ob;    //generics kullanmadığımız için casting işlemi yapıyoruz. Bu hatalara sebep olabilir Integera çevirsek de derleme anında hata vermez!ClassCastException hatası alırız
            System.out.println(pop.toUpperCase());
        }

    }
}
