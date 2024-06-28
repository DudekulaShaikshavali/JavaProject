package oops.inheritance;

public class Programmer extends Employee{
    int bonus=10000;
    public static void main(String[] args) {
Programmer p = new Programmer();
        System.out.println("programmer salary:" +p.salary);
        System.out.println("programmer bonus:" +p.bonus);
    }
}
