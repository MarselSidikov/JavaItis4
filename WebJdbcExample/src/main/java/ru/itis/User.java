package ru.itis;

/**
 * 10.05.2017
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class User {
    private int id;
    private String name;
    private int age;
    private int height;
    private String style;

    public User(int id, String name, int age, int height, String style) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.style = style;
    }

    public User(String name, int age, int height, String style) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.style = style;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", style='" + style + '\'' +
                '}';
    }
}
