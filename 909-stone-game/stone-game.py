class Solution:
    def stoneGame(self, piles):

        memo = {}

        def solve(left, right):

            if left == right:
                return piles[left]

            if (left, right) in memo:
                return memo[(left, right)]

            take_left = piles[left] - solve(left + 1, right)
            take_right = piles[right] - solve(left, right - 1)

            memo[(left, right)] = max(take_left, take_right)

            return memo[(left, right)]

        return solve(0, len(piles) - 1) > 0