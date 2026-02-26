package top150.leetCode;

import java.util.Arrays;

public class ThreeSumClosest {

        public static int threeSumClosest(int[] nums, int target) {
            int n = nums.length;
            int start,end;
            int sum =0;
            int resultSum =0;
            int minDiff = Integer.MAX_VALUE;
            Arrays.sort(nums);
            for(int i=0;i<n-2;i++){
                start  = i+1;
                end = n-1;
                while(start<end){
                    sum= nums[i]+nums[start]+nums[end];
                    if(sum == target)
                        return sum;
                    else if (sum<target){
                        start++;
                    }
                    else{
                        end--;
                    }

                    int diff = Math.abs(sum-target);
                    if(diff<minDiff){
                        resultSum = sum;
                        minDiff = diff;
                    }
                }


            }
            return resultSum;
        }

    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        int i = threeSumClosest(arr, target);
        System.out.println(i);
    }
}
