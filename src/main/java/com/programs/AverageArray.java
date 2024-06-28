package com.programs;

public class AverageArray {
    public static void main(String[] args) {
        int arr[]={5,7,8,9,0,4,2};
        int sum=0;
        int average = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            average=sum/arr.length;
        }
        System.out.println(average);

    }
    }

