package com.programs;

public class Factorialdemo {
    public static void main(String[] args) {
        int factorial= 1;
        for (int i=1; i<=10; i++) {
            factorial= factorial * i;
        }
        System.out.println(factorial);
    }
}
