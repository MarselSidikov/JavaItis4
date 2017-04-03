package ru.itis.compare;

public class MainOther {

    public static <T> T min(T objects[], Comparator<T> comparator) {
        T min = objects[0];
        for (int i = 1; i < objects.length; i++) {
            int compareResult;
            if (comparator == null) {
                compareResult = ((Comparable<T>)min).compareTo(objects[i]);
            } else {
                compareResult = comparator.compare(min, objects[i]);
            }

            if (compareResult > 0) {
                min = objects[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        /*
        Human marsel =
                new Human("Marsel", 23, 185);
        Rectangle rectangle = new Rectangle(10, 5);

        Human guzel =
                new Human("Guzel", 18, 178);

        System.out.println(marsel.equals(guzel));

        System.out.println(marsel.equals(rectangle));

        marsel.compareTo(guzel);
        */
        Human marsel = new Human("Marsel", 23, 185);
        Human guzel = new Human("Guzel", 18, 178);
        Human maksim = new Human("Maksim", 14, 169);
        Human sergey = new Human("Sergey", 16, 182);
        Human veronika = new Human("Verokina", 16, 160);
        Human marat = new Human("Marat", 16, 183);
        Human ruslan = new Human("Ruslan", 16, 181);

        Human humans[] = {marsel, guzel, maksim, sergey, veronika, marat, ruslan};

        Human min = min(humans, new HumanHeightComparator());
        System.out.println(min);

    }
}
