package com.programs;

public class Aeeaysecondminandmax {
    public static void main(String[] args) {
        int [] arr={9,10,11,13,55,79,4,72,3};
        int max=arr[0];
        int secondmax=arr[0];
        int min=arr[0];
        int secondmin=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) {
               secondmax=max;
               max=arr[i];
            }else if(arr[i] > secondmax) {
                secondmax=arr[i];
            }

          if(arr[i] < min) {
                secondmin=min;
                min=arr[i];
            }else if(arr[i] < secondmin) {
              secondmin=arr[i];
          }
        }
        System.out.println("the  maximum array value is:" + max);
        System.out.println("the  minmum array value is:" + min);
        System.out.println("the second maximum array value is:" + secondmax);
        System.out.println("the second minmum array value is:" + secondmin);
    }
}
