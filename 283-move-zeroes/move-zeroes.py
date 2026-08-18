class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        k = 0
        for i in range(len(nums)):#non-zero elements in the front
            if nums[i] != 0:
                nums[k] = nums[i]
                k += 1
        for i in range(k,len(nums)):#fill remaining positions with zero
            nums[i] = 0
