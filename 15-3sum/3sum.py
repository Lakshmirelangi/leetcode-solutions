class Solution:
    def threeSum(self, nums):

        # Step 1: Sort the array
        nums.sort()

        # Store all unique triplets
        result = []

        # Step 2: Fix one element at a time
        for i in range(len(nums) - 2):

            # Skip duplicate fixed elements
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            # Two pointers
            left = i + 1
            right = len(nums) - 1

            # Step 3: Find two numbers whose sum equals -nums[i]
            while left < right:

                current_sum = nums[i] + nums[left] + nums[right]

                # If sum is too small, increase it
                if current_sum < 0:
                    left += 1

                # If sum is too large, decrease it
                elif current_sum > 0:
                    right -= 1

                # Found a valid triplet
                else:
                    result.append([nums[i], nums[left], nums[right]])

                    # Skip duplicate values on the left
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1

                    # Skip duplicate values on the right
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    # Move both pointers
                    left += 1
                    right -= 1

        return result