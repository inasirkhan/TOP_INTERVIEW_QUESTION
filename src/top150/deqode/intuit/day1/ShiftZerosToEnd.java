package top150.deqode.intuit.day1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ShiftZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0,5,0,1,3,5,0,2,0};
        int[] array = IntStream.concat(Arrays.stream(arr).filter(n -> n != 0), Arrays.stream(arr).filter(n -> n == 0)).toArray();
        System.out.println(Arrays.toString(array));
    }
}
