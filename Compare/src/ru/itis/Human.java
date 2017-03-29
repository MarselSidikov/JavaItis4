package ru.itis;


public class Human implements Comparable {
    private String name;
    private int age;
    private int height;

    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        Human that = (Human)obj;
        return this.age == that.age;
    }

    public String toString() {
        return this.name + " " + this.age;
    }

    public int compareTo(Object object) {
        return this.age - ((Human)object).age;
    }

    public int getHeight() {
        return height;
    }
}
