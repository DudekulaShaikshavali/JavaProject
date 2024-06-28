package serandder;

import java.io.Serializable;

public class Employee implements Serializable {
String emp_Name;
 double emp_Salary;



    public Employee(String emp_Name, double emp_Salary) {
        this.emp_Name = emp_Name;
        this.emp_Salary = emp_Salary;
    }
}
