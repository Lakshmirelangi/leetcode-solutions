class Solution:
    def longestConsecutive(self, nums):
        nums_set = set(nums)
        longest = 0

        for num in nums_set:

            # Check whether num is the beginning
            # of a consecutive sequence
            if num - 1 not in nums_set:

                current = num
                length = 1

                # Find consecutive numbers
                while current + 1 in nums_set:
                    current += 1
                    length += 1

                longest = max(longest, length)

        return longest