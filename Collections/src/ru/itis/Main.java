package ru.itis;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Human> humansArrayList = new ArrayList<Human>();
	    humansArrayList.add(new Human(1, 23, "Marsel"));
        System.out.println(humansArrayList.get(0));

        Human marsel = humansArrayList.get(0);

        ArrayList<Triangle> trianglesArrayList = new ArrayList<Triangle>();
        trianglesArrayList.add(new Triangle(2, 3, 4));

        Triangle triangle = (Triangle)trianglesArrayList.get(0);

        // trianglesArrayList.add(marsel);

        triangle = (Triangle)trianglesArrayList.get(0);
    }
}
