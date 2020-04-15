package baekJoon.graph;

import java.util.*;

public class DfsAndBfs {
    static ArrayList<Integer>[] list;
    static int node;
    static boolean[] marked;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        node = scanner.nextInt();
        int edge = scanner.nextInt();
        int startNode = scanner.nextInt();

        list = new ArrayList[node+1];

        for (int i = 1; i < node+1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            list[u].add(v);
            list[v].add(u);
        }

        for (int i = 1; i < node+1; i++) {
            Collections.sort(list[i]);
        }
        marked = new boolean[node+1];
        dfs(startNode);
        System.out.println();

        marked = new boolean[node+1];
        bfs(startNode);
        System.out.println();

        scanner.close();
    }

    private static void dfs(int x) {
        if (marked[x]) {
            return;
        }
        marked[x] = true;
        System.out.println(x + " ");
        for (int y : list[x]) {
            if (!marked[y]) {
                dfs(y);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        marked[start] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.println(x + " ");
            for (int y : list[x]) {
                if (!marked[y]) {
                    marked[y] = true;
                    queue.add(y);
                }
            }
        }
    }

}
