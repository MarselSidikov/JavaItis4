package ru.itis;

/**
 * 22.02.2017
 * A
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class A {
    public int aValue;

    public static int staticAValue;

    public void method() {
        System.out.println("Hello! " + aValue);
    }

    public static void staticMethod() {
        //System.out.println("Hello!" + aValue);
        System.out.println("Hello!" + staticAValue);
    }
}
