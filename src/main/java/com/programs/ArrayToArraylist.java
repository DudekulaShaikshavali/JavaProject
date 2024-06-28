package com.programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArraylist {
    public static void main(String[] args) {


        int arr[] = {4, 3, 2, 1, 9, 0, 5, 8, 7};
//List list = Arrays.asList(arr);
//        System.out.println(list);

        ArrayList list = new ArrayList();
        for (int i : arr) {
            list.add(i);

        }
        System.out.println(list);
    }
}
