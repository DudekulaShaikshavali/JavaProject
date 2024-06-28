package com.collection;

import java.util.*;

public class Iteratordemo {
    public static void main(String[] args) {
        Integer i[]=new Integer[]{5,7,9,4,3,2,0,1};
        List l= Arrays.asList(i);
        System.out.println(l);
//        Set st=new TreeSet(l);
//        System.out.println(st);

        Iterator it= l.iterator();
        while (it.hasNext());
        System.out.println(it.next());


    }
}
