package top150.deqode.intuit.day2;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 1, 2};
        int missingNumber = findMissingNumber(arr);
        System.out.println(missingNumber);
        System.out.println(findMissingNumber2(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int expected = 1;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == expected) {
                expected++;
            }
            if (arr[i] > expected) {
                return expected;
            }
        }
        return -1;
    }

    private static int findMissingNumber2(int[] arr) {
        int n = arr.length+1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        return (int)expectedSum - actualSum;
    }
}
