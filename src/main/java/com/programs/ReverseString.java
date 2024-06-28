package com.programs;

public class ReverseString {
    public static void main(String[] args) {
        String s="snake";
        String reverse="";
        int len=s.length()-1;
        for (int i=len;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);
    }
}
