package com.java8feature.consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    String gender;

    Employee(String ename,int salary,String gender){
        this.ename=ename;
        this.salary=salary;
        this.gender=gender;
    }
}


public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee>emlist=new ArrayList<>();
        emlist.add(new Employee("david",50000,"male"));
        emlist.add(new Employee("john",30000,"male"));
        emlist.add(new Employee("mary",20000,"female"));
        emlist.add(new Employee("scott",60000,"male"));

        //Function
        Function<Employee,Integer>fn=emp->(emp.salary*10)/100;//task1

        //Predicate
        Predicate<Integer>pr=b->b>=5000;//task2

        //Consumer
        Consumer<Employee>co=emp->{
            System.out.println(emp.ename);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };//task3

        for (Employee e:emlist){
          int bonus=  fn.apply(e);//calculate bonus invoked function
          if (pr.test(bonus)){//invoked predicate
             co.accept(e);//invoke consumer
              System.out.println("Employee bonus:"+bonus);
          }
        }
    }
}
