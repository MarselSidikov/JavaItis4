package ru.itis.zoo;


public class ZooMain {
    public static void main(String[] args) {
        Cat cat = new Cat(1, 1, 100);
        Koala koala = new Koala(5, 4, 10);
        Tiger tiger = new Tiger(10, 20, 5);

        Animal animals[] = new Animal[3];
        animals[0] = cat;
        animals[1] = koala;
        animals[2] = tiger;

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat(5);
            System.out.println("Animal weight: " + animals[i].getWeight());
            animals[i].performance();
        }
    }
}
