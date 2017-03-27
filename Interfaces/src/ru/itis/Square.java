package ru.itis;

public class Square implements Figure, Presentable {
    protected int a;

    public Square(int a) {
        this.a = a;
    }

    public double calcPerimeter() {
        return a * 4;
    }

    public double calcArea() {
        return a * a;
    }

    public int getA() {
        return a;
    }

    public void present() {
        System.out.println("Hello! I,m square!");
    }
}
