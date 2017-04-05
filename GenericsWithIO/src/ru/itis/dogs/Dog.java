package ru.itis.dogs;

import ru.itis.animal.Animal;

public abstract class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
