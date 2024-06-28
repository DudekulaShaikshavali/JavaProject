package com.programs;

import java.util.HashMap;

public class EcachCharacterReading {
    public static void main(String[] args) {
        String s="ramalingam subrahmaniyam";
        HashMap<Character,Integer>hm=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
               int a= hm.get(c);
                hm.put(c,a+1);
            }else {
                hm.put(c,1);
            }
        }
        System.out.println(hm);
    }
}
