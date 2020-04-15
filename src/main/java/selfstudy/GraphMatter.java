package selfstudy;

import java.util.LinkedList;

/**
 * @Title Graph에서 두개의 노드가 서로 찾아갈 수 있는 경로가 있는지 확인하는 함수를 구현하라.
 * @Content 시작점을 기준으로 조금씩 영역을 넓혀나가는 BFS로 구현.
 * 0
 * /
 * 1 -- 3    7
 * |  / | \ /
 * | /  |  5
 * 2 -- 4   \
 * 6 - 8
 */
public class GraphMatter {

    public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 6);
        graph.addEdge(5, 7);
        graph.addEdge(6, 8);

        /*
            0
           /
          1 -- 3    7
          |  / | \ /
          | /  |  5
          2 -- 4   \
                    6 - 8
         */
        System.out.println(graph.search(1, 8));
    }


    private static class Graph {

        Node[] nodes;

        public Graph(int size) {
            nodes = new Node[size];
            for (int i = 0; i < size; i++) {
                nodes[i] = new Node(i);
            }
        }

        void addEdge(int i1, int i2) {
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];
            if (!n1.adjacent.contains(n2)) {
                n1.adjacent.add(n2);
            }
            if (!n2.adjacent.contains(n1)) {
                n2.adjacent.add(n1);
            }
        }

        void initMarks() {
            for (Node n : nodes) {
                n.marked = false;
            }
        }

        boolean search(int i1, int i2) {
            return search(nodes[i1], nodes[i2]);
        }

        boolean search(Node start, Node end) {
            initMarks();
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(start);
            while (!queue.isEmpty()) {
                Node root = queue.removeFirst();
                if (root == end) {
                    return true;
                }
                for (Node n : root.adjacent) {
                    if (n.marked == false) {
                        n.marked = true;
                        queue.add(n);
                    }
                }
            }
            return false;
        }


        private class Node {
            int data;
            boolean marked;
            LinkedList<Node> adjacent;

            public Node(int data) {
                this.data = data;
                this.marked = false;
                this.adjacent = new LinkedList<>();
            }
        }


    }
}
