package ru.itis;

/**
 * 06.03.2017
 * Graph
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Graph {
    // столько вершин у меня в графе может быть
    private int vertexCount;
    // матрица смежности
    private int[][] matrix;

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        matrix = new int[vertexCount][vertexCount];
    }

    public void addEdge(int vertexI, int vertexJ) {
        matrix[vertexI][vertexJ] = 1;
        matrix[vertexJ][vertexI] = 1;
    }

    public void showMatrix() {
        System.out.print("  ");

        for (int i = 0; i < vertexCount; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < vertexCount; i++) {
            System.out.print("_ ");
        }
        System.out.println();

        for (int i = 0; i < vertexCount; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Получить количество соседних вершин заданной вершины
     * @param vertex номер вершины, количество соседей которой мы ищем
     * @return количество соседей
     */
    public int vertexDegree(int vertex) {
        int degreeResult = 0;
        for (int i = 0; i < vertexCount; i++) {
            degreeResult = degreeResult + matrix[vertex][i];
        }

        return degreeResult;
    }
}
