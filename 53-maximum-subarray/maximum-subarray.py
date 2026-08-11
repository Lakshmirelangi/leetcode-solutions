class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        globalsum = nums[0]
        currsum = nums[0]

        for n in nums[1:]:
            currsum = max(n, currsum + n)
            globalsum = max(globalsum, currsum)

        return globalsum