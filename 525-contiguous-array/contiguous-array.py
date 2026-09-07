class Solution:
    def findMaxLength(self, nums):
        prefix_sum = 0
        first_seen = {0: -1}
        max_length = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                prefix_sum -= 1
            else:
                prefix_sum += 1

            if prefix_sum in first_seen:
                length = i - first_seen[prefix_sum]
                max_length = max(max_length, length)
            else:
                first_seen[prefix_sum] = i

        return max_length