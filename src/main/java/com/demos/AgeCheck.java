package com.demos;
class AgeInvalidException extends RuntimeException {
    AgeInvalidException(String s){

    }
}
public class AgeCheck {
    public static void main(String[] args) {
        int age=4;
        if(age<18){
            System.out.println("your not eligible for vote");
        } else if (age > 18) {
            System.out.println("your elgible for vote");
        }else {
            System.out.println("welcome to vote");
        }

throw new AgeInvalidException("invalid");

    }
}
