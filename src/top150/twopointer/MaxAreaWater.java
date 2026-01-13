package top150.twopointer;

import java.util.Arrays;

public class MaxAreaWater {

    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        int min_height = 0;
        while (left<right) {

            int leftHeight = height[left];
            int rightHeight = height[right];
            min_height= Math.min(leftHeight, rightHeight);
            max = Math.max(min_height*(right-left), max);
            if (leftHeight<rightHeight){
                left++;
            }
            else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println("MAX WATER STORED IS : "+maxArea(heights));
    }
}
