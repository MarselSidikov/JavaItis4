package ru.itis;

public class MainStack {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push('a');
        stack.push('b');
        stack.push('c');

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
