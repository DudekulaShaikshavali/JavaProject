package com.collection;

import java.util.*;

public class Enemerationdemo {
    public static void main(String[] args) {
        Vector <String>days=new Vector<>();
        days.add("sunday");
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("saturday");
        Enumeration em=days.elements();
        while (em.hasMoreElements()){
            System.out.println("Order of days:" + em.nextElement());

        }

        Stack<Integer>st=new Stack<>();
        st.add(500); st.add(400);st.add(200);
        st.add(100);st.add(300); st.add(600);
        Enumeration<Integer>em1= st.elements();
        while (em1.hasMoreElements()){
            System.out.println("list of 100 rupees:" + em1.nextElement());
        }

        Hashtable <Character,Integer>ht=new Hashtable<>();
        ht.put('a', 1); ht.put('b',2); ht.put('c',3);
        ht.put('d',4); ht.put('e',5); ht.put('f',6);
        Enumeration em2= ht.elements();
        while (em2.hasMoreElements()){
            System.out.println(em2.nextElement());

        }
        System.out.println(ht.keySet());
        System.out.println(ht.values());
    }
}
