package ru.itis;

import ru.itis.models.Human;
import ru.itis.lists.HumansArrayList;
import ru.itis.lists.IntegerArrayList;
import ru.itis.lists.ObjectsArrayList;

public class Main {

    public static void main(String[] args) {
	    IntegerArrayList list = new IntegerArrayList();
	    list.add(6);
	    list.add(7);

        System.out.println(list.get(1));

        HumansArrayList humansArrayList = new HumansArrayList();
        humansArrayList.add(new Human(23, "Marsel"));
        humansArrayList.add(new Human(18, "Guzel"));

        System.out.println(humansArrayList.get(1).getName());

        ObjectsArrayList objectsArrayList = new ObjectsArrayList();
        objectsArrayList.add(new Human(16, "Veronika"));
        objectsArrayList.add("Guzel");
        objectsArrayList.add(new Human(16, "Serj"));

        String name = (String)objectsArrayList.get(0);
        Human veronika = (Human)objectsArrayList.get(1);
        Human serj = (Human)objectsArrayList.get(2);

        System.out.println(name +" " +  veronika.getName() + " " + serj.getName());
    }
}
