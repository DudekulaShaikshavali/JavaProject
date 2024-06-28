package com.programs;

import java.io.*;

public class SerAndDes implements Serializable {
    String name;
    int age;

    public SerAndDes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) throws Exception{
        SerAndDes sd=new SerAndDes("sauk",112);
        FileOutputStream fos=new FileOutputStream("stud.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(sd);
        fos.close();
        oos.close();

        FileInputStream fis=new FileInputStream("stud.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        SerAndDes set=(SerAndDes) ois.readObject();
        ois.close();
        fis.close();
        System.out.println("my name is:" +set.name);
        System.out.println("i'm:" + set.age);
    }
}
