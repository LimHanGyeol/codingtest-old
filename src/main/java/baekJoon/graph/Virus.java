package baekJoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Title
 * Virus Infection
 * @Content
 * DFS And BFS
 */
public class Virus {

    private static int[][] graph;
    private static boolean[] visited;
    private static int node;
    private static int edge;
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== input ===");
        node = scanner.nextInt();
        graph = new int[node+1][node+1];
        edge = scanner.nextInt();
        visited = new boolean[node+1];

        System.out.println("=== node input");
        graph = initGraph(scanner, graph);

        getVirusInfectionComputerDfsR(1);
//        getVirusInfectionComputerBfs(1);
        System.out.println(count);
    }

    private static int[][] initGraph(Scanner scanner, int[][] graph) {
        int x, y;
        for (int i = 1; i <= edge; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();

            graph[x][y] = graph[y][x] = 1;
        }
        return graph;
    }

    private static void getVirusInfectionComputerDfsR(int startNode) {
        visited[startNode] = true;
        for (int i = 1; i<= node; i++) {
            if (graph[startNode][i] == 1 && !visited[i]) {
                count++;
                getVirusInfectionComputerDfsR(i);
            }
        }
    }

    private static boolean getVirusInfectionComputerBfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        visited[startNode] = true;

        int tempNumber;
        while (!queue.isEmpty()) {
            tempNumber = queue.poll();

            for (int j = 1; j <= node; j++) {
                if (graph[tempNumber][j] == 1 && !visited[j]) {
                    queue.offer(j);
                    visited[j] = true;
                    count++;
                }
            }
        }
        return false;
    }
}
