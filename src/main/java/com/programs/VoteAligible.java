package com.programs;

public class VoteAligible {
    public static void main(String[] args) {
        int age = 95;
        if (age <= 18) {
            System.out.println("your not aligible for vote");
        } else if (age >= 18) {
            System.out.println("your senior to vote");

        }else {
            System.out.println(" your eligible");
        }
    }
}
