class Solution:
    def findMin(self, nums: list[int]) -> int:
        minimum = nums[0]

        for num in nums:
            if num < minimum:
                minimum = num

        return minimum