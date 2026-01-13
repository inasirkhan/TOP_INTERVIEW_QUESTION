package top150.practice2;

import java.util.Arrays;

public class ReverseLogic {

    public static void reverse(int[] arr , int left, int right){
        int temp = 0;
        while(left<right){
            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,7,3,2};
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
