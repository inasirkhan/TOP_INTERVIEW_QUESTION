package top150.deqode.intuit;

import java.util.Arrays;

public class ShiftZerosToTheEnd {

    public static void main(String[] args) {
        int[] arr = {5,0,2,5,3,0,1,0,2,1,0,9};
        shiftZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shiftZeroes(int[] arr) {
        int n = arr.length;
        int j = 0;
        int countZero = 0;
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                arr[j++] = arr[i];
            }

        }
        while (j<n){
            arr[j++] = 0;
        }
    }
}
