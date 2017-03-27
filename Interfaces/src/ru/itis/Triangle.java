package ru.itis;

public class Triangle implements Figure, Presentable {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcPerimeter() {
        return a + b + c;
    }

    public double calcArea() {
        double p = calcPerimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void present() {
        System.out.println("Hello! I,m triangle!");
    }
}
