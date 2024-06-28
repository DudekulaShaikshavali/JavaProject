package com.collection;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Vectordemo {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        System.out.println(v.capacity());
        v.add(5); v.add(7); v.add(2); v.add(3); v.add(4); v.add(1);
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.indexOf(1));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.contains(3));
//        System.out.println(v.isEmpty());

        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


        LinkedList lt=new LinkedList<>();
        lt.add(55);lt.add(44); lt.add(33); lt.add(22);
        lt.add(11);


    }
}
