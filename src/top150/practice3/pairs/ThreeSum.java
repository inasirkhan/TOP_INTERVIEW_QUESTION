package top150.practice3.pairs;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {
        int nums[] = {-2,0,1,1,2,2,-2,0};
        int[][] pairs = threeSumPair(nums, 0);
        for (int[] pair: pairs){
            System.out.println(Arrays.toString(pair));
        }
    }

    private static int[][] threeSumPair(int[] nums, int key) {
        int n = nums.length;
        int left, right;
        ArrayList<int[]> pairs = new ArrayList<>();
        for (int i=0;i<n-3;i++){
            if (i!=0 && nums[i]== nums[i-1]){
                continue;
            }
            left = i+1;
            right = n-1;

            while (left<right){
                if (nums[left]+nums[right]+nums[i]==key){
                    pairs.add(new int[]{nums[left],nums[right],nums[i]});
                    left++;
                    right--;
                } else if (nums[left]+nums[right]+nums[i]>key) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return pairs.toArray(new int[pairs.size()][]);
    }
}
