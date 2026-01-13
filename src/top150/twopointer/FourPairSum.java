package top150.twopointer;

import java.util.Arrays;

public class FourPairSum {

    public static void fourPairSum(int[] arr, int sum){
        Arrays.sort(arr);
        for (int i=0;i<arr.length-4;i++){

            for (int j=i+1;j<arr.length-3;j++){

                int left = j+1;
                int right = arr.length-1;

                if (arr[i]+arr[j]+arr[left]+arr[right]==sum){
                    System.out.println(arr[i]+", "+arr[j]+", "+arr[left]+", "+arr[right]);
                    left++;
                    right--;
                } else if (arr[i]+arr[j]+arr[left]+arr[right]<sum) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,-1,2,-3,5,8,2,-2};
        fourPairSum(arr,12);
    }
}
