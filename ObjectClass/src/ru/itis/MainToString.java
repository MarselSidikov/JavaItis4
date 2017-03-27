package ru.itis;

public class MainToString {

    public static void main(String[] args) {
	    Human human = new Human("Marsel", 23);
	    String humanAsString = human.toString();
        System.out.println(humanAsString);

        System.out.println(human);
    }
}
