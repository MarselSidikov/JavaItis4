package ru.itis.cats;

import ru.itis.animal.Animal;

public abstract class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
