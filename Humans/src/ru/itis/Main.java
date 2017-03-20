package ru.itis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Human humans[] = new Human[1000];
        Random random = new Random();

	    for (int i = 0; i < humans.length; i++) {
	        humans[i] = new Human("Human" + i,
                    random.nextInt(120));
        }

        int countAges[] = new int[120];

        for (int i = 0; i < humans.length; i++) {
            countAges[humans[i].getAge()] ++;
        }

        for (int i = 0; i < countAges.length; i++) {
            System.out.println(countAges[i]);
        }

    }
}
