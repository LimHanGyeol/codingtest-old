package baekJoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getCard2(n));
    }

    private static int getCard2(int n) {
        Queue<Integer> queue = new LinkedList<>();
        initQueue(n, queue);

        while (queue.size() > 1) {
            queue.remove();
            int firstCard = queue.poll();
            queue.offer(firstCard);
        }

        return queue.peek();
    }

    private static Queue<Integer> initQueue(int n, Queue<Integer> queue) {
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        return queue;
    }


}
