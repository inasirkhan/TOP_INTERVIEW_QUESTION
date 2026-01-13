package top150.practice3;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        doBinarySearch(arr, 4);
    }

    private static void doBinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]== key){
                System.out.println("ELEMENT FOUND AT INDEX : "+mid);
                return;
            }
            else if (key> arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

    }
}
