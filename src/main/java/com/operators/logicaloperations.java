package com.operators;

public class logicaloperations {
    public  static  boolean  logicaland(int a, int b) {
        return  a < b && b > a;
    }

    public  static boolean logicalor(int a, int b) {
        return   a > b || a < b;
    }

    public  static  boolean  logicalnot(int a, int b) {
        return !( a > b &&  a < b);
    }

    public static void main(String[] args) {
        System.out.println("logicaland value:" +logicaland(3,7));
        System.out.println("logicalor value:" +logicalor(10,7));
        System.out.println("logicalnot value:" +logicalnot(3,5));
    }
}
