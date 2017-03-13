package ru.itis;

/**
 * 13.03.2017
 * MainBrackets
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainBrackets {
    public static void main(String[] args) {
        char brackets[] = "{[{()}{()}]}[]()".toCharArray();

        Stack stack = new Stack();
        boolean allOk = true;

        for (int i = 0; i < brackets.length; i++) {
            if (brackets[i] == '{'
                    || brackets[i] =='['
                    || brackets[i] == '(') {
                stack.push(brackets[i]);
            } else {
                if (stack.getCount() > 0) {
                    char lastFromStack = stack.peek();
                    if (brackets[i] == ')' && lastFromStack == '('
                            || brackets[i] == ']' && lastFromStack == '['
                            || brackets[i] == '}' && lastFromStack == '{') {
                        stack.pop();
                    }
                } else {
                    allOk = false;
                    break;
                }
            }
        }

        if (stack.getCount() > 0) {
            allOk = false;
        }

        System.out.println(allOk);

        int i = 0;
    }
}
