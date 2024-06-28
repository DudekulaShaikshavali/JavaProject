package com.programs;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("The list of fibonacci series are");
        int a=0,b=1,sum=0;
        for(int i=0;i<10;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(a + ", ");
        }

    }
}
