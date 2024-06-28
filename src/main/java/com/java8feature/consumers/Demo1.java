package com.java8feature.consumers;

import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        Consumer<String>co=s-> System.out.println(s);
        co.accept("Welcome");
    }
}
