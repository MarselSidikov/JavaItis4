package ru.itis.compare;

public class HumanHeightComparator implements Comparator<Human> {
    @Override
    public int compare(Human a, Human b) {
        return a.getHeight() - b.getHeight();
    }
}
