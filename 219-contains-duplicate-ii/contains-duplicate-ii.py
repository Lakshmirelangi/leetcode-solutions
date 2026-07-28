''''class Solution:
    def containsNearbyDuplicate(self, nums, k):
        n = len(nums)

        for i in range(n):
            for j in range(i + 1, n):
                if nums[i] == nums[j] and abs(i - j) <= k:
                    return True

        return False'''
class Solution:
    def containsNearbyDuplicate(self, nums, k):
        last_seen = {}

        for i, num in enumerate(nums):
            if num in last_seen:
                if i - last_seen[num] <= k:
                    return True

            last_seen[num] = i

        return False