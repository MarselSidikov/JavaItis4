package ru.itis;

public class HumanHeightComparator implements Comparator {
    @Override
    public int compare(Object a, Object b) {
        return ((Human)a).getHeight() - ((Human)b).getHeight();
    }
}
