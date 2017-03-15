package ru.itis;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(5, 6);

        graph.showAllConnectedComponents();

        /**
        int path[] = graph.depthFirstSearch(6);

        for (int i = 0; i < path.length; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println();
        System.out.println("----------------");
        graph.breadthFirstSearch(6);


        graph.showAllConnectedComponents();
        /*
        graph.showMatrix();

        System.out.println(graph.vertexDegree(1));
        System.out.println(graph.maxDegreeVertex());

        int n[] = graph.getNeighbors(1);

        for (int i = 0; i < n.length; i++ ) {
            System.out.print(n[i] + " ");
        }

        System.out.println("--");
        graph.printGraphFormat();
        */
    }
}
