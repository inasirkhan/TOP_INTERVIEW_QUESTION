package top150.practice2;

import java.util.Arrays;

public class AllowOnlyTwoConcectiveDuplicates {

    public static void onlyTwoDuplicates(int[] arr){
        int n = arr.length;
        int j=1;
        for (int i=1;i<n-1;i++){
            if (j==1 || arr[i]!=arr[j-2]){
                arr[j++]= arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,6,6,7,7,7,2,3,2,2,4,3,7,8};
        onlyTwoDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }
}
