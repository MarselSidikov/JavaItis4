package ru.itis;

public class Main {

    public static void main(String[] args) {
	    A a = new A();
        a.aValue = 10;
        a.staticAValue = 500;

        A a2 = new A();
        a2.aValue = 15;

        System.out.println(a.aValue);
        System.out.println(a2.aValue);
        System.out.println(a2.staticAValue);

        A.staticAValue = 1000;
        System.out.println(a.staticAValue);
        System.out.println(a2.staticAValue);

        a.method();
        a2.method();

        a.staticMethod();
        a2.staticMethod();
        A.staticMethod();
        // A.method();
    }
}
