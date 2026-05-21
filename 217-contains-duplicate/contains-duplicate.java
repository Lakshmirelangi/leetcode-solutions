class Solution {
    public boolean containsDuplicate(int[] nums) {

        
       /* // Compare every element with every other element
       Time Complexity:O(n^2)//because nested loops are used.

Space Complexity:O(1)//because no extra data structure is used.
        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                // If duplicate found
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
return false;       // No duplicates found
        */
    
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            if(set.contains(nums[i])){   //Time complexity:0(n)
                return true;             //space complexity:0(n)
            }
            set.add(nums[i]);
        }
        return false;
    }
}