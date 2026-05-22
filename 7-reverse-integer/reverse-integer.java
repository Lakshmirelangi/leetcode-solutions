class Solution {
    public int reverse(int x) {
        /*while(x!=0){
            int digit = x%10;   //BRUTE FORCE APPROACH
            rev = rev*10+digit;
            x = x/10;
        }
        return rev;*/

        //optimized approach the tiem and space complexity for both approaches is same TIME COMPLEXITY:0(log10 n) and SPACE COMPLEXITY:0(1)
       int rev = 0;
        while(x!=0){
            int digit = x%10;
             x = x/10;
             if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10){
             return 0;
        }
        rev = rev*10+digit;

        }

        return rev;
        
    }
}