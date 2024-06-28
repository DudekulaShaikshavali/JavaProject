package com.java8feature.predicate;

import java.util.function.Predicate;
//predicate ---> one parameter return boolean
//use only if you have conditional checks in your program...
public class Demo1 {
    public static void main(String[] args) {
        //Ex1
        Predicate<Integer>p=i->(i>10);
        System.out.println(p.test(20));
        System.out.println(p.test(5));

        //Ex2 check the length of string greater than 4 or not
        Predicate<String>pr=s->(s.length()>4);
        System.out.println(pr.test("welcome"));
        System.out.println(pr.test("xyz"));

        //Ex3: print array elements whose size is >4 from array
        String names[]={"david","scott","smith","john","mary"};
        for(String name:names){
         if(pr.test(name)){
             System.out.println(name);
         }

           /* if(name.length() >4){
                System.out.println(name);
            }*/
        }
    }
}
