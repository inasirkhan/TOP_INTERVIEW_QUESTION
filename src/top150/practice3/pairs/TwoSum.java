package top150.practice3.pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[][] twoSum(int[] arr , int sum){
        int n = arr.length;
        ArrayList<int[]> pairs = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if (map.containsKey(sum-arr[i])){
                pairs.add(new int[]{sum-arr[i],arr[i]});
            }
            map.put(arr[i],i);
        }

        return pairs.toArray(new int[pairs.size()][]);
    }

    public static int[][] TwoSumOptimized(int[] arr, int key){
        int left = 0;
        int right = arr.length-1;
        Arrays.sort(arr);
        ArrayList<int[]> list = new ArrayList<>();
        while (left<right){
            if (arr[left]+arr[right]==key){
                list.add(new int[]{arr[left],arr[right]});
                left++;
                right--;
            }
            else if (arr[left]+arr[right]>key){
                right--;
            }
            else {
                left++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }


    public static void main(String[] args) {
        int[] arr = {3,5,2,2,4,1,6,-1,5};
        int[][] pairs = twoSum(arr, 6);
        System.out.println("TWO SUM RESPONSE");
        System.out.println("*****************************");
        for (int[] pair : pairs){
            System.out.println(Arrays.toString(pair));
        }
        System.out.println("*****************************");
        System.out.println("Pair sum optimized Response");
        System.out.println("*****************************");
        int[][] pairs2 = TwoSumOptimized(arr, 6);
        for (int[] pair : pairs2){
            System.out.println(Arrays.toString(pair));
        }
        System.out.println("***************************8");

    }
}
