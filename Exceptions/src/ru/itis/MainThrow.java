package ru.itis;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainThrow {

    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Баран, не дели на ноль!");
        } else {
            return a / b;
        }
    }

    public static void checkIsExistTextFile(String fileName) throws FileNotFoundException {
        if (!fileName.endsWith(".txt")) {
            throw new FileNotFoundException("File is not txt");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = div(a, b);
        System.out.println("Частное чисел: " + c);

        try {
            checkIsExistTextFile("hello.avi");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
