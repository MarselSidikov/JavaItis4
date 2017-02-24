package ru.itis.procedure.style;

// control1
/**
 * 20.02.2017
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program {

    public static void main(String[] args) {
        // int a[] = new int[10];
        /**
        Human marsel = new Human();
        System.out.println(marsel.getAge());
        System.out.println(marsel.getName());
        marsel.setName("Marsel");
        // marsel.age = 23;
        marsel.setAge(23);
        Human guzel = marsel;
        //guzel.age = 18;
        guzel.setAge(18);
        System.out.println(marsel.getAge());

        Human someMan = new Human();
        someMan.setName("Almaz");
        someMan.setAge(-13);
        System.out.println(someMan.getAge());

        Human maksim = new Human("Maksim", 13);
        System.out.println(maksim.getAge() + " " + maksim.getName());
        maksim.setAge(14);**/
        //----------------
        Human marsel = new Human("Marsel", 23);
        Human ruslan = new Human("Ruslan", 16);
        Human maksim = new Human("Maksim", 13);
        Human karim = new Human("Karim", 16);
        Human guzel = new Human("Guzel", 18);
        Human nika = new Human("Nika", 16);
        Human marat = new Human("Marat", 16);

        Human humans[] = {marsel, ruslan, maksim,
                karim, guzel, nika, marat};
    }
}
