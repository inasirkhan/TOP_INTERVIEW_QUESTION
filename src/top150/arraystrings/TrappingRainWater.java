package top150.arraystrings;

import java.util.Arrays;

public class TrappingRainWater {

        public static int trap(int[] height) {
            int maxWater = 0;
            int n = height.length;
            int[] leftMax = new int[height.length], rightMax = new int[height.length];

            leftMax[0] = height[0];
            for (int i=1;i<n;i++){
                leftMax[i] = Math.max(leftMax[i-1],height[i]);
            }
            System.out.println("LEFT MAX :: "+Arrays.toString(leftMax));
            rightMax[n-1] = height[n-1];
            for (int j=n-2;j>=0;j--){
                rightMax[j] = Math.max(rightMax[j+1], height[j]);
            }
            System.out.println("RIGHT MAX :: "+ Arrays.toString(rightMax));
            for (int i=0;i<n;i++){
                maxWater+= Math.min(leftMax[i], rightMax[i])- height[i];
            }
            return maxWater;
        }

        public static void main(String[] args) {
            int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
            System.out.println("TOTAL WATER TRAPPED IS : "+trap(heights));
        }
}
