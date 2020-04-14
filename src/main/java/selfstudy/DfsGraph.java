package selfstudy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Title DPS(Depth First Search)
 * @Comment
 * Adjacency Matrix
 * Adjacency List
 */
public class DfsGraph {
    private int node;
    private int[][] adjacencyMatrix;
    private boolean[] visitArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nV = scanner.nextInt();
        int nE = scanner.nextInt();

        DfsGraph dfsGraph = new DfsGraph(nV);

        dfsGraph.put(1, 2);
        dfsGraph.put(1, 3);
        dfsGraph.put(2, 4);
        dfsGraph.put(2, 5);
        dfsGraph.put(3, 6);
        dfsGraph.put(3, 7);
        dfsGraph.put(4, 8);
        dfsGraph.put(5, 8);
        dfsGraph.put(6, 8);
        dfsGraph.put(7, 8);

        scanner.close();

        dfsGraph.printGraph();

        for (int i = 1; i <= nV; i++) {
            System.out.println();
            System.out.print("node "+i +" search");
            dfsGraph.clearVisitArray();
            dfsGraph.dfs(i);
        }
    }

    public DfsGraph(int node) {
        this.node = node;

        // Graph init
        this.adjacencyMatrix = new int[this.node+1][this.node+1];
        this.visitArray = new boolean[this.node+1];
    }

    public int[][] getAdjacencyMatrix() {
        return this.adjacencyMatrix;
    }

    public void put(int x, int y) {
        this.adjacencyMatrix[x][y] = this.adjacencyMatrix[y][x] = 1;
    }

    public void putSingle(int x, int y) {
        this.adjacencyMatrix[x][y] =1;
    }

    // AdjacencyMatrix Graph Print
    public void printGraph() {
        for (int i = 0; i < this.adjacencyMatrix.length; i++) {
            for (int j = 0; j < this.adjacencyMatrix[i].length; j++) {
                System.out.print(" " + this.adjacencyMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public void clearVisitArray() {
        for (int i = 0; i < this.visitArray.length; i++) {
            this.visitArray[i] = false;
        }
    }

    public void dfs(int index) {
        this.visitArray[index] = true;
        System.out.print(index + " ");

        for (int i = 1; i <= this.node; i++) {
            if (adjacencyMatrix[index][i] == 1 && !visitArray[i]) {
                dfs(i); // Recursion
            }
        }
    }
}
