class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        for(int i = 0; i<nums.length; i++){//TIME COMPLEXITY:O(n)
            currentSum = currentSum+nums[i];//SPACE COMPLEXITY:O(1)
        
        if(currentSum>maxSum){
            maxSum = currentSum;
        }
        if(currentSum<0){
            currentSum = 0;
        }
        
        }
        return maxSum;
    } 
}

//“If currentSum becomes negative, carrying it forward will only reduce the future subarray sum. So we discard it and start a new subarray.”
//kadane's algorithm:Keep adding elements
//Track maximum sum       why reset:-Negative sum decreases future subarray sum.
//f current sum becomes negative → reset to 0