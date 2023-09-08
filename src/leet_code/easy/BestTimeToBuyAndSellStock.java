package leet_code.easy;

/**
 * leetcode.com/problems/best-time-to-buy-and-sell-stock
 */

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] array = {7, 1, 5, 3, 6, 4};
        int result = BestTimeToBuyAndSellStock.maxProfit(array);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {

        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist; // profit if sold today

        for (int price : prices) {
            if (price < lsf) {
                lsf = price;
            }

            pist = price - lsf;

            if (op < pist) {
                op = pist;
            }
        }

        return op;
    }
}