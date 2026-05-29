class Solution {
    public boolean isPalindrome(String s) {
       

        /*String cleaned = "";

        // Remove special characters and convert to lowercase
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)) {//time complexity:O(n)
                cleaned += Character.toLowerCase(ch);//space :O(n) cleaned string and reverse string extra memory and space required
            }                                          
        // Reverse string
        String reversed = "";

        for(int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Compare
        return cleaned.equals(reversed);
    }
}*/
        int left = 0;//optimized approach
        int right = s.length()-1;
        while(left<right){
        while(left<right&&!Character.isLetterOrDigit(s.charAt(left))){
        left++;
        }
        while(left<right&&!Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
            return false;//time complexity:O(n)
            }            //space complexity:O(1)
            left++;
            right--;
        }
        return true;
    }
}