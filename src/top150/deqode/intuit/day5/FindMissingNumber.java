package top150.deqode.intuit.day5;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,4,2};
        int n = arr.length;
        int missing = findMissing(arr);
        System.out.println(missing);
    }

    private static int findMissing(int[] arr) {
        int missing =-1;
        int n = arr.length;
        Arrays.sort(arr);
        int expected = 1;
        for (int i=0;i<n;i++){
            if (arr[i] == expected){
                expected++;
            }
            else if (arr[i]>expected){
                missing = expected;
            }
        }

        return missing;
    }
}
