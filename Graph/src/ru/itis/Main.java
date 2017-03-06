package ru.itis;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        graph.showMatrix();

        System.out.println(graph.vertexDegree(1));

    }
}
