package ru.itis.zoo;

public class Koala extends Animal {
    private int sleepingHours;

    public Koala(int weight, int growth, int sleepingHours) {
        super(weight, growth);
        if (sleepingHours >= 0) {
            this.sleepingHours = sleepingHours;
        }
    }

    public void sleep(int hours) {
        this.sleepingHours = sleepingHours + hours;
    }

    public int getSleepingHours() {
        return sleepingHours;
    }

    public void eat(int foodAmount) {
        if (foodAmount >= 0) {
            this.weight = this.weight + foodAmount * 2;
        }
    }

    public void performance() {
        System.out.println("...");
    }
}
