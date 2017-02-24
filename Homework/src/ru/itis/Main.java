package ru.itis;

public class Main {

    public static void reverse(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return fact(n - 1) * n;
        }
    }

    public static int fib(int n) {
        if (n > 1) {
            return fib(n - 1) + fib(n - 2);
        } else {
            return 1;
        }
    }

    public static int fib2(int x1, int x2, int n) {
        int x3;
        if (n > 1) {
            x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
            return fib2(x1, x2, n - 1);
        } else {
            return x2;
        }
    }

    public static void main(String[] args) {
        int b[] = {3, 5, 6, 6, 7};

        reverse(b);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println(fact(5));
        System.out.println(fib2(1, 1, 10));
    }
}
