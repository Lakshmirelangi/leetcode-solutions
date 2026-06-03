import java.util.Arrays;

class Solution {

    public int findContentChildren(int[] g, int[] s) {

        // Sort greed array
        Arrays.sort(g);

        // Sort cookie array
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        // Traverse both arrays
        while(child < g.length && cookie < s.length) {

            // If cookie satisfies child
            if(s[cookie] >= g[child]) {

                child++;   // next child
            }

            // Move to next cookie
            cookie++;
        }

        return child;
    }
}