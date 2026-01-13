package top150.interview;

import java.util.Arrays;
import java.util.HashMap;

public class PairWithGivenSum {

    public static int[] PairSum(int[] arr, int sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(sum-arr[i])){
                return new int[]{map.get(sum-arr[i]),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,1,11,15,3};
        int target = 10;
        System.out.println(Arrays.toString(PairSum(arr,target)));
    }
}
