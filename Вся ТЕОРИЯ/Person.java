package com.telran.print;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void print() {
        System.out.println("Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}');
    }
}
