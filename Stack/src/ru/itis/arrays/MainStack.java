package ru.itis.arrays;

public class MainStack {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();

        arrayStack.push('a');
        arrayStack.push('b');
        arrayStack.push('c');

        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.peek());

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

    }
}
