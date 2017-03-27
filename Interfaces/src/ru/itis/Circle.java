package ru.itis;

public class Circle implements Figure, Presentable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void present() {
        System.out.println("Hello! I,m circle!");
    }
}
