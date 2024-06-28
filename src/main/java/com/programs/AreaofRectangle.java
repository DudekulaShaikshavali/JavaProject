package com.programs;

public class AreaofRectangle {
    public static int rectangle(int length, int width){
        int rectangle= length*width;
        return rectangle;
    }

    public static void main(String[] args) {
        System.out.println("Area of rectangle is: " + rectangle(5,4));
    }
}
