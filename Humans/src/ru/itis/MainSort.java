package ru.itis;

import java.util.Random;

/**
 * Created by marsel on 20.03.17.
 */
public class MainSort {
    public static void main(String[] args) {
        Human humans[] = new Human[100];
        Random random = new Random();

        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human("Human" + i,
                    random.nextInt(120));
        }

        HumansStack stacks[] = new HumansStack[120];

        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new HumansStack();
        }


        for (int i = 0; i < humans.length; i++) {
            stacks[humans[i].getAge()].push(humans[i]);
        }

        for (int i = 1; i < stacks.length; i++) {
            if (stacks[i].getCount() != 0) {
                stacks[0].addStack(stacks[i]);
            }
        }

        int stackCount = stacks[0].getCount();
        for (int i = 0; i < stackCount; i++) {
            Human human = stacks[0].pop();
            System.out.println(human.getName() + " " + human.getAge());
        }
    }
}
