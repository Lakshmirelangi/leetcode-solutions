class Solution {
    public int maxProfit(int[] prices) {
       

        // Assume first price as minimum buying price
        int minPrice = prices[0];

        // Initially no profit
        int maxProfit = 0;

        // Traverse array from index 1
        for(int i = 1; i < prices.length; i++) {

            // Update minimum price
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate current profit
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
