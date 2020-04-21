package programmers.level2;

import java.util.*;

public class StockPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static int[] getStockPrice(int[] prices) {
        Queue<Integer> queue = new LinkedList<>();
        Iterator<Integer> iterator;
        int[] notFallenPrices = new int[prices.length];

        for (int price : prices) {
            queue.offer(price);
        }

        int price, count;

        for (int i = 0; i < prices.length; i++) {
            price = queue.poll();
            iterator = queue.iterator();
            count = 0;

            while (iterator.hasNext()) {
                count++;
                if (price > iterator.next()) {
                    notFallenPrices[i] = count;
                    break;
                }
            }

            if (i == prices.length-1) { // 마지막 index
                notFallenPrices[i] = 0;
            } else if (notFallenPrices[i] == 0) {
                notFallenPrices[i] = count;
            }
        }
        return notFallenPrices;
    }
}
