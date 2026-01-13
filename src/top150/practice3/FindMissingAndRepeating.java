package top150.practice3;

import java.util.Arrays;

public class FindMissingAndRepeating {

    public static void findMissingAndRepeating(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int repeating = -1;
        int missing = -1;

        // Find repeating
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                repeating = arr[i];
                break;
            }
        }

        // Find missing
        int expected = 1;
        for(int i=0;i<n;i++){
            if (arr[i]==expected){
                expected++;
            }
            else if (arr[i]>expected){
                missing = expected;
                break;
            }
        }
        System.out.println("Missing : "+missing+" and Repeating :"+repeating);
    }

    public static void main(String[] args) {
		int[] arr = {6,4,3,5,5,1};
        findMissingAndRepeating(arr);
    }
}
