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

//        getVirusInfectionComputerDfsR(1);
//        getVirusInfectionComputerBfs(1);
//        System.out.println(count);
        System.out.println(getVirusInfectionComputerBfs(1));
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

    /**
     * @Refactoring
     * 1. private static boolean -> private static int
     * 2. for (int j -> int y
     * 3. int tempNumber; tempNumber = queue.poll(); -> int tempNumber = queue.poll();
     */
    private static int getVirusInfectionComputerBfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            int tempNumber = queue.poll();

            for (int y = 1; y <= node; y++) {
                if (graph[tempNumber][y] == 1 && !visited[y]) {
                    queue.offer(y);
                    visited[y] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
