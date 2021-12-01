package com.effectivejava.examples.generics.example;

import java.util.Arrays;
import java.util.Locale;

//Stack sınıfımızı generic hale dönüştürdük
public class GStack<T> {
    private T[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public GStack() {
        elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(T e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public T pop() {
        if (size == 0)
            throw new RuntimeException();
        T result = elements[--size];
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
        GStack<String> stack = new GStack<String>();
        for (String arg : args) {
            stack.push(arg);
            String ob = stack.pop();
            //Integer pop = (Integer) ob; // derleme anında hata alırız!
            //System.out.println(pop.toString());

            System.out.println(ob.toUpperCase());
        }

    }
}
