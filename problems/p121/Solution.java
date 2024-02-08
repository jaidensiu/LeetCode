package problems.p121;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            if (price - min > profit) {
                profit = price - min;
            }
        }
        return profit;
    }
}