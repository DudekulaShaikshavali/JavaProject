package com.operators;

public class Assignmentoperatos {

    public static int equaloperator(int a, int b) {
        return  a=b;
    }

    public  static  int addequal(int a, int b) {
        return  a += b;
    }

    public  static  int subqual(int a, int b) {
        return  a -= b;
    }

    public  static  int multisqual(int a, int b) {
        return  a *= b;
    }

    public  static  int divsiequal(int a, int b) {
        return  a /= b;
    }

    public  static  int modulqual(int a, int b) {
        return  a %= b;
    }



    public static  int andequal(int a, int b){
        return  a &= b;
    }

    public static int orequal(int a, int b) {
        return  a |= b;
    }
public  static  int  exorequal(int a, int b) {
        return  a ^= b;
}

public static  int rightshiftequal(int a, int b) {
        return  a <<= b;
}

public static  int leftshiftequal(int a, int b) {
        return  a >>= b;
}
    public static void main(String[] args) {
        System.out.println("Equal value:" +equaloperator(5,6));
        System.out.println("additionequal value:" +addequal(5,7));
        System.out.println("substractionequal value:" +subqual(9,6));
        System.out.println("multiplicationequal value:" +multisqual(9,5));
        System.out.println("divisionequal value:" +divsiequal(10,5));
        System.out.println("remainderequal value:" +modulqual(8,2));
        System.out.println("andequal value:" +andequal(5,7));
        System.out.println("orequal value:" +orequal(6,9));
        System.out.println("exorequal value:" +exorequal(7,6));
        System.out.println("leftshiftequal value:" +leftshiftequal(4,6));
        System.out.println("rightshifteqal value:" + rightshiftequal(9,2));
    }
}
