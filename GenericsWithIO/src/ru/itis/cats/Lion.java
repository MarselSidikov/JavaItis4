package ru.itis.cats;

public class Lion extends Cat {

    private int countOfLionsChildren;

    public Lion(String name, int countOfLionsChildren) {
        super(name);
        this.countOfLionsChildren = countOfLionsChildren;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Lion)) {
            Lion that = (Lion)object;
            return this.countOfLionsChildren == that.countOfLionsChildren;
        } else {
            return false;
        }
    }
}
