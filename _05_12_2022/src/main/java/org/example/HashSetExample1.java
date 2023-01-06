package org.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String []args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(1);
        set1.add(3);
        set1.add(8);

        Set<Integer> set2=new HashSet<>();
        set2.add(7);
        set2.add(4);
        set2.add(3);
        set2.add(5);
        set2.add(8);

        Set<Integer> subtruct=new HashSet<>(set1);
        subtruct.removeAll(set2);
        System.out.println(subtruct);


    }
}
