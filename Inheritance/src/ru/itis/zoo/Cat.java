package ru.itis.zoo;

public class Cat extends Animal {
    private int stepsTaken;

    public Cat(int weight, int growth, int stepsTaken) {
        super(weight, growth);

        if (stepsTaken >= 0) {
            this.stepsTaken = stepsTaken;
        }
    }

    public int getStepsTaken() {
        return stepsTaken;
    }

    public void performance() {
        System.out.println("MEOW!!!");
    }
}
