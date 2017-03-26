package ru.itis.zoo;

public class Main {
    public static void main(String[] args) {
        // Animal animal = new Animal(100, 10);

        // animal.eat(50);
        // System.out.println("Animal weight after 50 food eating: " + animal.getWeight());

        Koala koala = new Koala(10, 5, 100);
        koala.sleep(10);

        System.out.println("Koala sleeping hours: " + koala.getSleepingHours());

        int i = 50;
        // неявное преобразование, возможно, потому что int входит в double
        double d = i;

        // восходящее преобразование
        // теперь есть объектная переменная типа Animal, но на указывает
        // на объект типа Koala
        Animal koalaAsAnimal = koala;

        // koalaAsAnimal.sleep(10);
        koalaAsAnimal.eat(10);
        System.out.println("Koala wight after eating: " + koalaAsAnimal.getWeight());


        Tiger tiger = new Tiger(20, 10, 5);
        tiger.win();
        System.out.println("Tiger wins: " + tiger.getWinsCount());

        Animal tigerAsAnimal = tiger;
        tigerAsAnimal.eat(10);
        System.out.println("Tiger weight after 10 food eating: " + tigerAsAnimal.getWeight());

        Animal catAsAnimal = new Cat(1, 1, 100);
        catAsAnimal.eat(5);

        System.out.println("Cat weight after 5 food eating: " + catAsAnimal.getWeight());

    }
}
