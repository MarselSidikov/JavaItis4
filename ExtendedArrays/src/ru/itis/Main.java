package ru.itis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // объявил переменную массива, который будет двумерным
	    int array[][];

        array = new int[10][5];

        Random random = new Random();

        // бежим по всем строкам
        for (int i = 0; i < array.length; i++) {
            // для каждой строки я пробегаю все стоблцы
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(25);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
