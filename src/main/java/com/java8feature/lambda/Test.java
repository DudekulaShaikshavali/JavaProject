package com.java8feature.lambda;
interface Cab{
   // public void bookCab(String source, String destination);
   public String bookCab(String source, String destination);
}

//class Ola implements Cab{
//    public void bookCab(String source, String destination){
//        System.out.println("Ola cab is booked from " +source +" To " + destination);
//    }


//    @Override
//    public String bookCab(String source, String destination) {
//        System.out.println("Ola cab is booked from " +source +" To " + destination);
//        return ("price is 6000");
//    }
//}
public class Test {
    public static void main(String[] args) {
//        Cab cab=new Ola();
//        cab.bookCab("Hyderabad","Anantapur");

//        Cab cab=new Ola();
//        System.out.println(cab.bookCab("Hyderabad","Anantapur"));

//        Cab cab=(source,destination)->  System.out.println("Ola cab is booked from " +source +" To " + destination);
//        cab.bookCab("Hyderabad","Anantapur");


        Cab cab = (source, destination) ->{ System.out.println("Ola cab is booked from " + source + " To " + destination);
        return ("price is 600 rupees");
    };

        System.out.println(cab.bookCab("Hyderabad","Anantapur"));


    }
}
