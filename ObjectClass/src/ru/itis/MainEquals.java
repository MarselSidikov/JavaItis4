package ru.itis;

public class MainEquals {
    public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23);
        Human marsel2 = new Human("Marsel", 23);
        Human guzel = new Human("Guzel", 18);
        System.out.println("Guzel vs Marsel: " + (marsel == guzel));
        System.out.println("Marsel vs Marsel2: " + (marsel2 == marsel));
        System.out.println("Marsel vs Marsel2 equals: " + (marsel2.equals(marsel)));
        marsel2 = marsel;
        System.out.println("Marsel vs Marsel2 after = :" + (marsel2 == marsel));
        System.out.println("Marsel vs Marsel2 equals after =: " + (marsel2.equals(marsel)));
        System.out.println();

        marsel2.equals("Marsel");
    }
}
