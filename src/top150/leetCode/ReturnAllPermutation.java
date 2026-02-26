package top150.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReturnAllPermutation {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permutation(nums,0,res);
        return res;
    }

    public static void permutation(int[] nums,int idx,List<List<Integer>> res){
        if (idx == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int num : nums) list.add(num);
            res.add(list);
            return;
        }

        for (int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            permutation(nums,idx+1,res);
            swap(nums,idx,i);
        }
    }

    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
        //        Given list = (1,2,4,7,10,11,18), modify it to find the even number list only and then find the average.
        int[] list = {1,2,4,7,10,11,18};
        OptionalDouble average = Arrays.stream(list).boxed().filter(n -> n % 2 == 0).mapToInt(Integer::intValue)
                .average();
        System.out.println(average);
    }
}
