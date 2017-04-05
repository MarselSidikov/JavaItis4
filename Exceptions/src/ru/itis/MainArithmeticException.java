package ru.itis;

import java.util.Scanner;

public class MainArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите два числа:");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Частное чисел: " + a / b);
            } catch (ArithmeticException e) {
                System.out.println("Введи нормальные числа, баран, потому что " + e.getMessage()
                + " в " + e.getStackTrace()[0]);
            }
        }

    }
}
