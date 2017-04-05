package ru.itis.cats;

public class Tiger extends Cat {
    private int countOfRabbits;


    public Tiger(String name, int countOfRabbits) {
        super(name);
        this.countOfRabbits = countOfRabbits;
    }

    @Override
    public String toString() {
        return getName() + " " + countOfRabbits;
    }
}
