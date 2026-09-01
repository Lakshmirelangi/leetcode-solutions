class Solution:
    def countWays(self, nums):
        nums.sort()
        n = len(nums)
        ans = 0

        for k in range(n + 1):
            left_ok = (k == 0 or nums[k - 1] < k)
            right_ok = (k == n or nums[k] > k)

            if left_ok and right_ok:
                ans += 1

        return ans