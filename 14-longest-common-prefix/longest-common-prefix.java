class Solution {
    public String longestCommonPrefix(String[] strs) {

        /*String prefix = "";

        String first = strs[0];

        for(int i = 0; i < first.length(); i++) {  //BRUTE FORCE APPROACH

            char ch = first.charAt(i);

            boolean same = true;

            for(int j = 1; j < strs.length; j++) {

                if(i >= strs[j].length() || strs[j].charAt(i) != ch) {

                    same = false;
                    break;
                }
            }

            if(same) {
                prefix = prefix + ch;
            }
            else {
                break;


                class Solution {

    public String longestCommonPrefix(String[] strs) {

        String first = strs[0];

        for(int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for(int j = 1; j < strs.length; j++) {

                // mismatch OR index out of bounds
                if(i >= strs[j].length() || strs[j].charAt(i) != ch) {

                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}
            }
        }

        return prefix;*/


        
        String first = strs[0];

        for(int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for(int j = 1; j < strs.length; j++) {

                // mismatch OR index out of bounds
                if(i >= strs[j].length() || strs[j].charAt(i) != ch) {

                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}
