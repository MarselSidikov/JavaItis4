package ru.itis.models;

public class Superhero implements Human {
    private int age;
    private String superSkill;

    public Superhero(int age, String superSkill) {
        this.age = age;
        this.superSkill = superSkill;
    }

    public int getAge() {
        return age;
    }

    public String getSuperSkill() {
        return superSkill;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "age=" + age +
                ", superSkill='" + superSkill + '\'' +
                '}';
    }
}
