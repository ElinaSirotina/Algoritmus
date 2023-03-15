package com.telran.print;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jane", 23);

        // #1 approach
        System.out.println(person);
        // #2 approach
        person.print();

    }
}
