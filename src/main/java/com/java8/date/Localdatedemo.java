package com.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Localdatedemo {
    public static void main(String[] args) {
        LocalDate today= LocalDate.now();
        LocalDate yesterday= today.minusDays(1);
        LocalDate tomorrow= yesterday.plusDays(2);
        System.out.println("Today is: " +today);
        System.out.println("Yesterday is: " + yesterday);
        System.out.println("Tomorrow is: " + tomorrow);
        /*
        Leap year
         */

        LocalDate l1=LocalDate.of(2023,11,25);
        System.out.println(l1.isLeapYear());
        LocalDate l2=LocalDate.of(2024,9,25);
        System.out.println(l2.isLeapYear());

        /* date times

         */
        LocalDate l3=LocalDate.of(2023,11,6);
        LocalDateTime ldt=l3.atTime(1,55,07);
        System.out.println(ldt);
    }
}
