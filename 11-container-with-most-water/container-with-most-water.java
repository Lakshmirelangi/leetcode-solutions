/*class Solution{

    public static int maxArea(int[] height) {

        int maxWater = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int width = j - i;

                int minHeight = Math.min(height[i], height[j]);

                int currentWater = width * minHeight;

                if (currentWater > maxWater) {
                    maxWater = currentWater;//brute force approach
                }
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(height));
    }
}*/


class Solution {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {

            int width = right - left;

            int minHeight = Math.min(height[left], height[right]);//optimized approach

            int currentWater = width * minHeight;

            maxWater = Math.max(maxWater, currentWater);//time complexity:O(n)

            // Move smaller pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}