package org.example;

import java.util.ArrayList;
import java.util.List;

public class TreeSet1 {
    public static void main(String[] args) {
        List<Stud> treeSet=new ArrayList<>();
        Stud str1=new Stud("Elina",40);
//        Stud str2=new Stud("Kate");
//        Stud str3=new Stud("Ivan");
//        Stud str4=new Stud("Sergey");
//        Stud str5=new Stud("Olga");


        treeSet.add(str1);
//        treeSet.add(str2);
//        treeSet.add(str3);
//        treeSet.add(str4);
//        treeSet.add(str5);

        System.out.println(treeSet);
        System.out.println(str1.getName());

    }
}
