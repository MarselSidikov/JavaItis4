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

    // порядок посещенности
    // если visited[2] = 5;, это значит что вторая вершина была посещена пятой
    private int visited[];

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        matrix = new int[vertexCount][vertexCount];
        visited = new int[vertexCount];
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
            degreeResult = degreeResult + 1;
        }

        return degreeResult;
    }

    /**
     * функция возвращает номер вершины с максимальным количеством соседей
     * @return
     */
    public int maxDegreeVertex() {
        int maxDegree = 0;
        int maxDegreeVertex = 0;

        for (int i = 0; i < vertexCount; i++) {
            if (maxDegree < vertexDegree(i)) {
                maxDegree = vertexDegree(i);
                maxDegreeVertex = i;
            }
        }

        return maxDegreeVertex;
    }

    public int[] getNeighbors(int vertex) {
        // подготавливаем массив для соседей
        int neighbors[] = new int[vertexDegree(vertex)];
        // счетчик соседей
        int k = 0;
        for (int i = 0; i < vertexCount; i++) {
            // если нашли соседа
            if (matrix[vertex][i] != 0) {
                // добавляем в массив
                neighbors[k] = i;
                k++;
            }
        }

        return neighbors;
    }

    public void printGraphFormat() {
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
    }

    /**
     * Получить массив всех непросмотренных соседей
     * @param vertex вершина, соседей которой мы ищем
     * @return массив непросмотренных соседей
     */
    private int[] getUnvisitedNeighbors(int vertex) {
        // получили всех соседей
        int allNeighbors[] = getNeighbors(vertex);

        int unvisitedNeighbors[] = new int[vertexCount];
        int countOfUnvisitedNeighbors = 0;
        // получить список непросмотренных
        for (int i = 0; i < allNeighbors.length; i++) {
            if (visited[allNeighbors[i]] == 0) {
                unvisitedNeighbors[countOfUnvisitedNeighbors] = allNeighbors[i];
                countOfUnvisitedNeighbors++;
            }
        }
        int result[] = new int[countOfUnvisitedNeighbors];
        for (int i = 0; i < countOfUnvisitedNeighbors; i++) {
            result[i] = unvisitedNeighbors[i];
        }
        return result;
    }

    public void depthFirstSearch(int startVertex) {
        // Стек
        Stack stack = new Stack();
        // шаг посещения
        int visitedStep = 1;
        // говорим, что посетили начальную вершину
        visited[startVertex] = visitedStep;
        // увеличи шаг посещение
        visitedStep++;
        // кидаем начальную вершину в стек
        stack.push(startVertex);

        // пока стек не пуст
        while (stack.getCount() != 0) {
            // смотрим последнюю вершину стека
            int lastVertex = stack.peek();
            // если еще остались непосещенные соседи
            if (getUnvisitedNeighbors(lastVertex).length > 0) {
                // берем первого непосещенного соседа вершины lastVertex
                int unvisitedNeighbor = getUnvisitedNeighbors(lastVertex)[0];
                // посещаю
                visited[unvisitedNeighbor] = visitedStep;
                // увеличиваю шаг посещения
                visitedStep++;
                // кладем уже теперь посещенного соседа в стек
                stack.push(unvisitedNeighbor);
            } else {
                // если больше соседей у вершины нет, то вытаскиваем
                stack.pop();
            }
        }

        for (int i = 0; i < visited.length; i++) {
            System.out.println("Vertex " + i + " was visited " + visited[i]);
        }
    }
}
