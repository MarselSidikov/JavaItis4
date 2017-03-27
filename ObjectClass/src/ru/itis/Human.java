package ru.itis;

import javax.jws.Oneway;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " " + age;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Human)) {
            return false;
        }
        Human that = (Human)object;
        return this.name == that.name && this.age == that.age;
    }

}
