package ru.itis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // объявил объектную переменную
        Human human;

        // создаем объект
        human = new Human(23, "Marsel");

        human.setAge(24);

        System.out.println(human.getAge());

        Random random = new Random();

        Human testHumans[] = new Human[1000];

        for (int i = 0; i < testHumans.length; i++) {
            testHumans[i] = new Human(random.nextInt(200), "Human" + i);
        }

        int ages[] = HumansUtils.countAges(testHumans);

        for (int i = 0; i < ages.length; i++) {
            System.out.println("age: " + i + ", count :" + ages[i]);
        }
    }
}
