class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i<n;i++){
            int newIndex = (i+k)%n;
            result[newIndex] = nums[i];        }//OPTIMIZED APPROACH
            for(int i = 0;i<n;i++){
                nums[i] = result[i];
            }
           
        /*int n = nums.length;

        k = k % n;

        for(int i = 0; i < k; i++) {

            int last = nums[n - 1];

            for(int j = n - 1; j > 0; j--) {//brute force approach
                nums[j] = nums[j - 1];
            }

            nums[0] = last;
        }*/
    }
}