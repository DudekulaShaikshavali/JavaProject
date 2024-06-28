package com.programs;

public class ChecknumberPositiveorNegative {
    public static void main(String[] args) {
        double  number= -127.50;
        if (number < 0.0) {
            System.out.println(number + " : is a  negative number");
        } else if (number > 0.0) {
            System.out.println(number + " : is a  possitive number");
        }else {
            System.out.println(number + " : is 0");
        }
    }
}
