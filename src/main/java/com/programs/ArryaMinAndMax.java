package com.programs;

public class ArryaMinAndMax {
    public static void main(String[] args) {
        int[] arr={7,8,4,3,9,11,2,5};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= max){
                max=arr[i];
            }else if(arr[i] <= min) {
                min=arr[i];
            }
        }
        System.out.println(max +":the maximum array value");
        System.out.println(min +":the minmum array value");
    }
}
