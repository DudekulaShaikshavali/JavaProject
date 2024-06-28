package com.operators;

public class ArithmeticOperations {
    public static  int addition(int a, int b) {
        return a+b;
    }

    public static  int substraction(int a, int b){
        return  a - b;
    }

    public static  int multiplication(int a, int b){
        return  a * b;
    }

    public static  int devision(int a, int b){
        return  a / b;
    }

    public static  int modulus(int a, int b){
        return  a % b;
    }


    public static void main(String[] args) {
        int add=addition(5,6);
        int sub=multiplication(9,5);
        int mult=multiplication(6, 8);
        int divi=devision(9,3);
        int modul=modulus(10,5);

        System.out.println("addition value: " +add);
        System.out.println("substraction value:" +sub);
        System.out.println("mutliplication value: " +mult);
        System.out.println("division value: " +divi);
        System.out.println("remainder value: " +modul);
    }
}
