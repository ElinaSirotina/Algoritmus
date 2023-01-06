package org.example;

import java.util.Objects;

public class Stud implements Comparable<Stud> {
    public String name;
    public int age;
    public Stud(String name, int age){
        this.name=name;
        this.age=age;
    }
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Stud stud)) return false;
    return age == stud.age && Objects.equals(name, stud.name);
}

public int hashCode() {
    return Objects.hash(age);
}

    public int compareTo(Stud o) {
       return this.age-o.age;
    }

    public String getName() {
        return name;
    }
}
