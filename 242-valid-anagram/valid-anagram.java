import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
       /* // IN valid anagram characters and frequency matters
        // check if both match if true otherwisw false

        // Step 1: Check lengths
        if(s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert strings to character arrays   //BRUTE FORCE APPROACH 
        char[] arr1 = s.toCharArray();            // time complexity : 0(n log n)
        char[] arr2 = t.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare arrays
        return Arrays.equals(arr1, arr2);*/

 if(s.length() != t.length()) {
            return false;
        }

        // Step 2: Create frequency array
        int[] count = new int[26];

        // Step 3: Traverse both strings
        for(int i = 0; i < s.length(); i++) {

            // Increase count for first string
            count[s.charAt(i) - 'a']++;

            // Decrease count for second string
            count[t.charAt(i) - 'a']--;
        }

        // Step 4: Check all counts become zero
        for(int value : count) {
            if(value != 0) {
                return false;
            }
        }

        return true;
    }
}
//Time Complexity:O(n)

//because we only traverse the strings.

//Space Complexity:O(1)

//because the array size is always fixed at 26.

