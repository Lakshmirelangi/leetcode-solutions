class Solution {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {

            // Update minimum price
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}