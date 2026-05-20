

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       /* for(int i = 0; i < nums.length; i++) {
            for(int j = i+1;j<nums.length;j++){   //BRUTE FORCE APPROACH
                if(nums[i]+nums[j] == target){    //time complexity O(n^2)
                    return new int[]{i,j};        //space complexity 0(1)
                }
            }
            
        }
        
        return new int[] {};*/

        //OPTIMIZED APPROACH
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
             int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);

        }
return new int[]{};
    }
}
