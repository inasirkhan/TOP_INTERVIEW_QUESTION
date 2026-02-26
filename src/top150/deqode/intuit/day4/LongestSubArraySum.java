package top150.deqode.intuit.day4;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArraySum {

    public static void main(String[] args) {
        int[] arr = {5,7,3,2,4,1,6};
//        int i = longestSubArrayWithGiveSum(arr, 11);
        int i = longestSubArrayWithGiveSum(arr, 13);
        System.out.println(i);

    }

    private static int longestSubArrayWithGiveSum(int[] arr, int sum) {

        int n = arr.length;
        int current = 0;
        int maxLen = 0;
        int start = 0,end =0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            current += arr[i];

            // Case 1: subarray starts from index 0
            if (current == sum) {
                end = i;
                maxLen = Math.max(maxLen, end-start+1);
                System.out.println("start : 0 and end : " + i);
            }

            // Case 2: subarray exists in between
            if (map.containsKey(current - sum)) {
                start = map.get(current - sum) + 1;
                end = i;
                maxLen = Math.max(maxLen, end - start + 1);
                System.out.println("start : " + start + " and end : " + end);
            }

            // Store first occurrence only
            map.put(current, i);
        }

        int[] ints = Arrays.copyOfRange(arr, start, end + 1);
        System.out.println(Arrays.toString(ints));
        return maxLen;
    }

    private static int longestSubArraySum(int[] arr, int k) {
        int n = arr.length;
        int currentCum = arr[0];
        int maxSoFar = arr[0];
        for (int i =1;i<n;i++){
            currentCum = Math.max(currentCum,arr[i]+currentCum);
            maxSoFar = Math.max(currentCum, maxSoFar);
        }
        return maxSoFar;
    }
}
