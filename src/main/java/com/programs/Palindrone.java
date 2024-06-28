package com.programs;

public class Palindrone {
    public static void main(String[] args) {
        String s="malayalam";
        String reverse="";
        int len=s.length()-1;
        for (int i=len;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);

        if (s.equals(reverse)){
            System.out.println(reverse + " :the given string is palindrone");
        }else {
            System.out.println(reverse + " :the string is not palindrone");
        }
    }
}
