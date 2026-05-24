class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*int n = nums.length;
        int[] result = new int[n];
        for(int i = 0;i<n;i++){
            int product = 1;
        for(int j= 0;j<n;j++){
            if(i != j){
                product = product*nums[j]; //BRUTE FORCE APPROACH 
            }                                TIME COMPLEXITY:0(n^2)
        }                                     SPACE COMPLEXITY:0(n)
        result[i] = product;
        }
    return result;*/



//  OPTIMIZED APPROACH
        int n = nums.length;

        int[] result = new int[n];

        // STEP 1: Store left products
        result[0] = 1;

        for(int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];//TIME COMPLEXITY:0(n)
        }                                           //SPACE COMPLEXITY:0(1)

        // STEP 2: Multiply right products
        int rightProduct = 1;

        for(int i = n - 1; i >= 0; i--) {

            result[i] = result[i] * rightProduct;

            rightProduct = rightProduct * nums[i];
        }

        return result;
    }
}
