package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Triangle triangle = new Triangle(2,3,4);
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(5, 2);
        Circle circle = new Circle(10);

        Figure figures[] = {triangle, square, rectangle, circle};

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].calcArea());
        }

        Presentable presentableTriangle = triangle;
        presentableTriangle.present();
    }
}
