'''class Solution:
    def twoSum(self, nums, target):
        n = len(nums)

        for i in range(n):
            for j in range(i + 1, n):
                if nums[i] + nums[j] == target://brute force approach
                    return [i, j]'''

class Solution:
    def twoSum(self, nums, target):
        seen = {}

        for i in range(len(nums)):
            complement = target - nums[i]

            if complement in seen:
                return [seen[complement], i]

            seen[nums[i]] = i