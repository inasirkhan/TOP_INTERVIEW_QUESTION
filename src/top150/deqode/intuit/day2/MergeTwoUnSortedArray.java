package top150.deqode.intuit.day2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnSortedArray {

    public static void main(String[] args) {
        int[] arr = {4,6,2,1,3,8};
        int[] arr2 = {2,9,5,-1,7,8};

        int[] array = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
