package baekJoon.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Title
 * 백준 1260번 문제 DFS와 BFS 반복 숙달
 */
public class DfsAndBfs2 {

    static int[][] graph; // Adjacency Matrix 인접 행렬로 그래프 파악
    static boolean[] visited;
    static int N; // Node
    static int E; // Edge
    static int startNode;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==input==");
        N = scanner.nextInt();
        graph = new int[1001][1001];
        E = scanner.nextInt();
        visited = new boolean[10001];
        startNode = scanner.nextInt();

        int a, b;
        System.out.println("==node input==");
        for (int i = 1; i <= E; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(startNode);

        for (int i = 1; i <= N; i++) {
            visited[i] = false;
        }

        System.out.println();
        bfs(startNode);
    }

    public static void dfs(int i) {
        visited[i] = true;
        System.out.print(i + " ");

        for (int j = 1; j <= N; j++) {
            if (graph[i][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }

    public static void bfs(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i] = true;
        System.out.print(i + " ");

        int tempNumber;
        while (!queue.isEmpty()) {
            tempNumber = queue.poll();
            for (int j = 0; j < N+1; j++) {
                if (graph[tempNumber][j] == 1 && !visited[j]) {
                    queue.offer(j);
                    visited[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }




}
