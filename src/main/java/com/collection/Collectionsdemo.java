package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsdemo {
    public static void main(String[] args) {
        ArrayList lt= new ArrayList<>();
        lt.add(1); lt.add(5);
        lt.add(4); lt.add(2);
        lt.add(55); lt.add(22);
        System.out.println(lt);
        System.out.println(Collections.max(lt));
        System.out.println(Collections.min(lt));
   Collections.sort(lt);
        System.out.println(lt);

    }
}
