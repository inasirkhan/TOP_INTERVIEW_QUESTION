package top150.twopointer;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> pair = new HashSet<>();

        for (int i=0;i<nums.length;i++){
            int j = i + 1;
            int k = nums.length-1;

            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (sum==0) {
                    pair.add(Arrays.asList(nums[i],nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum<0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        ans.addAll(pair);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println("PAIR WITH SOME GIVEN SUM "+threeSum(arr));
    }
}
