package com.programs;

public class LeapYearprogram {
    public static void main(String[] args) {
        int number=2025;
        if((number % 4 == 0) && (number % 100 != 0) || (number % 400 == 0)) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Common year");
        }
    }
}
