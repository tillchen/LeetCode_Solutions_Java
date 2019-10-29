class Solution {
    public int maxProfit(int[] prices) {
        int i, j;
        if (prices.length < 2) {
            return 0;
        }
        int profit = prices[1] - prices[0];
        for (i = 0; i < prices.length - 1; i++) {
            for (j = i+1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        if (profit < 0) {
            return 0;
        }
        else {
            return profit;
        }
    }
}