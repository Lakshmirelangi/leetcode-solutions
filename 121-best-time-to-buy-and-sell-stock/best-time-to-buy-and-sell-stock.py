class Solution:
    def maxProfit(self, prices):
        minimum = prices[0]
        max_profit = 0

        for price in prices:
            minimum = min(minimum, price)
            profit = price - minimum
            max_profit = max(max_profit, profit)

        return max_profit