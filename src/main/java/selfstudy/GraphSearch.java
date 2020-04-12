package selfstudy;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

public class GraphSearch {

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
        graph.dfsR(3);
    }

    static class Queue<T> {

        class Node<T> {
            private T data;
            private Node<T> next;

            public Node(T data) {
                this.data = data;
            }
        }

        private Node<T> first;
        private Node<T> last;

        public void enqueue(T item) {
            Node<T> t = new Node<>(item);

            if (last != null) {
                last.next = t;
            }
            last = t;
            if (first == null) {
                first = last;
            }
        }

        public T dequeue() {
            if (first == null) {
                throw new NoSuchElementException();
            }

            T data = first.data;
            first = first.next;

            if (first == null) {
                last = null;
            }
            return data;
        }

        public T peek() {
            if (first == null) {
                throw new NoSuchElementException();
            }
            return first.data;
        }

        public boolean isEmpty() {
            return first == null;
        }


    }

    static class Graph {

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

            if (!n1.adjacent.contains(n2)) n1.adjacent.add(n2);
            if (!n2.adjacent.contains(n1)) n2.adjacent.add(n1);
        }

        void dfs() {
            dfs(0);
        }

        void dfs(int index) {
            Node root = nodes[index];
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            root.marked = true;

            while (!stack.isEmpty()) {
                Node r = stack.pop();
                for (Node n : r.adjacent) {
                    if (!n.marked) {
                        n.marked = true;
                        stack.push(n);
                    }
                }
                visit(r);
            }
        }

        void dfsR() {
            dfsR(0);
        }

        void dfsR(Node r) {
            if (r == null) return;
            r.marked = true;
            visit(r);
            for (Node n : r.adjacent) {
                if (!n.marked) {
                    dfsR(n);
                }
            }
        }

        void dfsR(int index) {
            Node r = nodes[index];
            dfsR(r);
        }

        void bfs() {
            bfs(0);
        }

        void bfs(int index) {
            Node root = nodes[index];
            Queue<Node> queue = new Queue<>();
            queue.enqueue(root);
            root.marked = true;

            while (!queue.isEmpty()) {
                Node r = queue.dequeue();
                for (Node n : r.adjacent) {
                    if (!n.marked) {
                        n.marked = true;
                        queue.enqueue(n);
                    }
                }
                visit(r);
            }
        }

        void visit(Node n) {
            System.out.print(n.data + " ");
        }

        class Node {
            int data;
            LinkedList<Node> adjacent;
            boolean marked;

            public Node(int data) {
                this.data = data;
                this.marked = false;
                adjacent = new LinkedList<>();
            }
        }
    }

}
