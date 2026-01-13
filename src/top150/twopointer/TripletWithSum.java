package top150.twopointer;

import java.util.Arrays;

public class TripletWithSum {

    public static void tripletWithGivenSum(int[] arr, int sum){
        Arrays.sort(arr);
        for (int i=0;i<arr.length-3;i++){
            int left =i+1;
            int right =arr.length-1;
            if (i!=0 && arr[i]==arr[i-1]){
                continue;
            }
            while (left<right){
                if (arr[left]+arr[right]+arr[i]==sum){
                    System.out.println(arr[left]+", "+arr[right]+", "+arr[i]);
                    left++;
                    right--;
                } else if (arr[left]+arr[right]+arr[i]<sum){
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
        tripletWithGivenSum(arr,12);
    }
}
