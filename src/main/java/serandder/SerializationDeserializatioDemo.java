package serandder;

import java.io.*;

public class SerializationDeserializatioDemo {
    public static void main(String[] args)  {
        Employee emp=new Employee("sainath",22000.00f);
        try {
            FileOutputStream fos=new FileOutputStream("employee.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(emp);
            fos.close();
            oos.close();
        }catch (IOException e) {
            System.out.println("Exception is caught");
        }
        System.out.println("Object is Serialized");


        try {
            FileInputStream fis=new FileInputStream("employee.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Employee em=(Employee) ois.readObject();
            fis.close();
            ois.close();

            System.out.println("object is deserialized");
            System.out.println("Employee name is: " +em.emp_Name);
            System.out.println("Employee salary is: " +em.emp_Salary);
        }catch (Exception e) {
            System.out.println("exception is caught");
        }
    }
}
