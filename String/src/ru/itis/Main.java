package ru.itis;

public class Main {

    public static void main(String[] args) {
	    char text[] = {'H', 'e', 'l', 'l', 'o', '0'};

	    String stringText = "Hello, Marsel";

	    MyString string = new MyString(text);
	    MyString otherString = new MyString(new char[]{'H','e','l','l','o'});
		System.out.println(string.equals(otherString));

		char text2[] = "Hello, my name".toCharArray();
    }
}
