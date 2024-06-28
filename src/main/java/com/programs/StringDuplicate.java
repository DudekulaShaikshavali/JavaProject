package com.programs;

public class StringDuplicate {
    public static void main(String[] args) {
        String s = "madam";
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int startindex=s.indexOf(c);
            int lastindex=s.lastIndexOf(c);
            if (startindex == lastindex) {
                System.out.println(c + " :is a unique char");
            }
        }
    }
}
