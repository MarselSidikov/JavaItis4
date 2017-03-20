package ru.itis;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
