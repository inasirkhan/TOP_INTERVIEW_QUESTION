package top150.interview;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void twoSum(int[] arr, int sum){
        int left =0;
        int right = arr.length-1;
        for (int i =0;i<arr.length;i++){
            if (arr[left]+arr[right]==sum){
                System.out.println("{"+arr[left]+", "+arr[right]+"}");
                return;
            } else if (arr[left]+arr[right]<sum) {
                left++;
            }
            else {
                right--;
            }
        }
    }

    static void twoSumPractice(int[] arr, int sum){
        int n = arr.length;
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            if (arr[left]+arr[right]==sum){
                System.out.println("left = "+arr[left]+"  , right = "+ arr[right]);
                left++;
                right--;
            }
            else if (arr[left]+arr[right]<sum){
                left++;
            }
            else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,7,1,11,15};
        Arrays.sort(arr);
        int target = 13;
        twoSumPractice(arr, target);
    }
}
