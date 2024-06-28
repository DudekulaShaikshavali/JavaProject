package com.java8feature.function;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        Function<Integer,Integer>fu=n->n*n;
        System.out.println(fu.apply(5));
        System.out.println(fu.apply(10));
        System.out.println(fu.apply(2));


        //String length
        //String--->length--->int
        Function<String,Integer>fn=s->s.length();
        System.out.println(fn.apply("welcome"));
        System.out.println(fn.apply("java programming"));
    }
}
