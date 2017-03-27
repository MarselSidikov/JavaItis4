package ru.itis;

public class Rectangle extends Square {
    private int b;

    public Rectangle(int a, int b) {
        super(a);
        this.b = b;
    }

    public double calcPerimeter() {
        return super.a * 2 + this.b * 2;
    }

    public double calcArea() {
        return a * b;
    }

    public int getB() {
        return b;
    }

    public void present() {
        System.out.println("Hello! I,m rectangle!");
    }
}
