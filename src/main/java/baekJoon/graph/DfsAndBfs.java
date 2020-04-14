package baekJoon.graph;

import java.util.*;

public class DfsAndBfs {
    static ArrayList<Integer>[] lists;
    static int node, edge, startNode;
    static boolean[] checks;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLineInput = scanner.nextLine();
        String[] inputArray = firstLineInput.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            node = Integer.parseInt(inputArray[0]);
            edge = Integer.parseInt(inputArray[1]);
            startNode = Integer.parseInt(inputArray[2]);
        }

        lists = new ArrayList[node + 1];

        for (int i = 1; i < node+1; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            lists[u].add(v);
            lists[v].add(u);
        }

        for (int i = 1; i < node+1; i++) {
            Collections.sort(lists[i]);
        }

        checks = new boolean[node+1];
        dfs(startNode);
        System.out.println();

        checks = new boolean[node+1];
        bfs(startNode);
        System.out.println();

        scanner.close();
    }

    private static void dfs(int x) {
        if (checks[x]) return;

        checks[x] = true;
        System.out.print(x + " ");
        for (int y : lists[x]) {
            if (!checks[y]) {
                dfs(y);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        checks[start] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x + " ");
            for (int y : lists[x]) {
                if (!checks[y]) {
                    checks[y] = true;
                    queue.add(y);
                }
            }
        }
    }
}
