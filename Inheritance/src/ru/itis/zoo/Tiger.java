package ru.itis.zoo;

public class Tiger extends Animal {
    private int winsCount;


    public Tiger(int weight, int growth, int winsCount) {
        super(weight, growth);
        if (winsCount >= 0) {
            this.winsCount = winsCount;
        }
    }

    public int getWinsCount() {
        return winsCount;
    }

    public void win() {
        this.winsCount++;
    }

    public void eat(int foodAmount) {
        if (foodAmount >= 0) {
            this.weight = this.weight + foodAmount / 2;
        }
    }

    public void performance() {
        System.out.println("RRRR!!!");
    }
}
