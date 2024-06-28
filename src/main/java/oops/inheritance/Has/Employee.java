package oops.inheritance.Has;

public class Employee {
    int id;
    String name;
    Address add;

    public Employee(int id, String name, Address add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    void display(){
        System.out.println(id + " " + name);
        System.out.println(add.country + " "  + add.state + " " + add.city);
    }

    public static void main(String[] args) {
        Address ad1=new Address("hyderabad","telangana","india");
        Address ad2=new Address("banglore","karnataka","india");

        Employee em1=new Employee(111,"sunil challam", ad1);
        Employee em2=new Employee(112,"kuruba sainath", ad2);

        em1.display();
        em2.display();
    }
}
