package ru.itis.compare;


public class Human implements Comparable<Human> {
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
        if (obj instanceof Human) {
            Human that = (Human)obj;
            return this.age == that.age;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.height;
    }

    public int compareTo(Human object) {
        return this.age - object.age;
    }

    public int getHeight() {
        return height;
    }
}
