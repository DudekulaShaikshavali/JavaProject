package com.java8feature.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    Employee(String ename, int salary){
        this.ename=ename;
        this.salary=salary;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee>al=new ArrayList<Employee>();
        al.add(new Employee("john",30000));
        al.add(new Employee("david",50000));
        al.add(new Employee("mary",20000));

        Function<Employee,Integer>fn=e->{
            int sal= e.salary;
            if(sal >=10000 && sal <=20000){
                return (sal * 10/100);
            } else if (sal > 20000 && sal <=30000) {
                return (sal * 20/100);
            } else if (sal > 30000 && sal <= 50000) {
                return (sal * 30/100);

            }else {
                return (sal * 40/100);
            }
        };
        Predicate<Integer>pr=b->b>5000;

        for (Employee emp:al){
         int bonus=  fn.apply(emp);
         if(pr.test(bonus)) {
             System.out.println(emp.ename + " " + emp.salary);
             System.out.println("Bonus is:" + bonus);
         }
        }
    }
}
