package ru.itis.zoo;

public abstract class Animal {
    protected int weight;
    protected int growth;

    public Animal(int weight, int growth) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            this.weight = 1;
        }

        if (growth >= 0) {
            this.growth = growth;
        } else {
            this.growth = 0;
        }
    }

    public int getWeight() {
        return weight;
    }

    public int getGrowth() {
        return growth;
    }

    public void eat(int foodAmount) {
        if (foodAmount >= 0) {
            this.weight = this.weight + foodAmount;
        }
    }

    public abstract void performance();
}
