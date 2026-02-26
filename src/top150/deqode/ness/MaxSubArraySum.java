package top150.deqode.ness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArraySum {

    public static int[]  maxSubArraySum(int[] arr){
        int n = arr.length;
        int start = 0, end =0;
        int currentSum = arr[0];
        int maxSum = arr[0];
        int tempStart =0;

        for (int i=1;i<n;i++){
            if (arr[i]>currentSum+arr[i]){
                currentSum= arr[i];
                tempStart =i;
            }
            else {
                currentSum+=arr[i];
            }
            if (currentSum>maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        List<Integer> subArray = new ArrayList<>();
        for (int j=start;j<=end;j++){
            subArray.add(arr[j]);
        }
        return subArray.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int maxSubArray(int[] nums) {

        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        Output: 6
//        Explanation: The subarray [4,-1,2,1] has the largest sum 6.
        System.out.println(Arrays.toString(maxSubArraySum(nums)));
        System.out.println(maxSubArray(nums));
    }
}
