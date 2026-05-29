class Solution {

    public String minWindow(String s, String t) {

        /*String ans = "";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);//time complexity:O(n^3)

                if (isValid(sub, t)) {

                    if (sub.length() < minLen) {
                        minLen = sub.length();
                        ans = sub;
                    }
                }
            }
        }

        return ans;
    }

    public boolean isValid(String sub, String t) {

        int[] freq = new int[128];

        // Count substring characters
        for (int i = 0; i < sub.length(); i++) {
            freq[sub.charAt(i)]++;
        }

        // Check target characters
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (freq[ch] == 0) {
                return false;
            }

            freq[ch]--;
        }

        return true;
    }
}*/


//OPTIMIZED APPROACH time compexity:O(n)
//Expand to satisfy condition.
//Shrink to optimize answer.
        // Frequency array for target string
        int[] freq = new int[128];

        // Store frequency of characters in t
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int left = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Expand window
        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            // If character needed
            if (freq[rightChar] > 0) {
                count--;
            }

            // Reduce frequency
            freq[rightChar]--;

            // Valid window found
            while (count == 0) {

                // Update minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                // Remove left character
                freq[leftChar]++;

                // Window becomes invalid
                if (freq[leftChar] > 0) {
                    count++;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}