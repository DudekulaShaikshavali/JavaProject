package com.operators;

public class comparision {
    public static boolean doubleequal(int x, int y) {
        return x==y;
    }

    public static boolean notequal(int x, int y) {
        return x !=y;
    }

    public static boolean lessthan(int x, int y) {
        return x < y;
    }

    public static boolean greaterthan(int x, int y) {
        return x > y;
    }

    public static boolean lessthanequal(int x, int y) {
        return x <= y;
    }

    public static boolean greaterthanequal(int x, int y) {
        return x >= y;
    }
    public static void main(String[] args) {
        System.out.println("doubleequal value:" +doubleequal(5,5));
        System.out.println("notequal value:" + notequal(5,6));
        System.out.println("lessthan value:" + lessthan(4,5));
        System.out.println("greaterthan value:" +greaterthan(5, 3));
        System.out.println("lesstharequal value:" +lessthanequal(7,10));
        System.out.println("greaterthanequal value:" +greaterthanequal(7,5));
    }
}
