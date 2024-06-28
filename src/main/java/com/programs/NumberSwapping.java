package com.programs;

public class NumberSwapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println( " values of a is:  "  + a);
        System.out.println( " values of b is:  "  + b);
    }
}
