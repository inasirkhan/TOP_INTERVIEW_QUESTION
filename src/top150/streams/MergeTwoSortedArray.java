package top150.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] sortedArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));
    }
}
