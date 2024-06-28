package com.java8feature.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;

    Employee( String name, int sal, int exp){
        ename=name;
        salary=sal;
        experience=exp;

    }
}
public class PredicateDeomo {
    public static void main(String[] args) {
        //Ex1
        Employee em= new Employee("john",20000,2);
        //emp obj--> return name if salry>50k ex>3
        Predicate<Employee>pr=e->(e.salary > 30000 && e.experience > 3);
      //  System.out.println(pr.test(em));
//Ex2 :

        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(new Employee("john",50000,5));
        al.add(new Employee("david",20000,2));
        al.add(new Employee("scott",30000,3));
        al.add(new Employee("mary",40000,6));

        for (Employee e:al){

            if(pr.test(e)){
                System.out.println(e.ename+ " " +e.salary);
            }

//            if (e.salary > 30000 && e.experience > 3){
//                System.out.println(e.ename+ " " +e.salary);
//            }
        }

    }
}
