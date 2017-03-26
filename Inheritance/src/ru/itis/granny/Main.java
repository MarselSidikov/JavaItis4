package ru.itis.granny;

public class Main {

    public static void main(String[] args) {
        Granny granny = new Granny("Nina", 99,
                5, "Green");

        granny.grandsonsFeed();

        Shawl shawl = granny.shawlMake("Blue");

        System.out.println(shawl.getColor());

        BatmanGranny batmanGranny = new BatmanGranny("Ninator", 119,
                2, "Black", 2, "B77AT");

        batmanGranny.enemiesCatch();

        Shawl batShawl = batmanGranny.shawlMake("Bat color");

        System.out.println(batShawl.getColor());

        batmanGranny.grandsonsFeed();
    }
}
