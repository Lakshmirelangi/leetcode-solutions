class Solution {
    public int lengthOfLongestSubstring(String s) {
          /*int maxLength = 0;
          for(int i = 0;i<s.length();i++){
            HashSet<Character> set = new HashSet<>();//BRUTE FORCE APPROACH
            for(int j = i;j<s.length();j++){          //TIME COMPLEXITY:0(n^2)
                char ch = s.charAt(j);
                if(set.contains(ch)){
                 break;
                }
            
            set.add(ch);
            maxLength = Math.max(maxLength,j - i+1);
          }
        }
        return maxLength;
    }
          
    }*/

        int left = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0;right<s.length();right++){//TIME COMPLEXITY:0(n)
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength,right-left+1);//OPTIMIZED APPROACH

        }
        return maxLength;
        }
        
    }
