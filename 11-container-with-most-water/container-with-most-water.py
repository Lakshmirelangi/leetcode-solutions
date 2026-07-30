class Solution:
    # height is the input array
    def maxArea(self, height):

        # Left pointer starts from the first index
        left = 0

        # Right pointer starts from the last index
        right = len(height) - 1

        # Stores the maximum area found so far
        max_water = 0

        # Continue until both pointers meet
        while left < right:

            # Width is the distance between the indices
            width = right - left

            # The shorter wall limits the water level
            current_height = min(height[left], height[right])

            # Calculate the current area
            area = width * current_height

            # Update the maximum area if the current area is larger
            max_water = max(max_water, area)

            # Move the pointer pointing to the shorter wall
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        # Return the maximum water stored
        return max_water