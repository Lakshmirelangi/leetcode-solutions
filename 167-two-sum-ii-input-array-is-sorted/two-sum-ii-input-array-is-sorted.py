class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
      i=0
      j=len(nums)-1
      while i<j:
        total = nums[i]+nums[j]
        if total==target:
            return[i+1,j+1]
        elif total>target:
            j-=1
        else:
            i+=1
    
