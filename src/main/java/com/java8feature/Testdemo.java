package com.java8feature;

@FunctionalInterface
interface Cab {
    public void bookCab();
}

//class Ola implements Cab {
//    @Override
//    public void bookCab() {
//        System.out.println("ola cab is booked");
//    }
//}
public class Testdemo {
    public static void main(String[] args) {
//        Cab cab=new Ola();
//        cab.bookCab();
        Cab cab=()-> System.out.println("ola cab is booked");
        cab.bookCab();
    }
}
