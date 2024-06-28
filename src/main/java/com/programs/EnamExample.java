package com.programs;

public class EnamExample {
    public static void main(String[] args) {
        Days d = Days.Thursday;

        if (d == Days.Thursday) {
            System.out.println( "Today is Thursday");
        }

        for (Days  day : Days.values()) {
            System.out.println(day);
        }
    }
}
