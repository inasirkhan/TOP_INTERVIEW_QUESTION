package top150.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PairWithGivenSum {

    public static  class Pair{
        int first;
        int second;

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "{"+ first +
                    "," + second +
                    '}';
        }
    }

    public static int[] pariWithGivenSum(int[] arr, int sum){
        Arrays.sort(arr);
        int left =0, right = arr.length-1;
        while (left<right){
            if (arr[left]+arr[right]==sum){
                return new int[]{arr[left], arr[right]};
            }
            else if (arr[left]+arr[right]<sum){
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static Pair[] allPairWithGivenSum(int[] arr,int sum){
        ArrayList<Pair> pairs = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int remaining = sum - arr[i];
            if (map.containsKey(remaining)){
                Pair pair = new Pair(map.get(remaining), i);
                pairs.add(pair);
                if (map.get(remaining)==1){
                    map.remove(remaining);
                }
                else {
                    map.put(remaining, map.get(remaining)-1);
                }
            }
            else {
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }
            map.put(arr[i], i);
        }
        System.out.println(map);
        return  pairs.toArray(new Pair[pairs.size()]);
    }

    public static void main(String[] args) {
        int[] arr = {4,-1,3,6,-3,2};
        int sum = 5;
        System.out.println(Arrays.toString(arr));
//        System.out.println("Pair with given sum : "+sum+" are : "+Arrays.toString(pariWithGivenSum(arr,5)));
        System.out.println("Pair with given sum : "+sum+" are : "+Arrays.toString(allPairWithGivenSum(arr,5)));
    }
}
